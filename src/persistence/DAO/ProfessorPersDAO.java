/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;

import VO.Professor;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public interface ProfessorPersDAO {

    public abstract boolean registryProfessor(Professor professor);

    public abstract List<Professor> searchProfessor();

    public abstract boolean updateProfessor(Professor professor);

    public abstract boolean removeProfessor(int idProfessor);
    
}
