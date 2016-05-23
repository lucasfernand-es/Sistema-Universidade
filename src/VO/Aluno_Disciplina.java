/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author lucasfernandes
 */
public class Aluno_Disciplina {
    
    private int id_aluno_disciplina;
    private Aluno aluno;
    private Disciplina disciplina;
    private int ano;
    private int semestre;

    /**
     * @return the id_aluno_disciplina
     */
    public int getId_aluno_disciplina() {
        return id_aluno_disciplina;
    }

    /**
     * @param id_aluno_disciplina the id_aluno_disciplina to set
     */
    public void setId_aluno_disciplina(int id_aluno_disciplina) {
        this.id_aluno_disciplina = id_aluno_disciplina;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
