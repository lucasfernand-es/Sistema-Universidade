/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Util;

import VO.*;

/**
 *
 * @author lucasfernandes
 */
public final class TypeDataOperation {
    
    public static String getTypeDataBaseString(TypeData typeData)
    {
        switch(typeData)
        {
            case ALUNO:
                return "Aluno";
            case PROFESSOR:
                return "Professor";
            case DISCIPLINA:
                return "Disciplina";
            case TURMA:
                return "Turma";
            case MATRICULA:
                return "Matricula";
        }
        return "";
    }
    
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
            case TURMA:
                return "Turma";
            case MATRICULA:
                return "Matrícula";
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
            case MATRICULA:
                return Matricula.class;
            default:
                return Object.class;
        }
    }
    
    public static boolean isClassOfTypeData(TypeData typeData, ValueObject valueObject)
    {
        return getTypeDataClass(typeData) == valueObject.getClass();
    }
}
