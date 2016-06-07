/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;


import VO.*;
import controller.TypeData;
import controller.TypeDataOperation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.BasePersDAO;
import view.ViewHelper;

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
    
    @Override
    public boolean delete(ValueObject vo) {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try {
            ValueObject query = em.find(vo.getClass(), vo.getId());
            em.remove(query);
            
            trans.commit();
        } catch (Exception ex) {
            ViewHelper.errorMessage(ex.getMessage());
            return false;
        } finally {
            em.close();
        }
        return true;
    }
    
    
    public List search(Class classType, String query)
    {
        EntityManager em = MysqlDAOFactory.getMysqlEntityFactory().createEntityManager();
        TypedQuery q = em.createQuery(query, classType);
        List results = null;

        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            em.close();
        }
        return results;
    }
    
   
    @Override
    public List search(TypeData typeData) {
        String query = "SELECT x FROM " + TypeDataOperation.getTypeDataString(typeData) + " x";
        
        return this.search( TypeDataOperation.getTypeDataClass(typeData) , query);
    }
    
    

    @Override
    public List search(ValueObject vo) {
        String query = "SELECT x FROM " + vo.getClass() + " x";
        System.out.println("é pra dar errado mexxxmo | search - BasePersMYSQL");
        return this.search(vo.getClass(), query);
    }


    
    

    
    
}
