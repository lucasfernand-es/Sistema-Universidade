/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Util.TypeDataOperation;
import controller.Util.TypeData;
import view.Util.TypeOperation;
import VO.*;
import controller.*;
import java.util.List;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucasfernandes
 */
public class ViewHelper {
    
    public static List search(BaseController baseController)
    {
        return baseController.search();
    }
    
    public static void populateTableAll(JTable jTable, List data, TypeData type) {
        

        // Atualizando a tabela
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);

        data.stream().forEach((valueObject) -> {
            model.addRow( createRowArgs(valueObject, type) );
        });
    }
    
    private static Object[] createRowArgs(Object valueObject, TypeData type)
    {//return new Object[]{};
        switch(type)
        {
            case ALUNO:
                Aluno aluno = (Aluno) valueObject;
                return new Object[]{ 
                    aluno.getRa(), aluno.getNome(), aluno.getTelefone(), aluno.getNome_curso(), 
                    aluno.getPeriodo(), aluno.getTurno(), aluno.getCoeficiente()};
            case PROFESSOR:
                Professor professor = (Professor) valueObject;
                return new Object[]{ 
                    professor.getNome(), professor.getDataNascimento(), professor.getCpf(),
                    professor.getRg(), professor.getEmail()};
            case DISCIPLINA:
                Disciplina disciplina = (Disciplina) valueObject;
                return new Object[]{
                    disciplina.getNome(), disciplina.getPeriodo(),
                    disciplina.getCarga_horaria(), disciplina.getEmenta() };
            case TURMA:
                Turma turma = (Turma) valueObject;
                return new Object[]{turma.getDisciplina(), turma.getProfessor(), turma.getAno_semestre()};
            case MATRICULA:
                Matricula matricula = (Matricula) valueObject;
                return new Object[]{matricula.getAluno(), matricula.getTurma(), matricula.getNota()};
            default:
                return null;
                
        }
    }
    
    
    public static void showMessage(Boolean isSuccess, TypeOperation typeOperation, TypeData type) {
        
        String title, message;
        String typeData = TypeDataOperation.getTypeDataString(type);
        
        switch (typeOperation) {
            case INSERT:
                title = "Cadastrar";
                message = "cadastrado";
                break;
            case UPDATE:
                title = "Alterar";
                message = "alterado";
                break;
            case REMOVE:
                title = "Remover";
                message = "removido";
                break;
            default:
                title = "";
                message = "";
                break;
        }

        if (isSuccess) {
            JOptionPane.showMessageDialog(null, typeData + " " + message + " com sucesso", title, JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, typeData + " não " + message, title, JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static void iniciarComponentes(FormTemplate frame, TypeData type) {
        
        // Resetar todos os componentes
        frame.blockComponents();
        frame.cleanComponents();
        
        ViewHelper.createTableModel(frame, type);
        frame.updateJTable();
        
        /*
        frame.getJTableSearch().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame.jTBSearchMouseClicked(evt);
            }
        });
        */

         /*
        frame.jTFBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                frame.jTFBuscaKeyTyped(evt);
            }
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frame.jTFBuscaKeyPressed(evt);
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                frame.jTFBuscaKeyReleased(evt);
            }
        });
        */
        
        
        //ViewHelper.createActionListener("Alterar", frame.jBTAlterar, frame);
        //ViewHelper.createActionListener("Salvar", frame.jBTSalvar, frame);
        //ViewHelper.createActionListener("Excluir", frame.jBTExcluir, frame);
        //ViewHelper.createActionListener("Cadastrar", frame.jBTCadastrar, frame);
        //ViewHelper.createActionListener("Confirmar", frame.jBTConfirmar, frame);
        //ViewHelper.createActionListener("Cancelar", frame.jBTCancelar, frame);
        
        frame.jBTCadastrar.setEnabled(true);
    }
    
    private static Object[][] nullObject(int count)
    {
       Object[][] list = new Object[count][count];
       
       for(int i = 0; i < count; i++)
       {
           list[i] = null;
       }
       
       return list;
    }
    
    private static Class[] classTypes(int count)
    {
       Class[] list = new Class[count];
       
       for(int i = 0; i < count; i++)
       {
           list[i] = java.lang.String.class;
       }
       
       return list;
    }
    
    private static boolean[] editableTypes(int count)
    {
       boolean[] list = new boolean[count];
       
       for(int i = 0; i < count; i++)
       {
           list[i] = false;
       }
       
       return list;
    }
    
    private static void createTableModel(FormTemplate frame, TypeData type)
    {
        Object[][] titleNull;
        String[] titleName;
        Class[] classTypes;
        boolean[] editableColumns;
        
        int count = 0;
        switch(type)
        {
            case ALUNO:
                count = 7;
                titleName = new String[]{
                    "RA", "Nome", "Telefone", "Curso", "Periodo", "Turno", "Coeficiente"
                };
                break;
            case PROFESSOR:
                count = 5;
                titleName = new String[]{
                    "Nome", "Data de Nascimento", "CPF", "RG", "E-mail"
                };
                break;
            case DISCIPLINA:
                count = 4;
                titleName = new String[]{
                    "Nome", "Período", "Carga Horária", "Ementa"
                };
                break;
            case TURMA:
                count = 3;
                titleName = new String[]{
                    "Disciplina", "Professor", "Semestre/Ano"
                };
                break;
            case MATRICULA:
                count = 3;
                titleName = new String[]{
                    "Aluno", "Turma", "Nota"
                };
                break;
                
            default:
                titleName = null;
                break;
        }
        
        
        titleNull = ViewHelper.nullObject(count);
        classTypes = classTypes(count);
        editableColumns = editableTypes(count);
                
        frame.jTBSearch.setModel(new javax.swing.table.DefaultTableModel(
                titleNull,
                titleName
        ) {
            // Quatidade de Colunas
            Class[] types = classTypes;
            
            boolean[] canEdit = editableColumns;

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }
    
    private static void createActionListener(String buttonName, JButton jButton, FormTemplate frame)
    {
        jButton.setText(buttonName);
        jButton.setEnabled(false);
        
        
        switch(buttonName)
        {
            case "Alterar":
                    jButton.addActionListener( frame :: jBTAlterarActionPerformed );
                break;
            case "Salvar":
                    jButton.addActionListener( frame :: jBTSalvarActionPerformed );
                break;
            case "Excluir":
                    jButton.addActionListener( frame :: jBTExcluirActionPerformed );
                break;
            case "Cadastrar":
                    jButton.addActionListener( frame :: jBTCadastrarActionPerformed );
                break;
            case "Confirmar":
                    jButton.addActionListener( frame :: jBTConfirmarActionPerformed );
                break;
            case "Cancelar":
                    jButton.addActionListener( frame :: jBTCancelarActionPerformed );
                break;
        }
    }
    
    
    public static void setEnabled(JComponent jComponent, boolean isTrue)
    {
        jComponent.setEnabled(isTrue);
    }
    
    
    public static void errorMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message, "ERROR", ERROR_MESSAGE);
    }
    
}
