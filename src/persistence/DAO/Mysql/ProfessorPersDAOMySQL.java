/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.Aluno;
import VO.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.ProfessorPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class ProfessorPersDAOMySQL implements ProfessorPersDAO {

    @Override
    public boolean registryProfessor(Professor professor) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(professor);
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
    public List<Professor> searchProfessor() {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        String qString = "SELECT p from Professor p";
        TypedQuery<Professor> q = em.createQuery(qString, Professor.class);
        List<Professor> results = null;

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
    public boolean updateProfessor(Professor professor) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            
            Professor queryProfessor = em.find(Professor.class, professor.getId_professor());
            
            queryProfessor.setCpf(professor.getCpf());
            queryProfessor.setDataNascimento(professor.getDataNascimento());
            queryProfessor.setRg(professor.getRg());
            queryProfessor.setNome(professor.getNome());
            queryProfessor.setEmail(professor.getEmail());
            queryProfessor.setStatus(professor.getStatus());
            
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
    public boolean removeProfessor(int idProfessor) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try {
            
            Professor queryProfessor = em.find(Professor.class, idProfessor);
            em.remove(queryProfessor);
            
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
