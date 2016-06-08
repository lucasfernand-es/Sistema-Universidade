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
public class Turma extends ValueObject implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_turma;
    
    @ManyToOne
    private Professor professor;
    @ManyToOne
    private Disciplina disciplina;
    
    private String ano_semestre;

    /**
     * @return the id_turma
     */
    public long getId_turma() {
        return id_turma;
    }

    /**
     * @param id_turma the id_turma to set
     */
    public void setId_turma(long id_turma) {
        this.id_turma = id_turma;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
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
     * @return the semestre_ano
     */
    public String getAno_semestre() {
        return ano_semestre;
    }

    /**
     * @param semestre_ano the semestre_ano to set
     */
    public void setSemestre_ano(String ano_semestre) {
        this.ano_semestre = ano_semestre;
    }

    @Override
    public long getId() {
        return this.getId_turma();
    }

    @Override
    public void setId(long id) {
        this.id_turma = id;
    }
    
}
