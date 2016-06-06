/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO;


import VO.ValueObject;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public interface BasePersDAO {

    public abstract List search();

    public abstract boolean registry(ValueObject vo);

    public abstract boolean update(ValueObject vo);

    public abstract boolean delete(ValueObject vo);

}
