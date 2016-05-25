/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author lucasfernandes
 */
@Entity
public class Aluno_Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_aluno_disciplina;
    private int id_aluno;
    private int id_disciplina;
    private String ano_semestre;
    
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Disciplina disciplina;

    /**
     * @return the id_aluno_disciplina
     */
    public long getId_aluno_disciplina() {
        return id_aluno_disciplina;
    }

    /**
     * @param id_aluno_disciplina the id_aluno_disciplina to set
     */
    public void setId_aluno_disciplina(long id_aluno_disciplina) {
        this.id_aluno_disciplina = id_aluno_disciplina;
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    /**
     * @return the id_disciplina
     */
    public int getId_disciplina() {
        return id_disciplina;
    }

    /**
     * @param id_disciplina the id_disciplina to set
     */
    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    /**
     * @return the ano_semestre
     */
    public String getAno_semestre() {
        return ano_semestre;
    }

    /**
     * @param ano_semestre the ano_semestre to set
     */
    public void setAno_semestre(String ano_semestre) {
        this.ano_semestre = ano_semestre;
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
    
    
}
