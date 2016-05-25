/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;

import VO.Aluno_Disciplina;
import VO.Disciplina;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public interface DisciplinaPersDAO {
    public abstract List<Disciplina> searchDisciplina(Aluno_Disciplina aluno_Disciplina);
}
