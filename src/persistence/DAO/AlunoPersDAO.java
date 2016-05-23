/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;

import VO.Aluno;
import java.util.ArrayList;

/**
 *
 * @author viniciuscustodio
 */
public interface AlunoPersDAO {
    public abstract ArrayList<Aluno> searchAluno(Aluno aluno);

}
