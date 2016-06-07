/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import VO.Aluno;
import VO.VOHelper;
import controller.AlunoController;
import static controller.TypeData.*;

/**
 *
 * @author viniciuscustodio
 */
public class FormAluno extends FormTemplate {

    
    /**
     * Creates new form FormAluno
     */
    public FormAluno() {
        
        
        super(); 
        super.typeData = ALUNO;
        initComponents();
        this.classController = new AlunoController();
 
        ViewHelper.iniciarComponentes(this, this.typeData);
        
    }

    @Override
    protected void changeEnable(boolean isTrue){
        
        ViewHelper.setEnabled(this.jtAcademicRegistry, isTrue);
        ViewHelper.setEnabled(this.jtfCoeficiente, isTrue);
        ViewHelper.setEnabled(this.jtNome, isTrue);
        ViewHelper.setEnabled(this.jtTelefone, isTrue);
        ViewHelper.setEnabled(this.jcbCurso, isTrue);
        ViewHelper.setEnabled(this.jcbPeriodo, isTrue);
        ViewHelper.setEnabled(this.jcbSituacao, isTrue);
        ViewHelper.setEnabled(this.jcbTurno, isTrue);
        ViewHelper.setEnabled(this.jDPDateIngresso, isTrue);
        
        
    }

    @Override
    protected void cleanComponents(){

        super.cleanComponents();
        
        this.jtAcademicRegistry.setText("");
        this.jtfCoeficiente.setText("");
        this.jtNome.setText("");
        this.jtTelefone.setText("");
        this.jcbCurso.setSelectedIndex(0);
        this.jcbPeriodo.setSelectedIndex(0);
        this.jcbSituacao.setSelectedIndex(0);
        this.jcbTurno.setSelectedIndex(0);
        this.jDPDateIngresso.setDate(null);
        
    }
    
    @Override
    protected void captureScreenData()
    {
        this.inputData = VOHelper.createAlunoVO(
            this.jtAcademicRegistry.getText(),
            this.jcbPeriodo.getSelectedItem().toString(),
            this.jcbCurso.getSelectedItem().toString(),
            this.jtNome.getText(),
            this.jtfCoeficiente.getText(),
            this.jcbTurno.getSelectedItem().toString(),
            this.jDPDateIngresso.getDate(),
            this.jcbSituacao.getSelectedItem().toString(),
            this.jtTelefone.getText()
        );
    }
    
   
    @Override
    protected void setDataOnScreen()
    {
        
        this.jtAcademicRegistry.setText( String.valueOf( ( (Aluno) this.selectedData).getRa() ) );
        this.jtfCoeficiente.setText( String.valueOf( ( (Aluno) this.selectedData).getCoeficiente()) );
        this.jtNome.setText( ( (Aluno) this.selectedData).getNome() );
        this.jtTelefone.setText( ( (Aluno) this.selectedData).getTelefone() );
        this.jcbCurso.setSelectedItem( ( (Aluno) this.selectedData).getNome_curso() );
        this.jcbPeriodo.setSelectedItem( String.valueOf( ( (Aluno) this.selectedData).getPeriodo() )  );
        this.jcbSituacao.setSelectedItem(  String.valueOf( ( (Aluno) this.selectedData).getSituacao() ) );
        this.jcbTurno.setSelectedItem( String.valueOf( ( (Aluno) this.selectedData).getTurno()) );
        this.jDPDateIngresso.setDate( ( (Aluno) this.selectedData).getIngresso() );
        
    }
    
    @Override
    protected void jTBSearchMouseClicked(java.awt.event.MouseEvent evt) {

        int selectedIndex = this.jTBSearch.getSelectedRow();
        this.selectedData = (Aluno) this.listObjects.get(selectedIndex);
        
        super.jTBSearchMouseClicked(evt);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPManter = new javax.swing.JPanel();
        jPAluno = new javax.swing.JPanel();
        jlAcademicRegistry = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jtNome = new javax.swing.JTextField();
        jtAcademicRegistry = new javax.swing.JTextField();
        jlPeriod = new javax.swing.JLabel();
        jcbPeriodo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbTurno = new javax.swing.JComboBox<>();
        jtfCoeficiente = new javax.swing.JFormattedTextField();
        jDPDateIngresso = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jlCourse = new javax.swing.JLabel();

        jPManter.setPreferredSize(new java.awt.Dimension(650, 200));

        jPAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jPAluno.setForeground(new java.awt.Color(51, 0, 255));

        jlAcademicRegistry.setText("RA: ");

        jlName.setText("Nome:");

        jcbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciência da Computação", "Engenheria de Produção", "Engenharia Elétrica", "Engenharia Civil", "Engenharia Mecânica", "Ciências Naturais" }));

        jtNome.setText("Vinicius Custodio");

        jtAcademicRegistry.setText("1372475");

        jlPeriod.setText("Periodo:");

        jcbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel1.setText("Data de Ingresso:");

        jLabel2.setText("Coeficiente:");

        jLabel4.setText("Turno:");

        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite", "Integral" }));

        jtfCoeficiente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0000"))));
        jtfCoeficiente.setText("0.9");
        jtfCoeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCoeficienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Situação:");

        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Afastado para Estudos no Exterior", "Desistente", "Matrícula Trancada" }));

        jLabel10.setText("Telefone:");

        jtTelefone.setText("(42) 8425-9609");

        jlCourse.setText("Curso:");

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAcademicRegistry)
                            .addComponent(jlName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addComponent(jtAcademicRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jlPeriod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jlCourse))
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDPDateIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbSituacao, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAcademicRegistry)
                    .addComponent(jtAcademicRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPeriod)
                    .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlName)
                    .addComponent(jLabel2)
                    .addComponent(jtfCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDPDateIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPManterLayout = new javax.swing.GroupLayout(jPManter);
        jPManter.setLayout(jPManterLayout);
        jPManterLayout.setHorizontalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPManterLayout.createSequentialGroup()
                .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPManterLayout.setVerticalGroup(
            jPManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPManterLayout.createSequentialGroup()
                .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPManter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCoeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCoeficienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCoeficienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FormAluno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDPDateIngresso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPManter;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbPeriodo;
    private javax.swing.JComboBox<String> jcbSituacao;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JLabel jlAcademicRegistry;
    private javax.swing.JLabel jlCourse;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPeriod;
    private javax.swing.JTextField jtAcademicRegistry;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JFormattedTextField jtfCoeficiente;
    // End of variables declaration//GEN-END:variables
}
