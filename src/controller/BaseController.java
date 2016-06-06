/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import VO.ValueObject;
import java.util.List;
import persistence.DAO.BasePersDAO;
import persistence.DAO.DAOFactory;

/**
 *
 * @author lucasfernandes
 */
public class BaseController {
    
    private TypeData type;
    private BasePersDAO basePersDAO;
    
    public BasePersDAO setInstance()
    {
        switch(getType())
        {
            case ALUNO:
                setBasePersDAO(DAOFactory.buscarInstancia().getAlunoPersDAO());
                break;
            case PROFESSOR:
                break;
            default:
                break;
                
        }
        return null;
    }
    
    public BaseController(TypeData type)
    {
        this.type = type;
    }
    
    public BaseController()
    {
    }

    public List search() {
        return getBasePersDAO().search();
    }

    public boolean registry(ValueObject vo) {
        return getBasePersDAO().registry(vo);
    }
    
    public boolean update(ValueObject vo){
        return getBasePersDAO().update(vo);
    }

    public Boolean delete(ValueObject vo) {
        return getBasePersDAO().delete(vo);
    }

    /**
     * @return the type
     */
    public TypeData getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeData type) {
        this.type = type;
    }

    /**
     * @return the basePersDAO
     */
    public BasePersDAO getBasePersDAO() {
        return basePersDAO;
    }

    /**
     * @param basePersDAO the basePersDAO to set
     */
    public void setBasePersDAO(BasePersDAO basePersDAO) {
        this.basePersDAO = basePersDAO;
    }
    

}
