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
public class Disciplina {
    private int id_disciplina;
    private String nome;
    private int periodo;
    private int carga_horaria;
    private String ementa;
    private Professor professor;

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
    
}
