/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Aluno;
import java.util.ArrayList;
import persistence.AlunoPersistence;

/**
 *
 * @author lucasfernandes
 */
public class AlunoController {

    public static ArrayList<Aluno> searchAluno(Aluno aluno) {
        
        
        ArrayList<Aluno> newListAluno = AlunoPersistence.searchAluno(aluno);
        
        return newListAluno;
    }
    
}