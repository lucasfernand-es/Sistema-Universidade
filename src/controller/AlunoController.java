/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Aluno;
import VO.ValueObject;
import static controller.TypeData.ALUNO;
import java.util.List;
import persistence.DAO.AlunoPersDAO;

/**
 *
 * @author lucasfernandes
 */
public class AlunoController extends BaseController {
    
    public AlunoController()
    {
        super.setType(ALUNO);
        super.setInstance();
    }

    
    public List<ValueObject> searchAluno(Aluno aluno, int type) {
        
        AlunoPersDAO alunoPersDAO = (AlunoPersDAO) super.getBasePersDAO();
        
        return alunoPersDAO.searchAluno(aluno, type);
        
    }

}
