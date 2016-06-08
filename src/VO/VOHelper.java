/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.Date;

/**
 *
 * @author viniciuscustodio
 */
public class VOHelper {
    public static Professor createProfessorVO(String nome, String cpf, String rg, Date dataNascimento, String email, String status){
        Professor p = new Professor();
        
        p.setCpf(cpf);
        p.setNome(nome);
        p.setRg(rg);
        p.setDataNascimento(dataNascimento);
        p.setEmail(email);
        p.setStatus(p.isStatusBoolean(status));
        
        return p;
    }

    public static Aluno createAlunoVO(String ra, String periodo, String curso, String nome, 
            String coeficiente, String turno, Date dateIngresso, String situacao, String telefone) {
        Aluno aluno = new Aluno();
        
        aluno.setRa(Integer.parseInt(ra));
        aluno.setPeriodo(Integer.parseInt(periodo));
        aluno.setNome_curso(curso);
        aluno.setNome(nome);
        aluno.setCoeficiente(Float.parseFloat(coeficiente));
        aluno.setTurno(turno);
        aluno.setIngresso(dateIngresso);
        aluno.setSituacao(situacao);
        aluno.setTelefone(telefone);
        
        return aluno;
    }

    public static Disciplina createDisciplinaVO(String nome, int periodo, int cargaHoraria, String ementa, String status) {
        Disciplina disciplina = new Disciplina();
        
        disciplina.setNome(nome);
        disciplina.setPeriodo(periodo);
        disciplina.setCarga_horaria(cargaHoraria);
        disciplina.setEmenta(ementa);
        disciplina.setStatus(disciplina.isStatusBoolean(status));
        
        return disciplina;
    }
    
    public static Turma createTurmaVO(Disciplina disciplina, Professor professor, String ano_semestre) {
        Turma turma = new Turma();
        
        turma.setDisciplina(disciplina);
        turma.setProfessor(professor);
        turma.setSemestre_ano(ano_semestre);
        
        return turma;
    }

}
