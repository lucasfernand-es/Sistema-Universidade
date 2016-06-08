/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author lucasfernandes
 */
@Entity
public class Aluno extends ValueObject implements Serializable {

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_aluno;
    private int ra;
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ingresso;
    private int periodo;
    private float coeficiente;
    private String situacao;
    private String nome_curso;
    private String turno;
    private String telefone;

    
    

    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ingresso
     */
    public Date getIngresso() {
        return ingresso;
    }

    /**
     * @param ingresso the ingresso to set
     */
    public void setIngresso(Date ingresso) {
        this.ingresso = ingresso;
    }

    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the coeficiente
     */
    public float getCoeficiente() {
        return coeficiente;
    }

    /**
     * @param coeficiente the coeficiente to set
     */
    public void setCoeficiente(float coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the nome_curso
     */
    public String getNome_curso() {
        return nome_curso;
    }

    /**
     * @param nome_curso the nome_curso to set
     */
    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }



    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the id_aluno
     */
    public long getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(long id_aluno) {
        this.id_aluno = id_aluno;
    }

    @Override
    public long getId() {
        return this.getId_aluno();
    }

    @Override
    public void setId(long id) {
        this.setId_aluno(id);
    }
    
    @Override
    public String toString()
    {
        return this.getNome() + " - " + this.getRa();
    }

    /**
     * @return the matriculas
     */
    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    /**
     * @param matriculas the matriculas to set
     */
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

}
