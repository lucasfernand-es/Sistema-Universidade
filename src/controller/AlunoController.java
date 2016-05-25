/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Aluno;
import java.util.ArrayList;
import java.util.List;
import persistence.DAO.DAOFactory;

/**
 *
 * @author lucasfernandes
 */
public class AlunoController {

    public static List<Aluno> searchAluno(Aluno aluno, int type) {
        
        
        List<Aluno> newListAluno = DAOFactory.buscarInstancia().getAlunoPersDAO().searchAluno(aluno, type);        
        return newListAluno;
    }
    
}
