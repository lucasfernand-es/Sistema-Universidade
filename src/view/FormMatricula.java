/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import VO.*;
import controller.MatriculaController;
import static controller.Util.TypeData.*;
import view.Util.JComboBoxTypeData;

/**
 *
 * @author viniciuscustodio
 */
public class FormMatricula extends FormTemplate {

    
    /**
     * Creates new form FormAluno
     */
    public FormMatricula() {
        
        
        super(MATRICULA); 
        initComponents();
        
        
        this.classController = new MatriculaController();
 
        ViewHelper.iniciarComponentes(this, this.typeData);
        
        this.listJComboBoxTypeData.add(new JComboBoxTypeData( this.jCBAluno, ALUNO ));
        this.listJComboBoxTypeData.add(new JComboBoxTypeData( this.jCBTurma, TURMA ));
        this.updateJComboBox();
 
        
    }
    

    @Override
    protected void changeEnable(boolean isTrue){
        
        ViewHelper.setEnabled(this.jCBAluno, isTrue);
        ViewHelper.setEnabled(this.jCBTurma, isTrue);
        ViewHelper.setEnabled(this.jTFNota, isTrue);
        
    }

    @Override
    protected void cleanComponents(){
        
        super.cleanComponents();
        this.jTFNota.setText("");
        
    }
    
    @Override
    protected void captureScreenData()
    {
        this.inputData = VOHelper.createMatriculaVO(
                (Aluno) (JComboBoxTypeData.getJComboBox(this.listJComboBoxTypeData, ALUNO)).getSelectedItem() ,
                (Turma) (JComboBoxTypeData.getJComboBox(this.listJComboBoxTypeData, TURMA)).getSelectedItem() ,
                this.jTFNota.getText()
        );
        
    }
    
   
    @Override
    protected void setDataOnScreen()
    {
        Matricula matricula = ((Matricula)this.selectedData);
        
        JComboBoxTypeData.setItem(listJComboBoxTypeData, ALUNO, matricula.getAluno());
        JComboBoxTypeData.setItem(listJComboBoxTypeData, TURMA, matricula.getTurma());
        
        this.jTFNota.setText(String.valueOf(matricula.getNota()));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPManter = new javax.swing.JPanel();
        jPAluno = new javax.swing.JPanel();
        jCBAluno = new javax.swing.JComboBox<>();
        jCBTurma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNota = new javax.swing.JTextField();

        jPManter.setPreferredSize(new java.awt.Dimension(650, 200));

        jPAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrícula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jPAluno.setForeground(new java.awt.Color(51, 0, 255));

        jLabel1.setText("Aluno:");

        jLabel2.setText("Turma:");

        jLabel3.setText("Nota:");

        jTFNota.setText("0.0");
        jTFNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAluno, 0, 494, Short.MAX_VALUE)
                    .addComponent(jCBTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCBTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPManterLayout = new javax.swing.GroupLayout(jPManter);
        jPManter.setLayout(jPManterLayout);
        jPManterLayout.setHorizontalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPManterLayout.createSequentialGroup()
                .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPManterLayout.setVerticalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPManter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNotaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FormMatricula().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBAluno;
    private javax.swing.JComboBox<String> jCBTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPManter;
    private javax.swing.JTextField jTFNota;
    // End of variables declaration//GEN-END:variables
}
