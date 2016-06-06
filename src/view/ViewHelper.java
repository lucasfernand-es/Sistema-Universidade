/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import VO.Aluno;
import VO.ValueObject;
import controller.BaseController;
import controller.TypeData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucasfernandes
 */
public class ViewHelper {
    
    public static void populateTableAll(JTable jTable, BaseController baseController, TypeData type) {
        
        List data = baseController.search();
        

        // Atualizando a tabela
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);

        switch(type)
        {
            case ALUNO:
                
                for(Object valueObject: data)
                {
                    Aluno aluno = (Aluno) valueObject;
                    model.addRow(new Object[]{
                            
                    });
                }
                
                break;
            default:
                break;
        }
    }
    
    private ArrayList createRowArgs(Object valueObject, TypeData type)
    {
        ArrayList args = new ArrayList();
        switch(type)
        {
            case ALUNO:
                Aluno aluno = (Aluno) valueObject;
                
                args.add(aluno.getRa());
                args.add(aluno.getNome());
                args.add(valueObject);
                args.add(valueObject);
                args.add(valueObject);
                args.add(valueObject);
                args.add(valueObject);
                
                aluno.getRa(), aluno.getNome(), aluno.getTelefone(), aluno.getNome_curso(),
                            aluno.getPeriodo(), aluno.getTurno(), aluno.getCoeficiente()
                
                break;
            default:
                break;
                
        }
        return args;
    }
    
}
