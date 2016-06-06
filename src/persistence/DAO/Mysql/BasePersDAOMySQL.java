/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;


import VO.ValueObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.BasePersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class BasePersDAOMySQL implements BasePersDAO {

    
    @Override
    public boolean registry(ValueObject vo) {
        
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(vo);
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
    public boolean update(ValueObject vo) {
        
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(vo);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            em.close();
        }
        return true;
        
    }
    
    public List search(ValueObject vo, String qString)
    {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        TypedQuery q = em.createQuery(qString, vo.getClass());
        List results = null;

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
    public List search() {
        String qString = "";
        
        return this.search((ValueObject) new Object(), qString);
    }

    
    @Override
    public boolean delete(ValueObject vo) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try {
            
            ValueObject query = em.find(vo.getClass(), vo.getId());
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
    
}
