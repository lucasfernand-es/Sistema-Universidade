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
    
    public static final int mysql = 1;
    
    public abstract AlunoPersDAO getAlunoPersDAO();
    public abstract Aluno_DisciplinaPersDAO getAluno_DisciplinaPersDAO();
    public abstract ProfessorPersDAO getProfessorPersDAO();
    public abstract DisciplinaPersDAO getDisciplinaPersDAO();
    public abstract TurmaPersDAO getTurmaPersDAO();

    public static DAOFactory buscarInstancia(int fabrica) {
        
        switch(fabrica) {
            
            case mysql:
                return new MysqlDAOFactory();
            
            default:
                return null;
        }
    }
    
    
    
    public static DAOFactory buscarInstancia() {
        
        return buscarInstancia(1);
    }    

}
