/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.Aluno;
import VO.Aluno_Disciplina;
import VO.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.DisciplinaPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class DisciplinaPersDAOMySQL implements DisciplinaPersDAO{
    
    @Override
    public List<Disciplina> searchDisciplina(Aluno_Disciplina aluno_Disciplina)
    {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        String qString = "SELECT d FROM Disciplina d "
                            + "WHERE d.id_disciplina in ("
                                + "SELECT ad.id_disciplina FROM Aluno_Disciplina ad "
                                    + "WHERE ad.ano_semestre = '" + aluno_Disciplina.getAno_semestre() + "' AND "
                                    + "     ad.id_aluno in ("
                                                + "SELECT a.id_aluno FROM Aluno a "
                                                    + "WHERE a.nome = '" + aluno_Disciplina.getAluno().getNome() +  "' "
                                    + ")" 
                        + ")";
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
}
