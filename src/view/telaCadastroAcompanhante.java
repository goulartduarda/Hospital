/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno
 */
public class telaCadastroAcompanhante extends javax.swing.JDialog {

    /**
     * Creates new form JDialog
     */
    public telaCadastroAcompanhante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanelTitulo = new javax.swing.JPanel();
        jLabel1CadastroAcompanhante = new javax.swing.JLabel();
        JPanelDados = new javax.swing.JPanel();
        jLabel1IdAcompanhante = new javax.swing.JLabel();
        jTextField1IdAcompanhante = new javax.swing.JTextField();
        jLabel1NomeAcompanhante = new javax.swing.JLabel();
        jTextField1NomeAcompanhante = new javax.swing.JTextField();
        jLabel1CPFAcompanhante = new javax.swing.JLabel();
        jTextField1CPFAcompanhante = new javax.swing.JTextField();
        jLabel1Fone1 = new javax.swing.JLabel();
        jTextField1Fone1 = new javax.swing.JTextField();
        jLabel1GrauParentesco = new javax.swing.JLabel();
        jTextField1GrauParentesco = new javax.swing.JTextField();
        jLabel1Email = new javax.swing.JLabel();
        jTextField1Email = new javax.swing.JTextField();
        jLabel1Fone2 = new javax.swing.JLabel();
        jTextField1Fone2 = new javax.swing.JTextField();
        jLabel2Sexo = new javax.swing.JLabel();
        jRadioButton1SexoM = new javax.swing.JRadioButton();
        jRadioButton1SexoF = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1Status = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButton1Novo = new javax.swing.JButton();
        jButton1Cancelar = new javax.swing.JButton();
        jButton1Gravar = new javax.swing.JButton();
        jButton1Buscar = new javax.swing.JButton();
        jButton1Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1CadastroAcompanhante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1CadastroAcompanhante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1CadastroAcompanhante.setText("Cadastro de Acompanhante");
        jLabel1CadastroAcompanhante.setToolTipText("");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1CadastroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1CadastroAcompanhante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        JPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1IdAcompanhante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1IdAcompanhante.setText("Id");

        jTextField1IdAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1IdAcompanhanteActionPerformed(evt);
            }
        });

        jLabel1NomeAcompanhante.setText("Nome Completo Acompanhante");

        jLabel1CPFAcompanhante.setText("CPF ");

        jLabel1Fone1.setText("Fone 1");

        jTextField1Fone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1Fone1ActionPerformed(evt);
            }
        });

        jLabel1GrauParentesco.setText("Grau Parentesco");

        jLabel1Email.setText("Email");

        jLabel1Fone2.setText("Fone 2");

        jLabel2Sexo.setText("Sexo");

        jRadioButton1SexoM.setText("Masculino");
        jRadioButton1SexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1SexoMActionPerformed(evt);
            }
        });

        jRadioButton1SexoF.setText("Feminino");

        jLabel1.setText("Status");

        jTextField1Status.setEnabled(false);

        javax.swing.GroupLayout JPanelDadosLayout = new javax.swing.GroupLayout(JPanelDados);
        JPanelDados.setLayout(JPanelDadosLayout);
        JPanelDadosLayout.setHorizontalGroup(
            JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1Email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1GrauParentesco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                        .addComponent(jTextField1IdAcompanhante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1IdAcompanhante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1NomeAcompanhante, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1NomeAcompanhante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2Sexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDadosLayout.createSequentialGroup()
                            .addComponent(jRadioButton1SexoM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton1SexoF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1GrauParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDadosLayout.createSequentialGroup()
                        .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelDadosLayout.createSequentialGroup()
                                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1CPFAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1CPFAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1Fone1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1Fone1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPanelDadosLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jTextField1Fone2))
                            .addGroup(JPanelDadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1Fone2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addGap(14, 14, 14))
                    .addGroup(JPanelDadosLayout.createSequentialGroup()
                        .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Status, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPanelDadosLayout.setVerticalGroup(
            JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1IdAcompanhante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1IdAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1NomeAcompanhante)
                    .addComponent(jLabel1CPFAcompanhante)
                    .addComponent(jLabel1Fone1))
                .addGap(4, 4, 4)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1NomeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1CPFAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Fone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel1Fone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1Fone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2Sexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1SexoM)
                            .addComponent(jRadioButton1SexoF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Email)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1GrauParentesco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1GrauParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jButton1Novo.setText("Novo");
        jButton1Novo.setActionCommand("1");
        jButton1Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1NovoActionPerformed(evt);
            }
        });

        jButton1Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButton1Cancelar.setText("Cancelar");
        jButton1Cancelar.setActionCommand("0");
        jButton1Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelarActionPerformed(evt);
            }
        });

        jButton1Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Download.png"))); // NOI18N
        jButton1Gravar.setText("Gravar");
        jButton1Gravar.setActionCommand("0");
        jButton1Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GravarActionPerformed(evt);
            }
        });

        jButton1Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButton1Buscar.setText("Buscar");
        jButton1Buscar.setActionCommand("1");

        jButton1Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButton1Sair.setText("Sair");
        jButton1Sair.setActionCommand("1");
        jButton1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jButton1Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1NovoActionPerformed
        utillities.Utillities.ativaDesativa(true, jPanelBotoes);
    }//GEN-LAST:event_jButton1NovoActionPerformed

    private void jButton1CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelarActionPerformed
      utillities.Utillities.ativaDesativa(false, jPanelBotoes);
    }//GEN-LAST:event_jButton1CancelarActionPerformed

    private void jButton1GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GravarActionPerformed
        utillities.Utillities.ativaDesativa(false, jPanelBotoes);
    }//GEN-LAST:event_jButton1GravarActionPerformed

    private void jButton1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SairActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1SairActionPerformed

    private void jTextField1IdAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1IdAcompanhanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IdAcompanhanteActionPerformed

    private void jTextField1Fone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1Fone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1Fone1ActionPerformed

    private void jRadioButton1SexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1SexoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1SexoMActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaCadastroAcompanhante dialog = new telaCadastroAcompanhante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelDados;
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButton1Cancelar;
    private javax.swing.JButton jButton1Gravar;
    private javax.swing.JButton jButton1Novo;
    private javax.swing.JButton jButton1Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1CPFAcompanhante;
    private javax.swing.JLabel jLabel1CadastroAcompanhante;
    private javax.swing.JLabel jLabel1Email;
    private javax.swing.JLabel jLabel1Fone1;
    private javax.swing.JLabel jLabel1Fone2;
    private javax.swing.JLabel jLabel1GrauParentesco;
    private javax.swing.JLabel jLabel1IdAcompanhante;
    private javax.swing.JLabel jLabel1NomeAcompanhante;
    private javax.swing.JLabel jLabel2Sexo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JRadioButton jRadioButton1SexoF;
    private javax.swing.JRadioButton jRadioButton1SexoM;
    private javax.swing.JTextField jTextField1CPFAcompanhante;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JTextField jTextField1Fone1;
    private javax.swing.JTextField jTextField1Fone2;
    private javax.swing.JTextField jTextField1GrauParentesco;
    private javax.swing.JTextField jTextField1IdAcompanhante;
    private javax.swing.JTextField jTextField1NomeAcompanhante;
    private javax.swing.JTextField jTextField1Status;
    // End of variables declaration//GEN-END:variables
}
