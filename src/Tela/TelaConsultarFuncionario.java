/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Negocio.NegocioFuncionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetomello.Funcionario;

/**
 *
 * @author aluno
 */
public class TelaConsultarFuncionario extends javax.swing.JFrame {

    ArrayList<Funcionario> respostaFuncionario = new ArrayList<>();

    public void ListarFuncionario() {
        try {
            Funcionario funcionario = new Funcionario();
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            respostaFuncionario = negocioFuncionario.listar(funcionario);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG", "Salario"});

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }

            jTableListarFuncionario.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public TelaConsultarFuncionario() {
        initComponents();
        setLocationRelativeTo(this);
        ListarFuncionario();
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
        jTableListarFuncionario = new javax.swing.JTable();
        jTextFieldProcurarRG = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldNome2 = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        jButtonProcurarCPF = new javax.swing.JButton();
        jButtonProcurarRG = new javax.swing.JButton();
        jButtonProcurarNome = new javax.swing.JButton();
        jTextFieldProcurarCPF = new javax.swing.JTextField();
        jLabelRG1 = new javax.swing.JLabel();
        jTextFieldProcurarSalario = new javax.swing.JTextField();
        jButtonProcurarSalario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Funcionário");

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

        jTextFieldProcurarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProcurarRGActionPerformed(evt);
            }
        });
        jTextFieldProcurarRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarRGKeyTyped(evt);
            }
        });

        jLabelRG.setText("RG:");

        jLabelCPF.setText("CPF:");

        jTextFieldNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNome2jTextFieldNomeActionPerformed(evt);
            }
        });

        LabelNome.setText("Nome:");

        jButtonProcurarCPF.setText("Procurar");
        jButtonProcurarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarCPFActionPerformed(evt);
            }
        });

        jButtonProcurarRG.setText("Procurar");
        jButtonProcurarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarRGActionPerformed(evt);
            }
        });

        jButtonProcurarNome.setText("Procurar");
        jButtonProcurarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarNomeActionPerformed(evt);
            }
        });

        jTextFieldProcurarCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarCPFKeyTyped(evt);
            }
        });

        jLabelRG1.setText("Salário");

        jTextFieldProcurarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProcurarSalarioActionPerformed(evt);
            }
        });
        jTextFieldProcurarSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarSalarioKeyTyped(evt);
            }
        });

        jButtonProcurarSalario.setText("Procurar");
        jButtonProcurarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelNome)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCPF)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonProcurarNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonProcurarCPF)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRG1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButtonProcurarRG)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonProcurarSalario))
                            .addComponent(jTextFieldProcurarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonProcurarNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonProcurarCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldProcurarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRG1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRG)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonProcurarRG)
                            .addComponent(jButtonProcurarSalario))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarFuncionarioMouseClicked

    }//GEN-LAST:event_jTableListarFuncionarioMouseClicked

    private void jTableListarFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarFuncionarioMousePressed
        jTableListarFuncionario.editingCanceled(null);
        jTableListarFuncionario.editingStopped(null);
    }//GEN-LAST:event_jTableListarFuncionarioMousePressed

    private void jTextFieldNome2jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNome2jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNome2jTextFieldNomeActionPerformed

    private void jButtonProcurarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarCPFActionPerformed
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setCpf(jTextFieldProcurarCPF.getText());
            funcionario.setNome(jTextFieldNome2.getText());
            funcionario.setRg(jTextFieldProcurarRG.getText());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "Cpf", "Rg", "Salario"});
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            this.respostaFuncionario = negocioFuncionario.listar(funcionario);

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }
            jTableListarFuncionario.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProcurarCPFActionPerformed

    private void jButtonProcurarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarRGActionPerformed
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setRg(jTextFieldProcurarRG.getText());
            funcionario.setNome(jTextFieldNome2.getText());
            funcionario.setCpf(jTextFieldProcurarCPF.getText());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "Cpf", "Rg", "Salario"});
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            this.respostaFuncionario = negocioFuncionario.listar(funcionario);

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }
            jTableListarFuncionario.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProcurarRGActionPerformed

    private void jButtonProcurarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarNomeActionPerformed
        try 
        {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(jTextFieldNome2.getText());
            funcionario.setCpf(jTextFieldProcurarCPF.getText());
            funcionario.setRg(jTextFieldProcurarRG.getText());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "Cpf", "Rg", "Salario"});
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            this.respostaFuncionario = negocioFuncionario.listar(funcionario);

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }
            
            jTableListarFuncionario.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProcurarNomeActionPerformed

    private void jButtonProcurarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarSalarioActionPerformed
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setSalario(Double.parseDouble(jTextFieldProcurarSalario.getText()));
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "Cpf", "Rg", "Salario"});
            NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
            this.respostaFuncionario = negocioFuncionario.listar(funcionario);

            for (Funcionario f : this.respostaFuncionario) {
                modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }
            jTableListarFuncionario.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProcurarSalarioActionPerformed

    private void jTextFieldProcurarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProcurarSalarioActionPerformed

    private void jTextFieldProcurarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProcurarRGActionPerformed

    private void jTextFieldProcurarCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarCPFKeyTyped
        String caracteres = "0123456789.-";
        if(!caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarCPFKeyTyped

    private void jTextFieldProcurarRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarRGKeyTyped
        String caracteres = "0123456789.";
        if(!caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarRGKeyTyped

    private void jTextFieldProcurarSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarSalarioKeyTyped
        String caracteres = "0123456789";
        if(!caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarSalarioKeyTyped

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
            java.util.logging.Logger.getLogger(TelaConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome;
    private javax.swing.JButton jButtonProcurarCPF;
    private javax.swing.JButton jButtonProcurarNome;
    private javax.swing.JButton jButtonProcurarRG;
    private javax.swing.JButton jButtonProcurarSalario;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRG1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarFuncionario;
    private javax.swing.JTextField jTextFieldNome2;
    private javax.swing.JTextField jTextFieldProcurarCPF;
    private javax.swing.JTextField jTextFieldProcurarRG;
    private javax.swing.JTextField jTextFieldProcurarSalario;
    // End of variables declaration//GEN-END:variables
}