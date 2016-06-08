/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Aluno;
import VO.Disciplina;
import VO.Matricula;
import VO.Turma;
import static controller.Util.TypeData.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasfernandes
 */
public class AlunoController extends BaseController {
    
    public AlunoController()
    {
        super(ALUNO);
    }

    public List<Disciplina> getDisciplinas(Aluno alunoVO) {
        
        return getDisciplinas(alunoVO, null, -1);
    }
    
    private List<Disciplina> getDisciplinas(Aluno alunoVO, String ano_semestre, int type) {
        List<Disciplina> disciplinas = new ArrayList();
        
        for(Matricula matricula: alunoVO.getMatriculas())
        {
            Turma turma = matricula.getTurma();
            switch(type)
            {
                case 0:
                    if(!turma.getAno_semestre().equals(ano_semestre))
                        continue;
                    break;
                default:
                    break;
            }
            
            disciplinas.add(turma.getDisciplina());
        }
        
        return disciplinas;
    }

    public List<Disciplina> getDisciplinas(Aluno alunoVO, String ano_semestre) {
        
        return (ano_semestre.equals("Selecione..."))? getDisciplinas(alunoVO): getDisciplinas(alunoVO, ano_semestre, 0);
    }
    

}
