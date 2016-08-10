package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ClienteBO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.NivelAcessoTO;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Form_Ins_Cliente extends javax.swing.JFrame {
    
    LoginTO lTO = new LoginTO();
    String ValidaAcesso;
    List<ClienteTO> lstC = new LinkedList<ClienteTO>();

    /*
    public Form_menu(LoginTO lto){
        initComponents();
        lTO = lto;
        String sessao = lTO.getUsuario();
        lblSessao.setText(""+sessao);
        timer1.start();
       
        lblHorario.setText(geraRelogio());
    }
    */
    
    public Form_Ins_Cliente(LoginTO lto,String nivelAcesso){
        initComponents();
        lTO = lto;   
        ValidaAcesso = nivelAcesso;
         btnExclui.setVisible(false);
        btnAltera.setVisible(false);
        jLabel12.setVisible(false);
        txtId.setVisible(false);
    }
    
    public void preencherCampo(int id){
        ClienteTO c = new ClienteTO();
        c.setCod_cli(id);
        ListIterator<ClienteTO> lstiP = new ClienteBO().getNomeId(c).listIterator();
          
        while(lstiP.hasNext()){
            c = lstiP.next();
            txtNome.setText(c.getNome());
            //txtId.setText(String.valueOf(c.getCod_cli()));
            txtCpf.setText(c.getCpf());
            txtRg.setText(c.getRg());
            txtDtaNasc.setText(c.getData());
            txtTelefone.setText(c.getTelefone());
            txtCelular.setText(c.getCelular());
            txtLogra.setText(c.getLogradouro());
            txtDtaNasc.setText(c.getData());
            txtNum.setText(String.valueOf(c.getNumero()));
            txtCep.setText(c.getCep());
            txtComplemento.setText(c.getComplemento());
        } 
    }
    
    public Form_Ins_Cliente() {
        initComponents();
      //  preencherCombo();
        btnExclui.setVisible(false);
        btnAltera.setVisible(false);
                jLabel12.setVisible(false);
        txtId.setVisible(false);

    }
     public Form_Ins_Cliente(int _id) {
                 
        initComponents();
        txtId.setText(String.valueOf(_id));
        
            
            btnCadastrar.setVisible(false);
        btnMostrar.setVisible(false);
        preencherCampo(_id);
                jLabel12.setVisible(false);
        txtId.setVisible(false);
     }
     
    public Form_Ins_Cliente(int _id,LoginTO lto,String nivelAcesso) {
                 
        initComponents();
        txtId.setText(String.valueOf(_id));
        ValidaAcesso = nivelAcesso;
            preencherCampo(_id);
             btnCadastrar.setVisible(false);
                jLabel12.setVisible(false);
        txtId.setVisible(false);
        
     } 
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLogra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        lblVolta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtRg = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtDtaNasc = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAltera = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(238, 220, 192));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("CADASTRO DE CLIENTE:");

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 189, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("NÚMERO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CEP:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("LOGRADOURO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtLogra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLograKeyPressed(evt);
            }
        });
        jPanel1.add(txtLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 189, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("COMPLEMENTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 189, -1));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setToolTipText("");
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 189, -1));

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

        jPanel3.setBackground(new java.awt.Color(238, 220, 192));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Gerais"));

        txtRg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRgMouseClicked(evt);
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
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RG:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DATA DE NASCIMENTO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CELULAR:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("");

        try {
            txtDtaNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtaNasc.setToolTipText("");

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
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDtaNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRg)
                            .addComponent(txtNome)
                            .addComponent(txtId)
                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txtTelefone)
                            .addComponent(txtCelular))
                        .addGap(10, 10, 10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        btnMostrar.setBackground(new java.awt.Color(51, 102, 255));
        btnMostrar.setText("BUSCAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnExclui.setBackground(new java.awt.Color(255, 0, 0));
        btnExclui.setText("EXCLUIR");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar)
                            .addComponent(btnAltera)
                            .addComponent(btnMostrar)
                            .addComponent(btnExclui))))
                .addGap(36, 36, 36))
        );

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        //Dados tabela cliente
        ClienteTO c = new ClienteTO();
        ClienteBO cBO = new ClienteBO();
        c.setNome(txtNome.getText());
        c.setCpf(txtCpf.getText());
        c.setRg(txtRg.getText());
        c.setData(txtDtaNasc.getText());
        c.setLogradouro(txtLogra.getText());
        c.setNumero(Integer.parseInt(txtNum.getText()));
        c.setCep(txtCep.getText());
        c.setComplemento(txtComplemento.getText());
        c.setTelefone(txtTelefone.getText());
        c.setCelular(txtCelular.getText());
        //executando no banco
        cBO.salvar(c);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        // TODO add your handling code here:
        ClienteTO c = new ClienteTO();
        ClienteBO cBO = new ClienteBO();
        
        //c.setCod_cli(Integer.parseInt(txtId.getText()));
        c.setNome(txtNome.getText());
        c.setCpf(txtCpf.getText());
        c.setRg(txtRg.getText());
        c.setData(txtDtaNasc.getText());
        c.setLogradouro(txtLogra.getText());
        c.setNumero(Integer.parseInt(txtNum.getText()));
        c.setCep(txtCep.getText());
        c.setComplemento(txtComplemento.getText());
        c.setTelefone(txtTelefone.getText());
        c.setCelular(txtCelular.getText());
        //executando no banco
        cBO.alterar(c);
        
    }//GEN-LAST:event_btnAlteraActionPerformed

    private void txtIdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdCaretUpdate
        // TODO add your handling code here:
        //preencherCombo();
    }//GEN-LAST:event_txtIdCaretUpdate

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        // TODO add your handling code here:
        int rs = JOptionPane.showConfirmDialog(null, "Deseja excluir esse usuario?");
        System.out.println(rs);
        if(rs == 0){
        ClienteTO c = new ClienteTO();
        ClienteBO cBO = new ClienteBO();
        
        
        c.setCod_cli(Integer.parseInt(txtId.getText()));
        cBO.excluir(c);
        }
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        Form_Con_Cliente frmCon = new Form_Con_Cliente(lTO,ValidaAcesso);
        frmCon.show();
        this.dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void lblVoltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseEntered
        // TODO add your handling code here:
        lblVolta.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_48.png")));
    }//GEN-LAST:event_lblVoltaMouseEntered

    private void lblVoltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseExited
        // TODO add your handling code here:
        lblVolta.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png")));
    }//GEN-LAST:event_lblVoltaMouseExited

    private void lblVoltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltaMouseClicked
        // TODO add your handling code here:
        Form_Ins_Geral frmGeral = new Form_Ins_Geral(lTO,ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_lblVoltaMouseClicked

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        // TODO add your handling code here:
        txtNome.setBackground(Color.GRAY);
        txtNome.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtRgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRgMouseClicked
        // TODO add your handling code here:
        txtCpf.setForeground(Color.BLACK);
        txtCpf.setBackground(Color.WHITE);
        txtRg.setBackground(Color.GRAY);
        txtRg.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtRgMouseClicked

    private void txtLograKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLograKeyPressed
        // TODO add your handling code here:
        txtCelular.setForeground(Color.BLACK);
        txtCelular.setBackground(Color.WHITE);
        txtLogra.setBackground(Color.GRAY);
        txtLogra.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtLograKeyPressed

    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        // TODO add your handling code here:
        txtLogra.setForeground(Color.BLACK);
        txtLogra.setBackground(Color.WHITE);
        txtNum.setBackground(Color.GRAY);
        txtNum.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtNumKeyPressed

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed
        // TODO add your handling code here:
        txtCep.setForeground(Color.BLACK);
        txtCep.setBackground(Color.WHITE);
        txtComplemento.setBackground(Color.GRAY);
        txtComplemento.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtComplementoKeyPressed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Form_Ins_Geral frmGeral = new Form_Ins_Geral(lTO,ValidaAcesso);
        frmGeral.show();
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(Form_Ins_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ins_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ins_Cliente().setVisible(true);
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblVolta;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDtaNasc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogra;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
