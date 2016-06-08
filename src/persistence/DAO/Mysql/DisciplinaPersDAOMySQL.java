/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.Mysql;

import VO.*;
import java.util.List;
import persistence.DAO.DisciplinaPersDAO;



/**
 *
 * @author viniciuscustodio
 */
public class DisciplinaPersDAOMySQL extends BasePersDAOMySQL implements DisciplinaPersDAO{
    
        @Override
        public List search(ValueObject vo)
        {
            String query = "";
            if(vo.getClass().isInstance( new Matricula() ))
            {
                query = "SQL qualquer";
            }
            return super.search(vo.getClass(), query);
        }
    
}
