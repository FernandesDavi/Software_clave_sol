/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.LoginBO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.NivelAcessoTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author aluno
 */

public class Form_Rel_Geral extends javax.swing.JFrame {
   
    String ValidaAcesso;
    LoginTO lTO = new LoginTO();
    String l2=null;
    LoginBO lbo = new LoginBO();
    
    public String geraRelogio(){
      Date data = new Date();
      SimpleDateFormat horaF = new SimpleDateFormat("HH:mm:ss");
      String hora = horaF.format(data);
        return hora;
    }
    
    public Form_Rel_Geral() {
        initComponents();
    }

    public Form_Rel_Geral(int xxt,LoginTO lto,String nivelAcesso){
        initComponents();
        lTO = lto;
        String sessao = lTO.getUsuario();
        lblSessao.setText(""+sessao);
        
        ValidaAcesso = nivelAcesso;
        lblHorario.setText(geraRelogio());
        lblRetorna.setVisible(false);
        timer1.start();
    }
    
    public Form_Rel_Geral(LoginTO lto,String nivelAcesso) {
        initComponents();
        
            
        
        
        lTO = lto;
        String sessao = lTO.getUsuario();
        lblSessao.setText(""+sessao);
        
        ValidaAcesso = nivelAcesso;
        lblHorario.setText(geraRelogio());
        timer1.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        Painel_Ins_Geral = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblContas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRetorna = new javax.swing.JLabel();
        lblSessao = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblFinancas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel4.setText("jLabel4");

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 501));

        Painel_Ins_Geral.setBackground(new java.awt.Color(238, 220, 192));
        Painel_Ins_Geral.setPreferredSize(new java.awt.Dimension(700, 491));
        Painel_Ins_Geral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/usuario_96.png"))); // NOI18N
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseExited(evt);
            }
        });
        Painel_Ins_Geral.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 152, 141));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Funcionário");
        Painel_Ins_Geral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cliente");
        Painel_Ins_Geral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        lblFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/funcionario_96.png"))); // NOI18N
        lblFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseExited(evt);
            }
        });
        Painel_Ins_Geral.add(lblFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 141, 136));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Relatórios");
        Painel_Ins_Geral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        lblContas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/contas_96.png"))); // NOI18N
        lblContas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContasMouseExited(evt);
            }
        });
        Painel_Ins_Geral.add(lblContas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 180, 150));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CONTAS");
        Painel_Ins_Geral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        lblRetorna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRetorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png"))); // NOI18N
        lblRetorna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRetorna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetornaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRetornaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRetornaMouseExited(evt);
            }
        });
        Painel_Ins_Geral.add(lblRetorna, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 43, 40));

        lblSessao.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblSessao.setForeground(new java.awt.Color(0, 153, 0));
        lblSessao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSessao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário"));
        Painel_Ins_Geral.add(lblSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 130, 37));

        lblHorario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(0, 153, 0));
        lblHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horário"));
        Painel_Ins_Geral.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 130, 37));

        lblFinancas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/financa96.png"))); // NOI18N
        lblFinancas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFinancas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinancasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFinancasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFinancasMouseExited(evt);
            }
        });
        Painel_Ins_Geral.add(lblFinancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 168, 126));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Finanças");
        Painel_Ins_Geral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Logout");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Ins_Geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Ins_Geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        // TODO add your handling code here:
        Form_Rel_Cli frmCli = new Form_Rel_Cli(lTO,ValidaAcesso);
        frmCli.show();
        this.dispose();
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void lblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseEntered
        // TODO add your handling code here:
        lblUsuario.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/usuario_128.png")));
    }//GEN-LAST:event_lblUsuarioMouseEntered

    private void lblUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseExited
        // TODO add your handling code here:
        lblUsuario.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/usuario_96.png")));
    }//GEN-LAST:event_lblUsuarioMouseExited

    private void lblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseClicked
        // TODO add your handling code here:
        Form_Rel_Func frmFunc = new Form_Rel_Func(lTO,ValidaAcesso);
        frmFunc.show();
        this.dispose();
    }//GEN-LAST:event_lblFuncionarioMouseClicked

    private void lblFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseEntered
        // TODO add your handling code here:
        lblFuncionario.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/funcionario_128.png")));
    }//GEN-LAST:event_lblFuncionarioMouseEntered

    private void lblFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseExited
        // TODO add your handling code here:
        lblFuncionario.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/funcionario_96.png")));
    }//GEN-LAST:event_lblFuncionarioMouseExited

    private void lblContasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContasMouseEntered
        // TODO add your handling code here:
        lblContas.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/contas_128.png")));
    }//GEN-LAST:event_lblContasMouseEntered

    private void lblContasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContasMouseExited
        // TODO add your handling code here:
        lblContas.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/contas_96.png")));
    }//GEN-LAST:event_lblContasMouseExited

    private void lblContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContasMouseClicked
        // TODO add your handling code here:
        Form_Rel_Contas frmContas = new Form_Rel_Contas(lTO,ValidaAcesso);
        frmContas.show();
        this.dispose();
    }//GEN-LAST:event_lblContasMouseClicked

    private void lblRetornaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseClicked
        // TODO add your handling code here:
           if(ValidaAcesso.equals("Usuario") || ValidaAcesso.equals("usuario") ){
                Form_Menu_Simples frmSim = new Form_Menu_Simples(lTO,ValidaAcesso);
                frmSim.show();
                this.dispose();
            }else{
                Form_menu frmMenu = new Form_menu(lTO,ValidaAcesso);
                frmMenu.show();
                this.dispose();
            }
        
    }//GEN-LAST:event_lblRetornaMouseClicked

    private void lblRetornaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseEntered
        // TODO add your handling code here:
        lblRetorna.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_48.png")));
    }//GEN-LAST:event_lblRetornaMouseEntered

    private void lblRetornaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseExited
        // TODO add your handling code here:
        lblRetorna.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png")));
    }//GEN-LAST:event_lblRetornaMouseExited

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        // TODO add your handling code here:
        lblHorario.setText(geraRelogio());
    }//GEN-LAST:event_timer1OnTime

    private void lblFinancasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinancasMouseClicked
        // TODO add your handling code here:
        Form_financas frmFin = new Form_financas();
        frmFin.show();
        this.dispose();
    }//GEN-LAST:event_lblFinancasMouseClicked

    private void lblFinancasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinancasMouseEntered
        // TODO add your handling code here:
        lblFinancas.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/financa128.png")));
    }//GEN-LAST:event_lblFinancasMouseEntered

    private void lblFinancasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinancasMouseExited
        // TODO add your handling code here:
        lblFinancas.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/financa96.png")));
    }//GEN-LAST:event_lblFinancasMouseExited

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
        LoginTeste lt = new LoginTeste();
        lt.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(Form_Rel_Geral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Rel_Geral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Rel_Geral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Rel_Geral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Rel_Geral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Ins_Geral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblContas;
    private javax.swing.JLabel lblFinancas;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblRetorna;
    private javax.swing.JLabel lblSessao;
    private javax.swing.JLabel lblUsuario;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
