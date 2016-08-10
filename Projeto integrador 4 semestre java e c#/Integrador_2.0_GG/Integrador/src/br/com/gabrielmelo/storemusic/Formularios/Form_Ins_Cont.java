/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ContadorBO;
import br.com.gabrielmelo.storemusic.TO.ContadorTO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.Utilitarios.ModificaString;
import br.com.gabrielmelo.storemusic.Utilitarios.cpf;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Costa
 */
public class Form_Ins_Cont extends javax.swing.JFrame {

    /**
     * Creates new form Form_Ins_Cont
     */
    LoginTO lTO = new LoginTO();
    List<ContadorTO> lstC = new LinkedList<ContadorTO>();
    String ValidaAcesso;

    public void preencherCampo(int id) {
        //int codigo = new ModificaString().extrairCodigo(dados);

        ContadorTO c = new ContadorTO();
        c.setCod_cont(id);
        ListIterator<ContadorTO> lstiP = new ContadorBO().getNomeId(c).listIterator();

        while (lstiP.hasNext()) {
            c = lstiP.next();

            txtNome.setText(c.getNome());
            txtCnpj.setText(c.getCnpj());
            txtIe.setText(c.getIe());
            //txt.setText(c.getData());
            txtTelefone.setText(c.getTelefone());
            txtCelular.setText(c.getCelular());
            txtLogra.setText(c.getLogradouro());
            txtNum.setText(String.valueOf(c.getNumero()));
            txtCep.setText(c.getCep());
            txtComplemento.setText(c.getComplemento());
        }
    }

    public Form_Ins_Cont() {
        initComponents();
        btnExclui.setVisible(false);
        btnAltera.setVisible(false);
        jLabel12.setVisible(false);
        txtId.setVisible(false);
    }

    public Form_Ins_Cont(LoginTO lto, String nivelAcesso) {
        initComponents();
        lTO = lto;
        ValidaAcesso = nivelAcesso;
        btnExclui.setVisible(false);
        btnAltera.setVisible(false);
        jLabel12.setVisible(false);
        txtId.setVisible(false);
    }

    public Form_Ins_Cont(int _id) {
        initComponents();
        txtId.setText(String.valueOf(_id));
        preencherCampo(_id);
        btnCadastrar.setVisible(false);
        jLabel12.setVisible(false);
        txtId.setVisible(false);
    }

    public Form_Ins_Cont(int _id, LoginTO lto, String nivelAcesso) {
        initComponents();
        txtId.setText(String.valueOf(_id));
        preencherCampo(_id);
        ValidaAcesso = nivelAcesso;
        btnCadastrar.setVisible(false);
        jLabel12.setVisible(false);
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtIe = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLogra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btnExclui = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAltera = new javax.swing.JButton();
        lblVolta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(238, 220, 192));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(238, 220, 192));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CADASTRO DE CONTADOR:");

        jPanel3.setBackground(new java.awt.Color(238, 220, 192));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Gerais"));

        txtIe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIeMouseClicked(evt);
            }
        });

        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });

        txtId.setEditable(false);
        txtId.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdCaretUpdate(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CODIGO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cnpj");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ie");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CELULAR:");

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setToolTipText("");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(100, 100, 100)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(109, 109, 109)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(120, 120, 120)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(136, 136, 136)
                        .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(86, 86, 86)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 90, 189, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("NÚMERO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 92, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CEP:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("LOGRADOURO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 54, -1, -1));

        txtLogra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLograKeyPressed(evt);
            }
        });
        jPanel1.add(txtLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 52, 189, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("COMPLEMENTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 168, -1, -1));

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 166, 189, -1));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setToolTipText("");
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 128, 189, -1));

        jPanel4.setBackground(new java.awt.Color(238, 220, 192));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExclui.setBackground(new java.awt.Color(255, 0, 0));
        btnExclui.setText("EXCLUIR");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(51, 102, 255));
        btnMostrar.setText("BUSCAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(51, 255, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAltera.setBackground(new java.awt.Color(255, 255, 51));
        btnAltera.setText("ALTERAR");
        btnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraActionPerformed(evt);
            }
        });

        lblVolta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png"))); // NOI18N
        lblVolta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(64, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnAltera)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExclui)))
                    .addComponent(lblVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jMenu2.setText("Sair");
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Form_Ins_Geral frmGeral = new Form_Ins_Geral(lTO, ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void txtIeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIeMouseClicked
        // TODO add your handling code here:
        txtCnpj.setForeground(Color.BLACK);
        txtCnpj.setBackground(Color.WHITE);
        txtIe.setBackground(Color.GRAY);
        txtIe.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtIeMouseClicked

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        // TODO add your handling code here:
        txtNome.setBackground(Color.GRAY);
        txtNome.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtIdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdCaretUpdate
        // TODO add your handling code here:
        //preencherCombo();
    }//GEN-LAST:event_txtIdCaretUpdate

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        // TODO add your handling code here:
        txtLogra.setForeground(Color.BLACK);
        txtLogra.setBackground(Color.WHITE);
        txtNum.setBackground(Color.GRAY);
        txtNum.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtNumKeyPressed

    private void txtLograKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLograKeyPressed
        // TODO add your handling code here:
        txtCelular.setForeground(Color.BLACK);
        txtCelular.setBackground(Color.WHITE);
        txtLogra.setBackground(Color.GRAY);
        txtLogra.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtLograKeyPressed

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed
        // TODO add your handling code here:
        txtCep.setForeground(Color.BLACK);
        txtCep.setBackground(Color.WHITE);
        txtComplemento.setBackground(Color.GRAY);
        txtComplemento.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtComplementoKeyPressed

    private void lblVoltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseClicked
        // TODO add your handling code here:
        Form_Ins_Geral frmGeral = new Form_Ins_Geral(lTO, ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_lblVoltaMouseClicked

    private void lblVoltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseEntered
        // TODO add your handling code here:
        lblVolta.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_48.png")));
    }//GEN-LAST:event_lblVoltaMouseEntered

    private void lblVoltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseExited
        // TODO add your handling code here:
        lblVolta.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png")));
    }//GEN-LAST:event_lblVoltaMouseExited

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        // TODO add your handling code here:
        int rs = JOptionPane.showConfirmDialog(null, "Deseja excluir esse usuario?");
        System.out.println(rs);
        if (rs == 0) {
            ContadorTO c = new ContadorTO();
            ContadorBO cBO = new ContadorBO();

            c.setCod_cont(Integer.parseInt(txtId.getText()));
            cBO.excluir(c);
        }
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        Form_Con_Cont frmCon = new Form_Con_Cont(lTO, ValidaAcesso);
        frmCon.show();
        this.dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        // TODO add your handling code here:
        ContadorTO c = new ContadorTO();
        ContadorBO cBO = new ContadorBO();

        //c.setCod_cli(Integer.parseInt(txtId.getText()));
        c.setNome(txtNome.getText());
        c.setCnpj(txtCnpj.getText());
        c.setIe(txtIe.getText());
        c.setLogradouro(txtLogra.getText());
        c.setNumero(Integer.parseInt(txtNum.getText()));
        c.setCep(txtCep.getText());
        c.setComplemento(txtComplemento.getText());
        c.setTelefone(txtTelefone.getText());
        c.setCelular(txtCelular.getText());
        //executando no banco
        cBO.alterar(c);

    }//GEN-LAST:event_btnAlteraActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        //Dados tabela cliente

        ContadorTO c = new ContadorTO();
        ContadorBO cBO = new ContadorBO();
        c.setNome(txtNome.getText());
        c.setCnpj(txtCnpj.getText());
        c.setIe(txtIe.getText());
        c.setLogradouro(txtLogra.getText());
        c.setNumero(Integer.parseInt(txtNum.getText()));
        c.setCep(txtCep.getText());
        c.setComplemento(txtComplemento.getText());
        c.setTelefone(txtTelefone.getText());
        c.setCelular(txtCelular.getText());
        //executando no banco
        cBO.salvar(c);

    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Ins_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ins_Cont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltera;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblVolta;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIe;
    private javax.swing.JTextField txtLogra;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
