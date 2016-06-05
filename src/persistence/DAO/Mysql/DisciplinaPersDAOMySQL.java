/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;


import VO.Aluno_Disciplina;
import VO.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.DisciplinaPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class DisciplinaPersDAOMySQL implements DisciplinaPersDAO{
    
    
    private List<Disciplina> search(String qString)
    {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
       
        //System.out.println(qString);
        TypedQuery<Disciplina> q = em.createQuery(qString, Disciplina.class);
        List<Disciplina> results = null; //teste

        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            System.out.println("Error " + ex.getMessage());
            return null;
        } finally {
            em.close();
        }
        return results;
    }
    
    @Override
    public List<Disciplina> searchDisciplina(Aluno_Disciplina aluno_Disciplina)
    {
        String qString = "SELECT d FROM Disciplina d "
                            + "WHERE d.id_disciplina in ("
                                + "SELECT ad.id_disciplina FROM Aluno_Disciplina ad "
                                    + "WHERE ad.ano_semestre = '" + aluno_Disciplina.getAno_semestre() + "' AND "
                                    + "     ad.id_aluno in ("
                                                + "SELECT a.id_aluno FROM Aluno a "
                                                    + "WHERE a.nome = '" + aluno_Disciplina.getAluno().getNome() +  "' "
                                    + ")" 
                        + ")";
         
        return this.search(qString);
        
    }

    @Override
    public List<Disciplina> searchDisciplina() {
        String qString = "SELECT d FROM Disciplina d ";
         
        return this.search(qString);
    }

    @Override
    public Boolean registryDisciplina(Disciplina disciplina) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            //em.persist(disciplina.getProfessor());
            em.persist(disciplina);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            em.close();
        }
        return true;
    }

    @Override
    public Boolean deleteDisciplina(Disciplina disciplina) {
        
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try {
            
            Disciplina query = em.find(Disciplina.class, disciplina.getId_disciplina());
            em.remove(query);
            
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            em.close();
        }
        return true;    
    }

    @Override
    public Boolean updateDisciplina(Disciplina disciplina) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(disciplina);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            em.close();
        }
        return true;
    }
}
