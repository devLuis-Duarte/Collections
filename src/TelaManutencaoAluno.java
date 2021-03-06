/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salda
 */
 /*

 Luis Duarte - SP3092089
 Ryan Henrique - SP3024521
 Gustavo Chaves - SP3047318
 Emily Miklos - SP3048993

*/
public class TelaManutencaoAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaManutencaoAluno
     */
    ArrayList<Aluno> dado = new ArrayList<>();
    ControleAluno ca = new ControleAluno();
    Aluno al = new Aluno();

    public TelaManutencaoAluno() {
        initComponents();
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
        tabela = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExibirNome = new javax.swing.JButton();
        btnQtdeAlunos = new javax.swing.JButton();
        btnExibirAluno = new javax.swing.JButton();
        btnVerificaLista = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnOrdenarPares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "nome", "RA", "telefone", "email", "endereco", "curso", "turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Informe o RA");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExibirNome.setText("Exibir nome");
        btnExibirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirNomeActionPerformed(evt);
            }
        });

        btnQtdeAlunos.setText("Qtde alunos");
        btnQtdeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdeAlunosActionPerformed(evt);
            }
        });

        btnExibirAluno.setText("Exibir aluno");
        btnExibirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirAlunoActionPerformed(evt);
            }
        });

        btnVerificaLista.setText("Verifica lista");
        btnVerificaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificaListaActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnOrdenarPares.setText("Ordenar Pares");
        btnOrdenarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarParesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnExibirNome)
                        .addGap(18, 18, 18)
                        .addComponent(btnQtdeAlunos)
                        .addGap(18, 18, 18)
                        .addComponent(btnExibirAluno)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificaLista)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenarPares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnExibirNome)
                    .addComponent(btnQtdeAlunos)
                    .addComponent(btnExibirAluno)
                    .addComponent(btnVerificaLista)
                    .addComponent(btnOrdenar)
                    .addComponent(btnOrdenarPares))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        dado.clear();
        dado.addAll(ca.listaTudo());

        for (Aluno a : dado) {
            modelo.addRow(new Object[]{a.getNome(), a.getRA(), a.getTelefone(), a.getEmail(), a.getEndereco(), a.getCurso(), a.getTurma()});
        }
    }
    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        TelaCadastroAluno tca = new TelaCadastroAluno(null, true);
        tca.setVisible(true);

        if (tca.isSalvar()) {
            ca.incluir(tca.getAl());
        }
        atualizaTabela();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir!");
        } else {
            Aluno a = dado.get(linha);
            ca.excluir(a);
        }
        atualizaTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para editar");
        } else {
            Aluno a = dado.get(linha);
            TelaCadastroAluno tca = new TelaCadastroAluno(null, true);
            tca.setAl(a);
            tca.desabilitaCodigo();
            tca.setVisible(true);
            a = tca.getAl();

            if (tca.isSalvar()) {
                ca.editar(a);
            }
            atualizaTabela();
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Aluno a = ca.Pesquisar(Integer.parseInt(txtPesquisar.getText()));

        if (a != null) {
            System.out.println("Aluno:" + a);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVerificaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificaListaActionPerformed
        ca.verificaLista();
    }//GEN-LAST:event_btnVerificaListaActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        ca.ordenar();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnExibirNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirNomeActionPerformed
        ca.percorreLista(al);
    }//GEN-LAST:event_btnExibirNomeActionPerformed

    private void btnExibirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirAlunoActionPerformed
        ca.mostrarElemento(al);
    }//GEN-LAST:event_btnExibirAlunoActionPerformed

    private void btnQtdeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdeAlunosActionPerformed
        ca.verificaQtdeElementos(al);
    }//GEN-LAST:event_btnQtdeAlunosActionPerformed

    private void btnOrdenarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarParesActionPerformed
        ca.MostrarElementosPares();
    }//GEN-LAST:event_btnOrdenarParesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaManutencaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManutencaoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExibirAluno;
    private javax.swing.JButton btnExibirNome;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnOrdenarPares;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnQtdeAlunos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVerificaLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
