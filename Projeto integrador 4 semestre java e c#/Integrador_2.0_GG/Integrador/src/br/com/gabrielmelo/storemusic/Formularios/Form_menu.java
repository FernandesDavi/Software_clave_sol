/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.Nivel_AcessoTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Davi
 */
public class Form_menu extends javax.swing.JFrame {
    String ValidaAcesso;
    LoginTO lTO = new LoginTO();
    Nivel_AcessoTO nTO = new Nivel_AcessoTO();
    public String geraRelogio(){
      Date data = new Date();
      SimpleDateFormat horaF = new SimpleDateFormat("HH:mm:ss");
      String hora = horaF.format(data);
        return hora;
    }
    
    public Form_menu(LoginTO lto,String nivelAcesso){
        initComponents();
        lTO = lto;
        ValidaAcesso = nivelAcesso;
        String sessao = lTO.getUsuario();
        lblSessao.setText(""+sessao);
        lblHorario.setText(geraRelogio());
        timer1.start();
        
    }
    
    public Form_menu() {
        initComponents();
        //lblSessao.setText(""+sessao+"");
        String sessao = lTO.getUsuario();
        geraRelogio();
       //System.out.println("Teste: "+lTO.getUsuario()+"");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem10 = new javax.swing.JMenuItem();
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        Painel_Menu = new javax.swing.JPanel();
        lblPlanilha = new javax.swing.JLabel();
        lblCadastra = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBusca = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBackup = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSeguranca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSessao = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem10.setText("jMenuItem10");

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Painel_Menu.setBackground(new java.awt.Color(238, 220, 192));

        lblPlanilha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlanilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/planilha_96.png"))); // NOI18N
        lblPlanilha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlanilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlanilhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPlanilhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPlanilhaMouseExited(evt);
            }
        });

        lblCadastra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/cadastro_96.png"))); // NOI18N
        lblCadastra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCadastraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCadastraMouseExited(evt);
            }
        });

        lblVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/vendas_96.png"))); // NOI18N
        lblVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVendaMouseExited(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("Vendas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cadastrar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Relatórios");

        lblBusca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/BUSCA_96.png"))); // NOI18N
        lblBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Consulta");

        lblBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/backup_96.png"))); // NOI18N
        lblBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackupMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Backup");

        lblSeguranca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/compras96.png"))); // NOI18N
        lblSeguranca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSeguranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSegurancaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSegurancaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSegurancaMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Compras");

        lblSessao.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblSessao.setForeground(new java.awt.Color(0, 153, 0));
        lblSessao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        lblHorario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(0, 153, 0));
        lblHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHorario.setBorder(javax.swing.BorderFactory.createTitledBorder("Horário"));

        javax.swing.GroupLayout Painel_MenuLayout = new javax.swing.GroupLayout(Painel_Menu);
        Painel_Menu.setLayout(Painel_MenuLayout);
        Painel_MenuLayout.setHorizontalGroup(
            Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_MenuLayout.createSequentialGroup()
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_MenuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lbl2))
                    .addGroup(Painel_MenuLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_MenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_MenuLayout.createSequentialGroup()
                        .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_MenuLayout.createSequentialGroup()
                                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_MenuLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(39, 39, 39)))
                                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_MenuLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(lblHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_MenuLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(30, 30, 30))))
                            .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPlanilha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_MenuLayout.createSequentialGroup()
                                    .addComponent(lblBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(lblSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(Painel_MenuLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))))
        );
        Painel_MenuLayout.setVerticalGroup(
            Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlanilha, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(lblCadastra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Painel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(234, 218, 194));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu1.setText("Cadastro");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Contador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Contas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Fornecedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Funcionario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Produtos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Usuario");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMenuItem8.setText("Cliente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Contador");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem11.setText("Contas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Fornecedor");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Funcionario");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Produtos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setText("Usuario");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operações");

        jMenuItem16.setText("Vendas");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuItem17.setText("Compras");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Recebimento de Produtos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Relatório");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu5.setText("Backup");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Logout");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Form_Ins_Cliente(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Form_Ins_Cont(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Form_Ins_Contas(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new Form_Ins_Forn(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Form_Ins_Func(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Form_Ins_Produtos(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       new Form_Con_Cliente(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new Form_Con_Cont(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new Form_Con_Contas(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       new Form_Con_Forn(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       new Form_Con_Func(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new Form_Con_Produtos(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       new Form_Con_Usuario(lTO,ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Deseja Realizar a venda com o cliente padrão?");
        System.err.println(x);
        if(x == 1){
         Form_Cliente_venda frmCli = new Form_Cliente_venda();
         frmCli.setVisible(true);
          this.dispose();
        }
        else {
        Form_Vendas frmVendas = new Form_Vendas();
        frmVendas.setVisible(true);
         this.dispose();
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void lblPlanilhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlanilhaMouseEntered
        // TODO add your handling code here:
        lblPlanilha.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/planilha_128.png")));
    }//GEN-LAST:event_lblPlanilhaMouseEntered

    private void lblPlanilhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlanilhaMouseExited
        // TODO add your handling code here:
        lblPlanilha.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/planilha_96.png")));
    }//GEN-LAST:event_lblPlanilhaMouseExited

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
         this.dispose();
        LoginTeste lt = new LoginTeste();
        lt.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void lblCadastraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastraMouseEntered
        // TODO add your handling code here:
        lblCadastra.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/cadastro_128.png")));
    }//GEN-LAST:event_lblCadastraMouseEntered

    private void lblCadastraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastraMouseExited
        // TODO add your handling code here:
        lblCadastra.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/cadastro_96.png")));
    }//GEN-LAST:event_lblCadastraMouseExited

    private void lblVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendaMouseEntered
        // TODO add your handling code here:
        lblVenda.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/vendas_128.png")));
    }//GEN-LAST:event_lblVendaMouseEntered

    private void lblVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendaMouseExited
        // TODO add your handling code here:
        lblVenda.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/vendas_96.png")));
    }//GEN-LAST:event_lblVendaMouseExited

    private void lblBuscaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscaMouseEntered
        // TODO add your handling code here:
        lblBusca.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/BUSCA_128.png")));
    }//GEN-LAST:event_lblBuscaMouseEntered

    private void lblBuscaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscaMouseExited
        // TODO add your handling code here:
        lblBusca.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/BUSCA_96.png")));
    }//GEN-LAST:event_lblBuscaMouseExited

    private void lblBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseEntered
        // TODO add your handling code here:
        lblBackup.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/backup_128.png")));
    }//GEN-LAST:event_lblBackupMouseEntered

    private void lblBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseExited
        // TODO add your handling code here:
         lblBackup.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/backup_96.png")));
    }//GEN-LAST:event_lblBackupMouseExited

    private void lblSegurancaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSegurancaMouseEntered
        // TODO add your handling code here:
        lblSeguranca.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/compra128.png")));
    }//GEN-LAST:event_lblSegurancaMouseEntered

    private void lblSegurancaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSegurancaMouseExited
        // TODO add your handling code here:
        lblSeguranca.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/compras96.png")));
    }//GEN-LAST:event_lblSegurancaMouseExited

    private void lblCadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastraMouseClicked
        // TODO add your handling code here:
        Form_Ins_Geral frmGeral = new Form_Ins_Geral(lTO,ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_lblCadastraMouseClicked

    private void lblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscaMouseClicked
        // TODO add your handling code here:
        Form_Con_Geral frmGeral = new Form_Con_Geral(lTO,ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_lblBuscaMouseClicked

    private void lblVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendaMouseClicked
        // TODO add your handling code here:
       int x = JOptionPane.showConfirmDialog(null, "Deseja Realizar a venda com o cliente padrão?");
        System.err.println(x);
        if(x == 2){
        }else
        if(x == 1){
          Form_Cliente_venda frmCli = new Form_Cliente_venda();
          frmCli.setVisible(true);
          //this.dispose();
        }else {
             int y = JOptionPane.showConfirmDialog(null, "Cpf na Nota?");
             if (y == 0){
                String cpf = JOptionPane.showInputDialog("Informe o cpf: ");
                Form_Vendas frmVendas = new Form_Vendas(cpf);
                frmVendas.setVisible(true);
                //this.dispose();
             }else{
                Form_Vendas frmVendas = new Form_Vendas();
                frmVendas.setVisible(true);
                //this.dispose(); 
             }
        }
        
    }//GEN-LAST:event_lblVendaMouseClicked

    private void lblBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseClicked
        // TODO add your handling code here:
        Form_Bckp frmBcp = new Form_Bckp(lTO,ValidaAcesso);
        frmBcp.show();
      
    }//GEN-LAST:event_lblBackupMouseClicked

    private void lblPlanilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlanilhaMouseClicked
        // TODO add your handling code here:
        Form_Rel_Geral frmGeral = new Form_Rel_Geral(lTO,ValidaAcesso);
        frmGeral.show();
        
    }//GEN-LAST:event_lblPlanilhaMouseClicked

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        // TODO add your handling code here:
        lblHorario.setText(geraRelogio());
    }//GEN-LAST:event_timer1OnTime

    private void timer2OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer2OnTime
        // TODO add your handling code here:
        //lblHorario.setText(geraRelogio());
    }//GEN-LAST:event_timer2OnTime

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        new Form_Rel_Geral(lTO, ValidaAcesso).setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
              new Form_Con_Fornecedor_compras().setVisible(true);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
                new Form_atualizar_estoque().setVisible(true);

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void lblSegurancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSegurancaMouseClicked
        // TODO add your handling code here:
        new Form_Con_Fornecedor_compras().setVisible(true);
        
    }//GEN-LAST:event_lblSegurancaMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
          Form_Bckp frmBcp = new Form_Bckp(lTO,ValidaAcesso);
        frmBcp.show();
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(Form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblBackup;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblCadastra;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblPlanilha;
    private javax.swing.JLabel lblSeguranca;
    private javax.swing.JLabel lblSessao;
    private javax.swing.JLabel lblVenda;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
