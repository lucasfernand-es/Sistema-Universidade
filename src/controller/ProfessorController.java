/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Professor;
import java.util.List;
import persistence.DAO.DAOFactory;

/**
 *
 * @author viniciuscustodio
 */
public class ProfessorController {
 
    public boolean registryProfessor(Professor professor){
        return DAOFactory.buscarInstancia().getProfessorPersDAO().registryProfessor(professor);
    }

    public List<Professor> searchProfessor() {
        return DAOFactory.buscarInstancia().getProfessorPersDAO().searchProfessor();
    }

    public boolean updateProfessor(Professor professor) {
        return DAOFactory.buscarInstancia().getProfessorPersDAO().updateProfessor(professor);
    }

    public boolean removeProfessor(int idProfessor) {
        return DAOFactory.buscarInstancia().getProfessorPersDAO().removeProfessor(idProfessor);
    }
}
