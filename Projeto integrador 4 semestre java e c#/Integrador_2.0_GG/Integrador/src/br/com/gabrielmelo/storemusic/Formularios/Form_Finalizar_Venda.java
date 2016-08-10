/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.CaixaBO;
import br.com.gabrielmelo.storemusic.TO.CaixaTO;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author aluno
 */
public class Form_Finalizar_Venda extends javax.swing.JFrame {

    public Form_Finalizar_Venda() {
        initComponents();
        jLabel4.setVisible(false);
        btnPrazo.setVisible(false);
        jPanel2.setVisible(false);
        jLabel7.setVisible(false);
        

    }

    public Form_Finalizar_Venda(double _x, int y) {
        initComponents();

        txtTotalPagar.setText(String.valueOf(_x));
        jLabel11.setText(String.valueOf(_x));
        jLabel4.setText(String.valueOf(y));
        jLabel4.setVisible(false);
        btnPrazo.setVisible(false);
        jPanel2.setVisible(false);
        jLabel7.setVisible(false);

    }

    public void subtrair() {
        try {

            Double ttpg = Double.parseDouble(txtTotalPagar.getText());
            Double pg = Double.parseDouble(txtValor.getText());
            double x = ttpg - pg;

            if (ttpg < pg) {
                txtTroco.setText(String.valueOf(pg - ttpg));
                
            } else {
                jLabel11.setText(String.valueOf(x));
                txtTotalPagar.setText(String.valueOf(x));
            }
            if (x <= 0) {
                JOptionPane.showMessageDialog(null, "Troco: "+txtTroco.getText());
                JOptionPane.showMessageDialog(null, "Fim, Obrigado e volte sempre ");
                this.dispose();
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EROUUU ");
        }
    }

    public void cadastrar(int status, int parcela) {
        try {

            CaixaTO c = new CaixaTO();
            CaixaBO cBO = new CaixaBO();
            c.setValor(Float.parseFloat(txtValor.getText()));
            c.setVenda(Integer.parseInt(jLabel4.getText()));
            c.setStatus(status);
            c.setParcela(parcela);

            cBO.salvar(c);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EROUUU dnv");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnPrazo = new javax.swing.JButton();
        btnVista = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValorDesconto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rbDinheiro = new javax.swing.JRadioButton();
        rbCartao = new javax.swing.JRadioButton();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(238, 220, 192));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 410, 11));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("SALDO TOTAL: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 410, 10));

        btnPrazo.setText("A Prazo");
        btnPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrazoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, 49));

        btnVista.setText("A vista");
        btnVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaActionPerformed(evt);
            }
        });
        jPanel3.add(btnVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 49));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jLabel4.setEnabled(false);
        jLabel4.setFocusable(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescontoKeyPressed(evt);
            }
        });
        jPanel1.add(txtDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 66, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("%");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtValorDesconto.setEditable(false);
        jPanel1.add(txtValorDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 138, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Valor do Desconto: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Desconto: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton1.setText("Desconto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 80));

        buttonGroup1.add(rbDinheiro);
        rbDinheiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbDinheiro.setSelected(true);
        rbDinheiro.setText("Dinheiro");
        rbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDinheiroActionPerformed(evt);
            }
        });
        jPanel3.add(rbDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        buttonGroup1.add(rbCartao);
        rbCartao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbCartao.setText("Cartão");
        rbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCartaoActionPerformed(evt);
            }
        });
        jPanel3.add(rbCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });
        jPanel3.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 142, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Troco");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtTroco.setEnabled(false);
        jPanel3.add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 141, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 410, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 421, 12));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtTotalPagar.setEnabled(false);
        jPanel3.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 183, -1));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Debito");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("1");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("3");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 80, 110));

        jLabel7.setText("jLabel7");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 110, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pagamento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 9, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaActionPerformed

        cadastrar(0, 0);
        subtrair();
        txtValor.setText("");


    }//GEN-LAST:event_btnVistaActionPerformed

    private void rbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDinheiroActionPerformed
        txtTroco.setVisible(true);
        jLabel5.setVisible(true);
        btnPrazo.setVisible(false);
        jPanel2.setVisible(false);
        btnVista.setVisible(true);

    }//GEN-LAST:event_rbDinheiroActionPerformed

    private void btnPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrazoActionPerformed
        cadastrar(1, Integer.parseInt(jLabel7.getText()));
        subtrair();
        txtValor.setText("");
    }//GEN-LAST:event_btnPrazoActionPerformed

    private void rbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCartaoActionPerformed
        txtTroco.setVisible(false);
        jLabel5.setVisible(false);
        txtValor.setText(txtTotalPagar.getText());
        jPanel2.setVisible(true);

    }//GEN-LAST:event_rbCartaoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        btnPrazo.setVisible(true);
        btnVista.setVisible(false);
        jLabel7.setText(String.valueOf(1));
        float x = Float.parseFloat(txtValor.getText());
        JOptionPane.showMessageDialog(null, "Parcelas de 1x: " + "R$" + x);

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        btnPrazo.setVisible(true);
        btnVista.setVisible(false);
        jLabel7.setText(String.valueOf(2));
        float x = Float.parseFloat(txtValor.getText());
        float rs = x / 2;
        JOptionPane.showMessageDialog(null, "Parcelas de 2x: " + "R$" + rs);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        btnPrazo.setVisible(true);
        btnVista.setVisible(false);
        jLabel7.setText(String.valueOf(3));
        float x = Float.parseFloat(txtValor.getText());
        float rs = x / 3;
        JOptionPane.showMessageDialog(null, "Parcelas de 3x: " + "R$" + rs);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        btnVista.setVisible(true);
        btnPrazo.setVisible(false);

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void txtDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 
        }
    }//GEN-LAST:event_txtDescontoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            InputMap imap = jPanel1.getInputMap(jPanel1.WHEN_IN_FOCUSED_WINDOW);  

            imap.put(KeyStroke.getKeyStroke("1"), "botao1");  

            txtDesconto.setEnabled(true);
            txtDesconto.requestFocus();
        }
    }//GEN-LAST:event_formKeyPressed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
     
    }//GEN-LAST:event_txtValorKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            float b = Float.parseFloat(txtTotalPagar.getText());
            float c = Float.parseFloat(txtDesconto.getText());
            float x;
            x = ((b * c) / 100);
            txtTotalPagar.setText(String.valueOf(b - x));
            txtValorDesconto.setText(String.valueOf(x));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Finalizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Finalizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Finalizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Finalizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Finalizar_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrazo;
    private javax.swing.JButton btnVista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton rbCartao;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorDesconto;
    // End of variables declaration//GEN-END:variables
}
