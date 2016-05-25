/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.AlunoPersDAO;

/**
 *
 * @author lucasfernandes
 */
public class AlunoPersDAOMySQL implements AlunoPersDAO {

    @Override
    public List<Aluno> searchAluno(Aluno aluno, int type) {
        
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        String qString = null;
        switch(type)
        {
            case 1: 
                qString = "SELECT a FROM Aluno a WHERE a.nome like '%" + aluno.getNome() +"%'";
                break;
            case 2: 
                qString = "SELECT a FROM Aluno a WHERE a.nome = '" + aluno.getNome() +"'";
                break;
            default: 
                qString = "";
                break;
        }
        
        
  
        TypedQuery<Aluno> q = em.createQuery(qString, Aluno.class);
        List<Aluno> results = null;

        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            System.out.println("Error " + ex.getMessage());
            return null;
        } finally {
            em.close();
        }
        return results;
        

        
       // MysqlDAOFactory.getMysqlEntityFactory()
       //return null;
    }

 
    
}
