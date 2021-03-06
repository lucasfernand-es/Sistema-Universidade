/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import controller.Util.TypeData;
import VO.*;
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
    
   
    
    public BaseController(TypeData type)
    {
        this.type = type;
        
        setCurrentInstance();
    }
    
    public BaseController()
    {
    }

     public void setCurrentInstance()
    {
        switch(getType())
        {
            case ALUNO:
                setBasePersDAO(DAOFactory.buscarInstancia().getAlunoPersDAO());
                break;
            case PROFESSOR:
                setBasePersDAO(DAOFactory.buscarInstancia().getProfessorPersDAO());
                break;
            case DISCIPLINA:
                setBasePersDAO(DAOFactory.buscarInstancia().getDisciplinaPersDAO());
                break;
            case TURMA:
                setBasePersDAO(DAOFactory.buscarInstancia().getTurmaPersDAO());
                break;
            case MATRICULA:
                setBasePersDAO(DAOFactory.buscarInstancia().getMatriculaPersDAO());
                break;
            default:
                break;
                
        }
    }
    public List search() {
        
        return getBasePersDAO().search(this.getType());
    }
    
    
    public List search(ValueObject valueObject) {
        
        return getBasePersDAO().search(valueObject);
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

    public TypeData getType() {
        return type;
    }


    public void setType(TypeData type) {
        this.type = type;
    }

    public BasePersDAO getBasePersDAO() {
        return basePersDAO;
    }

    public void setBasePersDAO(BasePersDAO basePersDAO) {
        this.basePersDAO = basePersDAO;
    }

    

}
