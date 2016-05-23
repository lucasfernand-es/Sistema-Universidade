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
public class Professor {
    private int id_professor;
    private String nome;

    /**
     * @return the id_professor
     */
    public int getId_professor() {
        return id_professor;
    }

    /**
     * @param id_professor the id_professor to set
     */
    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
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
}
