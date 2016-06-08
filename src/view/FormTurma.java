/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Util.ViewDecorator;
import VO.*;
import controller.TurmaController;
import static controller.Util.TypeData.*;
import view.Util.JComboBoxTypeData;

/**
 *
 * @author viniciuscustodio
 */
public class FormTurma extends FormTemplate {

    
    /**
     * Creates new form FormAluno
     */
    public FormTurma() {
     
        super(TURMA); 
        initComponents();
        
        
        this.classController = new TurmaController();
 
        ViewDecorator.iniciarComponentes(this, this.typeData);
        
        this.listJComboBoxTypeData.add(new JComboBoxTypeData( this.jCBDisciplina, DISCIPLINA ));
        this.listJComboBoxTypeData.add(new JComboBoxTypeData( this.jCBProfessor, PROFESSOR ));
        this.updateJComboBox();
 
        
    }
    
   

    @Override
    protected void changeEnable(boolean isTrue){
        
        ViewDecorator.setEnabled(this.jCBDisciplina, isTrue);
        ViewDecorator.setEnabled(this.jCBProfessor, isTrue);
        ViewDecorator.setEnabled(this.jCBAnoSemestre, isTrue);
        
    }

    @Override
    public void cleanComponents(){
        
        this.jCBAnoSemestre.setSelectedIndex(0);
        
        super.cleanComponents();
        
    }
    
    @Override
    protected void captureScreenData()
    {
        this.inputData = VOHelper.createTurmaVO(
                (Disciplina) (JComboBoxTypeData.getJComboBox(this.listJComboBoxTypeData, DISCIPLINA)).getSelectedItem() ,
                (Professor) (JComboBoxTypeData.getJComboBox(this.listJComboBoxTypeData, PROFESSOR)).getSelectedItem() ,
                this.jCBAnoSemestre.getSelectedItem().toString()
        );
        
    }
    
   
    @Override
    protected void setDataOnScreen()
    {
        Turma turma = ((Turma)this.selectedData);
        
        JComboBoxTypeData.setItem(listJComboBoxTypeData, DISCIPLINA, turma.getDisciplina());
        JComboBoxTypeData.setItem(listJComboBoxTypeData, PROFESSOR, turma.getProfessor());
        
        this.jCBAnoSemestre.setSelectedItem( turma.getAno_semestre() );
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPManter = new javax.swing.JPanel();
        jPAluno = new javax.swing.JPanel();
        jCBAnoSemestre = new javax.swing.JComboBox();
        jCBDisciplina = new javax.swing.JComboBox<>();
        jCBProfessor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPManter.setPreferredSize(new java.awt.Dimension(650, 200));

        jPAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jPAluno.setForeground(new java.awt.Color(51, 0, 255));

        jCBAnoSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2008/1", "2008/2", "2009/1", "2009/2", "2010/1", "2010/2", "2011/1", "2011/2", "2012/1", "2012/2", "2013/1", "2013/2", "2014/1", "2014/2", "2015/1", "2015/2", "2016/1" }));
        jCBAnoSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAnoSemestreActionPerformed(evt);
            }
        });

        jLabel1.setText("Disciplina:");

        jLabel2.setText("Professor:");

        jLabel3.setText("Ano/Semestre:");

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBAnoSemestre, 0, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAnoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPManterLayout = new javax.swing.GroupLayout(jPManter);
        jPManter.setLayout(jPManterLayout);
        jPManterLayout.setHorizontalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPManterLayout.setVerticalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPManter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAnoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAnoSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAnoSemestreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FormTurma().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAnoSemestre;
    private javax.swing.JComboBox cbAnoSemestre1;
    private javax.swing.JComboBox jCBAnoSemestre;
    private javax.swing.JComboBox<String> jCBDisciplina;
    private javax.swing.JComboBox<String> jCBProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPManter;
    // End of variables declaration//GEN-END:variables
}
