/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.*;
import java.util.List;
import persistence.DAO.AlunoPersDAO;

/**
 *
 * @author lucasfernandes
 */
public class AlunoPersDAOMySQL extends BasePersDAOMySQL implements AlunoPersDAO {

    @Override
    public List searchAluno(Aluno aluno, int type) {
        String qString;
        switch (type) {
            case 1:
                qString = "SELECT a FROM Aluno a WHERE a.nome like '%" + aluno.getNome() + "%'";
                break;
            case 2:
                qString = "SELECT a FROM Aluno a WHERE a.nome = '" + aluno.getNome() + "'";
                break;
            default:
                qString = "SELECT a from Aluno a";
                break;
        }
        
        return super.search(Aluno.class, qString);
    }


}
