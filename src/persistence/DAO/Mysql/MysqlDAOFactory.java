/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistence.DAO.*;

/**
 *
 * @author viniciuscustodio
 */
public class MysqlDAOFactory extends DAOFactory{

    
    private static final EntityManagerFactory EMF
            = Persistence.createEntityManagerFactory("MySQLUniversity");
    
    public MysqlDAOFactory()
    {
        
    }

    public static EntityManagerFactory getMysqlEntityFactory() {
        return EMF;
    }
    
    @Override
    public AlunoPersDAO getAlunoPersDAO() {
        return new AlunoPersDAOMySQL();
    }

    @Override
    public ProfessorPersDAO getProfessorPersDAO() {
        return new ProfessorPersDAOMySQL();
    }

    @Override
    public DisciplinaPersDAO getDisciplinaPersDAO() {
        return new DisciplinaPersDAOMySQL();
    }
    

    @Override
    public TurmaPersDAO getTurmaPersDAO() {
       return new TurmaPersDAOMySQL();
    }

    @Override
    public MatriculaPersDAO getMatriculaPersDAO() {
        return new MatriculaPersDAOMySQL();
    }
    
    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    
}
