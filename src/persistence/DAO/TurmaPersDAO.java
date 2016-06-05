/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;

import VO.Turma;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public interface TurmaPersDAO {
    public abstract List<Turma> searchTurma();

    public abstract Boolean registryTurma(Turma turma);

    public abstract Boolean deleteTurma(Turma turma);

    public abstract Boolean updateTurma(Turma turma);
}
