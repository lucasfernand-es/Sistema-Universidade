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
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_disciplina;
    private String nome;
    private int periodo;
    private int carga_horaria;
    private String ementa;
    private long id_professor;
    

    /**
     * @return the id_disciplina
     */
    public long getId_disciplina() {
        return id_disciplina;
    }

    /**
     * @param id_disciplina the id_disciplina to set
     */
    public void setId_disciplina(long id_disciplina) {
        this.id_disciplina = id_disciplina;
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
     * @return the carga_horaria
     */
    public int getCarga_horaria() {
        return carga_horaria;
    }

    /**
     * @param carga_horaria the carga_horaria to set
     */
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the id_professor
     */
    public long getId_professor() {
        return id_professor;
    }

    /**
     * @param id_professor the id_professor to set
     */
    public void setId_professor(long id_professor) {
        this.id_professor = id_professor;
    }


}
