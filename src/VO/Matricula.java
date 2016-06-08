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
public class Matricula extends ValueObject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_matricula;
    private double nota;
    
    
    @ManyToOne
    private Aluno aluno;
    
    @ManyToOne
    private Turma turma;

    @Override
    public long getId() {
        return this.getId_matricula();
    }

    @Override
    public void setId(long id) {
        this.setId_matricula(id);
    }

    /**
     * @return the id_matricula
     */
    public long getId_matricula() {
        return id_matricula;
    }

    /**
     * @param id_matricula the id_matricula to set
     */
    public void setId_matricula(long id_matricula) {
        this.id_matricula = id_matricula;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
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
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }



   

}
