/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Professor;
import static controller.TypeData.*;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public class ProfessorController extends BaseController{
 
    public ProfessorController()
    {
        super(PROFESSOR);
        
    }


    
    public int searchProfessor(List<Professor> professors, Professor professor)
    {
        
        for(int i = 0; i < professors.size(); i++)
        {
            if(professors.get(i).getId_professor() == professor.getId_professor())
                return i;
        }
        
        return -1;
    }
}
