/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lucasfernandes
 */
@Entity
public class Disciplina extends ValueObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_disciplina;
    private String nome;
    private int periodo;
    private int carga_horaria;
    private String ementa;
    private boolean status;
    //private long professor_id_professor;
    

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
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String isStatusString()
    {
        return (this.isStatus())? "Ativo": "Inativo";
    }
    
    public boolean isStatusBoolean(String status)
    {
        return (status.equals("Ativo"));
    }

    @Override
    public long getId() {
        return this.id_disciplina;
    }

    @Override
    public void setId(long id) {
        this.id_disciplina = id;
    }


}
