/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.Date;

/**
 *
 * @author viniciuscustodio
 */
public class VOHelper {
    public static Professor createProfessorVO(String nome, String cpf, String rg, Date dataNascimento, String email, String status){
        Professor p = new Professor();
        
        p.setCpf(cpf);
        p.setNome(nome);
        p.setRg(rg);
        p.setDataNascimento(dataNascimento);
        p.setEmail(email);
        p.setStatus(status);
        
        return p;
    }
}
