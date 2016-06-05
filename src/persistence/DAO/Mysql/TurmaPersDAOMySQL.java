/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;


import VO.Aluno;
import VO.Aluno_Disciplina;
import VO.Disciplina;
import VO.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.DisciplinaPersDAO;
import persistence.DAO.TurmaPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class TurmaPersDAOMySQL implements TurmaPersDAO{
    
    
    private List<Turma> search(String qString) 
    {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        TypedQuery<Turma> q = em.createQuery(qString, Turma.class);
        List<Turma> results = null;

        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        return results; 
    }
    
    @Override
    public List<Turma> searchTurma() {
        String qString = "SELECT t from Turma t";
        
        return this.search(qString);
    }

    @Override
    public Boolean registryTurma(Turma turma) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(turma);
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
    public Boolean deleteTurma(Turma turma) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try {
            
            Turma queryTurma = em.find(Turma.class, turma.getId_turma() );
            em.remove(queryTurma);
            
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
    public Boolean updateTurma(Turma turma) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(turma);
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
