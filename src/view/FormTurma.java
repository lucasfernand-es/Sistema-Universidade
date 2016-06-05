/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import VO.Disciplina;
import VO.Professor;
import VO.Turma;
import VO.VOHelper;
import controller.DisciplinaController;
import controller.ProfessorController;
import controller.TurmaController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author viniciuscustodio
 */
public class FormTurma extends javax.swing.JFrame {

    TurmaController turmaController = new TurmaController();
    DisciplinaController disciplinaController = new DisciplinaController();
    ProfessorController professorController = new ProfessorController();
    
    List<Turma> turmas;
    List<Disciplina> disciplinas;
    List<Professor> professors;
    
    Turma selectedTurma = null;

    /**
     * Creates new form FormAluno
     */
    public FormTurma() {
        initComponents();
        populateTable();
        populateComboBoxProfessor();
    }

    private void populateTable() {
        this.turmas = this.turmaController.searchTurma();

        // Atualizando a tabela
        DefaultTableModel model = (DefaultTableModel) jTableTurma.getModel();
        model.setRowCount(0);

        this.disciplinas.stream().forEach((disciplina) -> {
            modelAlunos.addRow(new Object[]{
                disciplina.getNome(), disciplina.getPeriodo(), disciplina.getCarga_horaria(),
                disciplina.getProfessor(), disciplina.getEmenta()
            });
        });
    }

    private void populateComboBoxProfessor(){
        Professor professor =  new Professor();
        professor.setStatus(true);
        
        professors = professorController.searchProfessor(professor);

        // Atualizando o combo box
        this.jcbProfessor.removeAllItems();

        professors.stream().forEach((p) -> {
            this.jcbProfessor.addItem(p.getNome());
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTurma = new javax.swing.JTable();
        jPDisciplina = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        jlCourse = new javax.swing.JLabel();
        jcbProfessor = new javax.swing.JComboBox<>();
        jbRegister = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcbDisciplina = new javax.swing.JComboBox<>();
        cbAnoSemestre = new javax.swing.JComboBox();
        jbDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Período", "Carga Horária", "Professor", "Ementa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTurma.getTableHeader().setReorderingAllowed(false);
        jTableTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTurmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTurma);

        jPDisciplina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jPDisciplina.setForeground(new java.awt.Color(51, 0, 255));

        jlName.setText("Disciplina:");

        jlCourse.setText("Professor:");

        jbRegister.setText("Cadastrar");
        jbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisterActionPerformed(evt);
            }
        });

        jbUpdate.setText("Alterar");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Semestre:");

        cbAnoSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "2008/1", "2008/2", "2009/1", "2009/2", "2010/1", "2010/2", "2011/1", "2011/2", "2012/1", "2012/2", "2013/1", "2013/2", "2014/1", "2014/2", "2015/1", "2015/2", "2016/1" }));
        cbAnoSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoSemestreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDisciplinaLayout = new javax.swing.GroupLayout(jPDisciplina);
        jPDisciplina.setLayout(jPDisciplinaLayout);
        jPDisciplinaLayout.setHorizontalGroup(
            jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jlName)
                    .addComponent(jlCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDisciplinaLayout.createSequentialGroup()
                        .addComponent(cbAnoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbProfessor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPDisciplinaLayout.setVerticalGroup(
            jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jcbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCourse)
                    .addComponent(jcbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDisciplinaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbUpdate)
                            .addComponent(jbRegister))
                        .addGap(68, 68, 68))
                    .addGroup(jPDisciplinaLayout.createSequentialGroup()
                        .addGroup(jPDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAnoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jbDelete.setText("Deletar");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addComponent(jPDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        Disciplina disciplina = VOHelper.createDisciplinaVO(
                this.jtNome.getText(),
                Integer.parseInt( this.jcbPeriodo.getSelectedItem().toString() ),
                Integer.parseInt ( this.jcbCargaHorária.getSelectedItem().toString() ),
                this.jTAEmenta.getText(),
                this.professors.get( this.jcbProfessor.getSelectedIndex()),
                this.jcbStatus.getSelectedItem().toString()
                
        );
        
        showMessage(disciplinaController.registrarDisciplina(disciplina), "insert");
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jTableTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTurmaMouseClicked
        
        this.selectedDisciplina = this.disciplinas.get(jTableDisciplinas.getSelectedRow());

        
        
        this.jtNome.setText( selectedDisciplina.getNome() );
        this.jcbPeriodo.setSelectedItem( selectedDisciplina.getPeriodo() );
        this.jcbCargaHorária.setSelectedItem( selectedDisciplina.getCarga_horaria());
        
        this.jTAEmenta.setText( selectedDisciplina.getEmenta() );
        
        this.jcbProfessor.setSelectedIndex( professorController.searchProfessor(this.professors, selectedDisciplina.getProfessor()) );

        jcbStatus.setSelectedItem( this.selectedDisciplina.isStatusString() );
    }//GEN-LAST:event_jTableTurmaMouseClicked

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        Disciplina disciplina = VOHelper.createDisciplinaVO(
                this.jtNome.getText(),
                Integer.parseInt( this.jcbPeriodo.getSelectedItem().toString() ),
                Integer.parseInt ( this.jcbCargaHorária.getSelectedItem().toString() ),
                this.jTAEmenta.getText(),
                this.professors.get( this.jcbProfessor.getSelectedIndex() ),
                this.jcbStatus.getSelectedItem().toString()
        );
        
        disciplina.setId_disciplina(this.selectedDisciplina.getId_disciplina());
        

        if(this.selectedDisciplina != null)
            showMessage(disciplinaController.updateDisciplina(disciplina), "update");
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        /*
        if(this.selectedDisciplina != null)
            showMessage(disciplinaController.deleteDisciplina(selectedDisciplina), "remove");
        */
        this.selectedDisciplina.setStatus( false );
        showMessage(disciplinaController.updateDisciplina(selectedDisciplina), "remove");
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void cbAnoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoSemestreActionPerformed

    private void showMessage(Boolean b, String type) {
        String title = null, message = null;
        switch (type) {
            case "insert":
                title = "Cadastrar";
                message = "cadastrado";
                break;
            case "update":
                title = "Alterar";
                message = "alterado";
                break;
            case "remove":
                title = "Deletar";
                message = "deletado";
                break;
        }

        if (b) {
            JOptionPane.showMessageDialog(null, "Disciplina " + message + " com sucesso", title, JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina  " + message, title, JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void query(boolean bool, String type) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAnoSemestre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPDisciplina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTurma;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbRegister;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcbDisciplina;
    private javax.swing.JComboBox<String> jcbProfessor;
    private javax.swing.JLabel jlCourse;
    private javax.swing.JLabel jlName;
    // End of variables declaration//GEN-END:variables
}
