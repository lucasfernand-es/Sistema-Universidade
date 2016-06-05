/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Turma;
import java.util.List;
import persistence.DAO.DAOFactory;

/**
 *
 * @author lucasfernandes
 */
public class TurmaController {


    public List<Turma> searchTurma() {
     
        List<Turma> newListTurma = DAOFactory.buscarInstancia().getTurmaPersDAO().searchTurma();        
        return newListTurma;
    }

    public Boolean registrarTurma(Turma turma) {
        return DAOFactory.buscarInstancia().getTurmaPersDAO().registryTurma(turma);
    }

    public Boolean deleteTurma(Turma turma) {
        return DAOFactory.buscarInstancia().getTurmaPersDAO().deleteTurma(turma);
    }

    public Boolean updateTurma(Turma turma) {
        return DAOFactory.buscarInstancia().getTurmaPersDAO().updateTurma(turma);
    }
    
}
