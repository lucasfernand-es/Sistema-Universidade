/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.Aluno;
import VO.Professor;
import VO.ValueObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.ProfessorPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class ProfessorPersDAOMySQL extends BasePersDAOMySQL implements ProfessorPersDAO {
    
    @Override
    public List search(ValueObject vo) {
        Professor professor = (Professor) vo;
        
        String qString = "SELECT p from Professor p WHERE p.Nome like '%" + professor.getNome() + "%' ";
        
        return super.search(Professor.class, qString); 
    }

    

}
