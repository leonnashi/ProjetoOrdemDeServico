/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Negocio.NegocioFuncionario;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetomello.Funcionario;

/**
 *
 * @author aluno
 */
public class TelaEditarFuncionario extends javax.swing.JFrame {

    ArrayList<Funcionario> respostaFuncionario;

    public TelaEditarFuncionario() {
        initComponents();
        ListarFuncionario();
        setLocationRelativeTo(this);

    }

    public void ListarFuncionario() {
        try {
            Funcionario funcionario = new Funcionario();
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            respostaFuncionario = negocioFuncionario.listar(funcionario);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "cpf", "rg", "salario"});

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }
            jTableListarFuncionario.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jButtonAlterarFuncionario = new javax.swing.JButton();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        LabelNome1 = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelCPF1 = new javax.swing.JLabel();
        jTextFieldSalario1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarFuncionario = new javax.swing.JTable();
        jButtonRemover = new javax.swing.JButton();
        LabelNome2 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Funcionário");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jFormattedTextFieldCpf.setPreferredSize(new java.awt.Dimension(47, 24));
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jFormattedTextFieldRg.setPreferredSize(new java.awt.Dimension(34, 24));
        jFormattedTextFieldRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRgActionPerformed(evt);
            }
        });

        jButtonAlterarFuncionario.setText("Alterar");
        jButtonAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarFuncionarioActionPerformed(evt);
            }
        });

        jLabelCPF.setText("Salário:");

        jTextFieldNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFuncionarioActionPerformed(evt);
            }
        });

        LabelNome1.setText("Nome:");

        jLabelRG.setText("RG:");

        jLabelCPF1.setText("CPF:");

        jTextFieldSalario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalario1ActionPerformed(evt);
            }
        });
        jTextFieldSalario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSalario1KeyTyped(evt);
            }
        });

        jTableListarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Salário"
            }
        ));
        jTableListarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarFuncionarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListarFuncionarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarFuncionario);

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        LabelNome2.setText("Matricula:");

        jTextFieldMatricula.setEnabled(false);
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelRG)
                    .addComponent(jLabelCPF1)
                    .addComponent(LabelNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNomeFuncionario)
                    .addComponent(jTextFieldSalario1)
                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNome2)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonAlterarFuncionario))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jFormattedTextFieldRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRgActionPerformed

    private void jButtonAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarFuncionarioActionPerformed

        if(jTableListarFuncionario.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um campo na tabela");
            return;
        }
        int index = jTableListarFuncionario.getSelectedRow();
        Funcionario listarFunc = this.respostaFuncionario.get(index);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(jTextFieldNomeFuncionario.getText());
        funcionario.setCpf(jFormattedTextFieldCpf.getText());
        funcionario.setRg(jFormattedTextFieldRg.getText());
        funcionario.setSalario(Double.parseDouble(jTextFieldSalario1.getText()));
        funcionario.setMatricula(listarFunc.getMatricula());
        NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
        try {
            negocioFuncionario.atualizar(funcionario);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            ListarFuncionario();
            jTextFieldNomeFuncionario.setText("");
            jTextFieldSalario1.setText("");
            jFormattedTextFieldCpf.setText("");
            jFormattedTextFieldRg.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarFuncionarioActionPerformed

    private void jTextFieldSalario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalario1ActionPerformed

    private void jTableListarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarFuncionarioMouseClicked
        MouseEvent e = evt;

        int click = e.getClickCount();
        int index = jTableListarFuncionario.getSelectedRow();
        Funcionario funcionario = this.respostaFuncionario.get(index);

        jTextFieldNomeFuncionario.setText(funcionario.getNome());
        jFormattedTextFieldCpf.setText(funcionario.getCpf());
        jFormattedTextFieldRg.setText(funcionario.getRg());
        jTextFieldSalario1.setText(String.valueOf(funcionario.getSalario()));
        jTextFieldMatricula.setText(String.valueOf(funcionario.getMatricula()));
    }//GEN-LAST:event_jTableListarFuncionarioMouseClicked

    private void jTableListarFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarFuncionarioMousePressed
        jTableListarFuncionario.editingCanceled(null);
        jTableListarFuncionario.editingStopped(null);
    }//GEN-LAST:event_jTableListarFuncionarioMousePressed

    private void jTextFieldNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFuncionarioActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        if (jTextFieldNomeFuncionario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um campo na tabela");
            return;
        }
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setMatricula(Integer.parseInt(jTextFieldMatricula.getText()));

            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            negocioFuncionario.remover(funcionario);
            JOptionPane.showMessageDialog(null, "O funcionário foi removido!");
            this.dispose();
            new TelaEditarFuncionario().setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Os dados não coincidem com os dados da tabela! Por favor, selecionar novamente");
                this.dispose();
            new TelaEditarFuncionario().setVisible(true);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jTextFieldSalario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalario1KeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldSalario1KeyTyped

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
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome1;
    private javax.swing.JLabel LabelNome2;
    private javax.swing.JButton jButtonAlterarFuncionario;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCPF1;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarFuncionario;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldSalario1;
    // End of variables declaration//GEN-END:variables
}
