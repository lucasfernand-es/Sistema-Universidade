/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.Aluno;
import VO.ValueObject;
import static controller.Util.TypeData.ALUNO;
import controller.Util.TypeDataOperation;
import java.util.List;
import persistence.DAO.AlunoPersDAO;

/**
 *
 * @author lucasfernandes
 */
public class AlunoPersDAOMySQL extends BasePersDAOMySQL implements AlunoPersDAO {

    @Override
    public List search(ValueObject vo) {
        Aluno aluno = (Aluno) vo;
        //select nome from aluno where aluno.nome like '%" + this.tAluno.getText() + "%'"
        String query = "SELECT a FROM " + TypeDataOperation.getTypeDataBaseString(ALUNO) + " a "
                + "WHERE a.nome like '%" + aluno.getNome() +"%' ";
        return this.search(vo.getClass(), query);
        
    }

}
