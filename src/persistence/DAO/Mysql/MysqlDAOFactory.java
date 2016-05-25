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
import persistence.DAO.AlunoPersDAO;
import persistence.DAO.Aluno_DisciplinaPersDAO;
import persistence.DAO.DAOFactory;
import persistence.DAO.DisciplinaPersDAO;
import persistence.DAO.ProfessorPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class MysqlDAOFactory extends DAOFactory{

    
    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("MySQLUniversity");
    
    public MysqlDAOFactory()
    {
        
    }

    public static EntityManagerFactory getMysqlEntityFactory() {
        return emf;
    }
    
    @Override
    public AlunoPersDAO getAlunoPersDAO() {
        return new AlunoPersDAOMySQL();
    }
    
    @Override
    public Aluno_DisciplinaPersDAO getAluno_DisciplinaPersDAO() {
        return new Aluno_DisciplinaPersDAOMySQL();
    }

    @Override
    public ProfessorPersDAO getProfessorPersDAO() {
        return new ProfessorPersDAOMySQL();
    }

    @Override
    public DisciplinaPersDAO getDisciplinaPersDAO() {
        return new DisciplinaPersDAOMySQL();
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
