/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;

import VO.Aluno;
import VO.ValueObject;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public interface AlunoPersDAO extends BasePersDAO
{
    
    public abstract List searchAluno(Aluno aluno, int type);
    /*
    public abstract List<Aluno> searchAluno();

    public abstract boolean registryAluno(Aluno aluno);

    public abstract boolean updateAluno(Aluno aluno);

    public abstract boolean deleteAluno(Aluno aluno);
    */
}
