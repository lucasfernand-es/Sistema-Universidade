/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import VO.*;
import controller.DisciplinaController;
import static controller.Util.TypeData.*;

/**
 *
 * @author viniciuscustodio
 */
public class FormDisciplina extends FormTemplate {


    /**
     * Creates new form FormAluno
     */
    public FormDisciplina() {
        super(DISCIPLINA); 
        initComponents();
        this.classController = new DisciplinaController();
 
        ViewHelper.iniciarComponentes(this, this.typeData);
    }

    @Override
    protected void changeEnable(boolean isTrue){
        
        ViewHelper.setEnabled(this.jtNome, isTrue);
        ViewHelper.setEnabled(this.jcbPeriodo, isTrue);
        ViewHelper.setEnabled(this.jcbStatus, isTrue);
        ViewHelper.setEnabled(this.jcbCargaHoraria, isTrue);
        ViewHelper.setEnabled(this.jTAEmenta, isTrue);
        
        
    }

    @Override
    protected void cleanComponents(){

        super.cleanComponents();
        
        this.jtNome.setText("");
        this.jcbPeriodo.setSelectedIndex(0);
        this.jcbStatus.setSelectedIndex(0);
        this.jcbCargaHoraria.setSelectedIndex(0);
        this.jTAEmenta.setText("");
        
    }
    
    @Override
    protected void captureScreenData()
    {
        //String nome, int periodo, int cargaHoraria, String ementa, String status
        this.inputData = VOHelper.createDisciplinaVO(
            this.jtNome.getText(),
            Integer.parseInt( this.jcbPeriodo.getSelectedItem().toString() ),
            Integer.parseInt( this.jcbCargaHoraria.getSelectedItem().toString() ),
            this.jTAEmenta.getText(),
            this.jcbStatus.getSelectedItem().toString()
        );
    }
    
    @Override
    protected void setDataOnScreen()
    {
        this.jtNome.setText( ( (Disciplina) this.selectedData ).getNome() );
        this.jcbPeriodo.setSelectedItem( String.valueOf( ( (Disciplina) this.selectedData ).getPeriodo() ) );
        this.jcbStatus.setSelectedItem( ( (Disciplina) this.selectedData ).isStatusString() );
        this.jcbCargaHoraria.setSelectedItem( String.valueOf( ( (Disciplina) this.selectedData ).getCarga_horaria() ) );
        this.jTAEmenta.setText( ( (Disciplina) this.selectedData ).getEmenta() );
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPManter = new javax.swing.JPanel();
        jPDisciplina = new javax.swing.JPanel();
        jcbStatus = new javax.swing.JComboBox<>();
        jlPeriod = new javax.swing.JLabel();
        jcbPeriodo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCargaHoraria = new javax.swing.JComboBox<>();
        jlName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAEmenta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPManter.setForeground(new java.awt.Color(51, 0, 255));

        jPDisciplina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jlPeriod.setText("Periodo:");

        jcbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel1.setText("Ementa:");

        jLabel2.setText("Carga Horária:");

        jcbCargaHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jlName.setText("Nome:");

        jTAEmenta.setColumns(20);
        jTAEmenta.setRows(5);
        jScrollPane2.setViewportView(jTAEmenta);

        jLabel3.setText("Status:");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDisciplinaLayout = new javax.swing.GroupLayout(jPDisciplina);
        jPDisciplina.setLayout(jPDisciplinaLayout);
        jPDisciplinaLayout.setHorizontalGroup(
            jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jlName)
                    .addComponent(jlPeriod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDisciplinaLayout.createSequentialGroup()
                        .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jtNome))
                .addContainerGap())
        );
        jPDisciplinaLayout.setVerticalGroup(
            jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPeriod)
                    .addComponent(jLabel2)
                    .addComponent(jcbCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPManterLayout = new javax.swing.GroupLayout(jPManter);
        jPManter.setLayout(jPManterLayout);
        jPManterLayout.setHorizontalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPManterLayout.setVerticalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPManterLayout.createSequentialGroup()
                .addComponent(jPDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPManter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new FormDisciplina().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPDisciplina;
    private javax.swing.JPanel jPManter;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAEmenta;
    private javax.swing.JComboBox<String> jcbCargaHoraria;
    private javax.swing.JComboBox<String> jcbPeriodo;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPeriod;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
