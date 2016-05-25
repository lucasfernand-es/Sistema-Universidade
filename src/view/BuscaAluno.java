package view;


import VO.Aluno;
import VO.Aluno_Disciplina;
import VO.Disciplina;
import controller.AlunoController;
import controller.DisciplinaController;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinicius
 */
public class BuscaAluno extends javax.swing.JFrame {

    private static BuscaAluno BuscaAluno = null;
    
    private DefaultListModel modelo;
    
    private List<Aluno> alunos = null;

    /**
     * Creates new form BuscaAluno
     */
    
    public static void createBuscaAluno(){
        if(BuscaAluno == null){
            BuscaAluno = new BuscaAluno();
        }
        BuscaAluno.setVisible(true);
        
    }
    public BuscaAluno() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPesquisar = new javax.swing.JPanel();
        lPesquisaAluno = new javax.swing.JLabel();
        tAluno = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();
        lPesquisaSelecionarAluno = new javax.swing.JLabel();
        cbAluno = new javax.swing.JComboBox();
        bLimpar = new javax.swing.JButton();
        lPesquisaAnoSemestre = new javax.swing.JLabel();
        cbAnoSemestre = new javax.swing.JComboBox();
        bBuscar = new javax.swing.JButton();
        pDisciplinas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        ltDisciplinas = new javax.swing.JList(modelo);
        lAluno = new javax.swing.JLabel();
        lNomeAluno = new javax.swing.JLabel();
        lCurso = new javax.swing.JLabel();
        lCursoAluno = new javax.swing.JLabel();
        lTurno = new javax.swing.JLabel();
        lTurnoAluno = new javax.swing.JLabel();
        lSituacao = new javax.swing.JLabel();
        lSituacaoAluno = new javax.swing.JLabel();
        lPeriodo = new javax.swing.JLabel();
        lPeriodoAluno = new javax.swing.JLabel();
        lCoeficiente = new javax.swing.JLabel();
        lCoeficienteAluno = new javax.swing.JLabel();
        lRAAluno = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        mSair = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        mSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disciplinas Matriculadas");

        pPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N

        lPesquisaAluno.setText("Aluno:");

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        lPesquisaSelecionarAluno.setText("Selecione um Aluno:");

        cbAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        lPesquisaAnoSemestre.setText("Ano/Semestre:");

        cbAnoSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "2008/1", "2008/2", "2009/1", "2009/2", "2010/1", "2010/2", "2011/1", "2011/2", "2012/1", "2012/2", "2013/1", "2013/2", "2014/1", "2014/2", "2015/1", "2015/2", "2016/1" }));
        cbAnoSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoSemestreActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPesquisarLayout = new javax.swing.GroupLayout(pPesquisar);
        pPesquisar.setLayout(pPesquisarLayout);
        pPesquisarLayout.setHorizontalGroup(
            pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPesquisarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lPesquisaAluno)
                    .addComponent(lPesquisaSelecionarAluno)
                    .addComponent(lPesquisaAnoSemestre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPesquisarLayout.createSequentialGroup()
                        .addComponent(tAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pPesquisarLayout.createSequentialGroup()
                        .addComponent(cbAnoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        pPesquisarLayout.setVerticalGroup(
            pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPesquisarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPesquisaAluno)
                    .addComponent(tAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar))
                .addGap(18, 18, 18)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPesquisaSelecionarAluno)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPesquisaAnoSemestre)
                    .addComponent(cbAnoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplinas Matriculadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N

        jScrollPane1.setViewportView(ltDisciplinas);

        javax.swing.GroupLayout pDisciplinasLayout = new javax.swing.GroupLayout(pDisciplinas);
        pDisciplinas.setLayout(pDisciplinasLayout);
        pDisciplinasLayout.setHorizontalGroup(
            pDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDisciplinasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pDisciplinasLayout.setVerticalGroup(
            pDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDisciplinasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lAluno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lAluno.setText("Aluno:");

        lCurso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lCurso.setText("Curso:");

        lTurno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lTurno.setText("Turno:");

        lSituacao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lSituacao.setText("Situação:");

        lPeriodo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lPeriodo.setText("Período:");

        lCoeficiente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lCoeficiente.setText("Coeficiente:");

        mArquivo.setText("Arquivo");

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        mArquivo.add(mSair);

        jMenuBar1.add(mArquivo);

        mAjuda.setText("Ajuda");

        mSobre.setText("Sobre");
        mSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSobreActionPerformed(evt);
            }
        });
        mAjuda.add(mSobre);

        jMenuBar1.add(mAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lAluno)
                                .addGap(18, 18, 18)
                                .addComponent(lRAAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCurso)
                                .addGap(18, 18, 18)
                                .addComponent(lCursoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTurno)
                                .addGap(18, 18, 18)
                                .addComponent(lTurnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCoeficiente)
                                .addGap(18, 18, 18)
                                .addComponent(lCoeficienteAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lPeriodo)
                                .addGap(18, 18, 18)
                                .addComponent(lPeriodoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lSituacao)
                                .addGap(18, 18, 18)
                                .addComponent(lSituacaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lRAAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSituacaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lAluno)
                        .addComponent(lSituacao)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCursoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPeriodoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTurnoAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lTurno)
                        .addComponent(lCoeficiente)
                        .addComponent(lCoeficienteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        
        Aluno aluno = new Aluno();
        aluno.setNome( this.tAluno.getText() );
        
        
        try{
            alunos = AlunoController.searchAluno(aluno, 1);
        
            cbAluno.removeAllItems();

            for(Aluno alunoVO: alunos)
            {
                //System.out.println(alunoVO);
                cbAluno.addItem(alunoVO.getNome());
            }
        }
        catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        
        
        /*
        try {

            File arq = new File("");
            String diretorio = arq.getAbsolutePath() + "//DataBase//UNIVERSIDADE.FDB";

            Class.forName("org.firebirdsql.jdbc.FBDriver");

            Connection conexao = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:" + diretorio, "sysdba", "masterkey");

            Statement st = conexao.createStatement();
            ResultSet consulta = st.executeQuery("select nome from aluno where aluno.nome like '%" + this.tAluno.getText() + "%'");

            cbAluno.removeAllItems();

            
            while (consulta.next()) {

                cbAluno.addItem(consulta.getString("nome"));
            }

            conexao.close();

        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        */
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed

        
        Aluno_Disciplina aluno_Disciplina = new Aluno_Disciplina();
        aluno_Disciplina.setAno_semestre( this.cbAnoSemestre.getSelectedItem().toString() );
        
        Aluno aluno = new Aluno();
        aluno.setNome( this.cbAluno.getSelectedItem().toString() );
        if ( alunos != null ) { // Capturar o RA do aluno 
            aluno.setRa( alunos.get( this.cbAluno.getSelectedIndex() ).getRa() );
        }
        aluno_Disciplina.setAluno(aluno);
        
        try {
            List<Disciplina> disciplinas = DisciplinaController.searchDisciplina(aluno_Disciplina);
        
            modelo.removeAllElements();
            for(Disciplina disciplinaVO : disciplinas)
            {
                //System.out.println(disciplinaVO);
                modelo.addElement(disciplinaVO.getNome());
            }
            
            List<Aluno> selectAluno = AlunoController.searchAluno(aluno, 2);
            
            for(Aluno alunoVO: selectAluno)
            {
                this.lRAAluno.setText(String.valueOf( alunoVO.getRa() )  );
                this.lNomeAluno.setText( alunoVO.getNome() );
                this.lCursoAluno.setText( alunoVO.getNome_curso() );
                this.lTurnoAluno.setText( alunoVO.getTurno() );
                this.lSituacaoAluno.setText( alunoVO.getSituacao() );
                this.lPeriodoAluno.setText(String.valueOf( alunoVO.getPeriodo() ) );
                this.lCoeficienteAluno.setText(String.valueOf( alunoVO.getCoeficiente() ));
            }
        }
        catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        
        /*
        
        try {
            File arq = new File("");
            String diretorio = arq.getAbsolutePath() + "//DataBase//UNIVERSIDADE.FDB";

            Class.forName("org.firebirdsql.jdbc.FBDriver");

            Connection conexao = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:" + diretorio, "sysdba", "masterkey");

            Statement st = conexao.createStatement();

            ResultSet consulta = st.executeQuery("select nome "
                    + "from disciplina "
                    + "where disciplina.codigo in ( "
                    + "      select id_disciplina "
                    + "      from aluno_disciplina "
                    + "      where aluno_disciplina.ano_semestre = '" + this.cbAnoSemestre.getSelectedItem().toString() + "' and "
                    + "            aluno_disciplina.id_aluno in ("
                    + "                  select ra "
                    + "                  from aluno "
                    + "                  where aluno.nome = '" + this.cbAluno.getSelectedItem().toString() + "'"
                    + "      )"
                    + ")");

            modelo.removeAllElements();

            while (consulta.next()) {

                modelo.addElement(consulta.getString("nome"));
            }

            consulta = st.executeQuery("select * from aluno where aluno.nome = '" + this.cbAluno.getSelectedItem().toString() + "'");

            if (consulta.next()) {

                this.lRAAluno.setText(String.valueOf(consulta.getInt("ra")));
                this.lNomeAluno.setText(consulta.getString("nome"));
                this.lCursoAluno.setText(consulta.getString("curso"));
                this.lTurnoAluno.setText(consulta.getString("turno"));
                this.lSituacaoAluno.setText(consulta.getString("situacao"));
                this.lPeriodoAluno.setText(String.valueOf(consulta.getInt("periodo")));
                this.lCoeficienteAluno.setText(String.valueOf(consulta.getFloat("coeficiente")));
            }

            conexao.close();

        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        */

    }//GEN-LAST:event_bBuscarActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed

        this.tAluno.setText("");
        this.cbAluno.removeAllItems();
        this.cbAluno.addItem("Selecione...");
        this.cbAnoSemestre.setSelectedIndex(0);
        this.modelo.removeAllElements();
        
        this.lRAAluno.setText("");
        this.lNomeAluno.setText("");
        this.lCursoAluno.setText("");
        this.lTurnoAluno.setText("");
        this.lSituacaoAluno.setText("");
        this.lPeriodoAluno.setText("");
        this.lCoeficienteAluno.setText("");

    }//GEN-LAST:event_bLimparActionPerformed

    private void mSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSobreActionPerformed

        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_mSobreActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_mSairActionPerformed

    private void cbAnoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoSemestreActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BuscaAluno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JComboBox cbAluno;
    private javax.swing.JComboBox cbAnoSemestre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAluno;
    private javax.swing.JLabel lCoeficiente;
    private javax.swing.JLabel lCoeficienteAluno;
    private javax.swing.JLabel lCurso;
    private javax.swing.JLabel lCursoAluno;
    private javax.swing.JLabel lNomeAluno;
    private javax.swing.JLabel lPeriodo;
    private javax.swing.JLabel lPeriodoAluno;
    private javax.swing.JLabel lPesquisaAluno;
    private javax.swing.JLabel lPesquisaAnoSemestre;
    private javax.swing.JLabel lPesquisaSelecionarAluno;
    private javax.swing.JLabel lRAAluno;
    private javax.swing.JLabel lSituacao;
    private javax.swing.JLabel lSituacaoAluno;
    private javax.swing.JLabel lTurno;
    private javax.swing.JLabel lTurnoAluno;
    private javax.swing.JList ltDisciplinas;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenuItem mSobre;
    private javax.swing.JPanel pDisciplinas;
    private javax.swing.JPanel pPesquisar;
    private javax.swing.JTextField tAluno;
    // End of variables declaration//GEN-END:variables
}
