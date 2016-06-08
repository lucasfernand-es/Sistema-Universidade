/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence.DAO;

import persistence.DAO.Mysql.MysqlDAOFactory;

/**
 *
 * @author Vinicius
 */
public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    
    public abstract AlunoPersDAO getAlunoPersDAO();
    public abstract ProfessorPersDAO getProfessorPersDAO();
    public abstract DisciplinaPersDAO getDisciplinaPersDAO();
    public abstract TurmaPersDAO getTurmaPersDAO();
    public abstract MatriculaPersDAO getMatriculaPersDAO();

    public static DAOFactory getInstance(int factory) {
        
        switch(factory) {
            
            case MYSQL:
                return new MysqlDAOFactory();
            
            default:
                return null;
        }
    }
    
    
    
    public static DAOFactory buscarInstancia() {
        
        return getInstance(1);
    }    

}
