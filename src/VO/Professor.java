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
public class Professor extends ValueObject implements Serializable {

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_professor;
    private String nome;
    private String rg;
    private String cpf;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String email;
    private boolean status;

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
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Override
    public String toString()
    {
        return this.getNome();
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
        return this.getId_professor();
    }

    @Override
    public void setId(long id) {
        this.setId_professor(id); 
    }

    /**
     * @return the turmas
     */
    public List<Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas the turmas to set
     */
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    
}
