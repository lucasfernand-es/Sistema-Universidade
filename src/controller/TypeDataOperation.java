/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.*;

/**
 *
 * @author lucasfernandes
 */
public final class TypeDataOperation {
    
    public static String getTypeDataString(TypeData typeData)
    {
        switch(typeData)
        {
            case ALUNO:
                return "Aluno";
            case PROFESSOR:
                return "Professor";
            case DISCIPLINA:
                return "Disciplina";
        }
        return "";
    }
    
    public static Class getTypeDataClass(TypeData typeData)
    {
        switch(typeData)
        {
            case ALUNO:
                return Aluno.class;
            case PROFESSOR:
                return Professor.class;
            case DISCIPLINA:
                return Disciplina.class;
            case TURMA:
                return Turma.class;
            default:
                return Object.class;
        }
    }
}
