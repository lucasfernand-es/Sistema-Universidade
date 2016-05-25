/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Aluno;
import VO.Aluno_Disciplina;
import VO.Disciplina;
import java.util.List;
import persistence.DAO.DAOFactory;

/**
 *
 * @author lucasfernandes
 */
public class DisciplinaController {

    public static List<Disciplina> searchDisciplina(Aluno_Disciplina aluno_Disciplina) {
     
        List<Disciplina> newListDisciplina = DAOFactory.buscarInstancia().getDisciplinaPersDAO().searchDisciplina(aluno_Disciplina);        
        return newListDisciplina;
    }
    
}