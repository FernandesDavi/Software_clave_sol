/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ClienteBO;
import br.com.gabrielmelo.storemusic.BO.ItensVendasBO;
import br.com.gabrielmelo.storemusic.BO.ProdutosBO;
import br.com.gabrielmelo.storemusic.BO.VendasBO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.ItensVendaTO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.ProdutosTO;
import br.com.gabrielmelo.storemusic.TO.VendasTO;
import java.awt.event.KeyEvent;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Davi
 */
public class Form_Vendas extends javax.swing.JFrame {

    String ValidaAcesso;
    LoginTO lTO = new LoginTO();
    Form_Con_Produtos_Venda janela = new Form_Con_Produtos_Venda();

    public void retorna1(String nome) {

        txtCodProd.setText(String.valueOf(nome));
        txtCodProd.requestFocus();
    }

    public void carregarNome(int id) {
        ClienteTO c = new ClienteTO();
        c.setCod_cli(id);
        ListIterator<ClienteTO> lstiP = new ClienteBO().getNomeId(c).listIterator();
        while (lstiP.hasNext()) {
            c = lstiP.next();
            txtNome.setText(c.getNome());
            txtCpf.setText(c.getCpf());
        }
    }

    public Form_Vendas(int _x) {
        initComponents();
        jLabel4.setVisible(false);
        jLabel4.setText(String.valueOf(_x));
        System.out.print(_x);
        carregarNome(Integer.parseInt(jLabel4.getText()));
    }

    public Form_Vendas(int _x, LoginTO lto, String nivelAcesso) {
        initComponents();
        lTO = lto;
        ValidaAcesso = nivelAcesso;
        jLabel4.setVisible(false);
        jLabel4.setText(String.valueOf(_x));
        System.out.print(_x);
        carregarNome(Integer.parseInt(jLabel4.getText()));
    }

    public void atualizaEstoque() {
        try {

            ProdutosTO pTO = new ProdutosTO();
            ProdutosBO pBo = new ProdutosBO();
            for (int i = 0; i < tblVenda.getRowCount(); i++) {
                pTO.setCod_prod(Integer.parseInt(tblVenda.getValueAt(i, 0).toString()));
                pTO.setQuantidade(Integer.parseInt(tblVenda.getValueAt(i, 2).toString()));
                pBo.AtualizaEstoque(pTO);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro atulizar: " + e);

        }

    }

    public boolean verificaQtd(ProdutosTO x) {
        try {

            ProdutosTO pTO = new ProdutosTO();
            ProdutosBO pBo = new ProdutosBO();
            int rs = 0;
            ListIterator<ProdutosTO> lsiP = pBo.getNomeId(x).listIterator();
            while (lsiP.hasNext()) {
                pTO = lsiP.next();
                rs = (pTO.getQuantidade());
            }
            int qtd = Integer.valueOf(txtQuantidade.getText());
            if (qtd > rs) {
                JOptionPane.showMessageDialog(null, "A quatidade informada é maior que: " + rs);
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO " + e);
            return false;

        }
    }

    public void cadastrarItens(int cod_venda) {

        for (int i = 0; i < tblVenda.getRowCount(); i++) {
            int qtd = Integer.parseInt(tblVenda.getValueAt(i, 2).toString());
            int cod_prod = Integer.parseInt(tblVenda.getValueAt(i, 0).toString());

            ItensVendaTO iv = new ItensVendaTO();
            ItensVendasBO ivBO = new ItensVendasBO();
            iv.setQuantidade(qtd);
            iv.setCod_prod(cod_prod);
            iv.setCod_venda(cod_venda);
            ivBO.salvar(iv);
        }

    }

    public int cadastrarVenda() {

        VendasTO v = new VendasTO();
        VendasBO vBO = new VendasBO();
        v.setValtotal(Float.parseFloat(txtSubtotal.getText()));
        v.setCod_func(1);
        //v.setCod_cli(Integer.parseInt(jLabel4.getText()));
        v.setCod_cli(1);
        System.out.print(jLabel4.getText());
        vBO.salvar(v);
        System.out.println(v.getCod_cli());
        return (v.getCod_venda());

    }

    public void CalcSubtotal() {
        try {

            Double rs = 0.0;
            for (int i = 0; i < tblVenda.getRowCount(); i++) {
                rs += Double.parseDouble(tblVenda.getValueAt(i, 4).toString());
            }

            txtSubtotal.setText(String.valueOf(rs));
            //valorTotal = 0;  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO " + e);

        }
    }

    public void AdicionarProduto(ProdutosTO x) {
        DefaultTableModel tabelaP = (DefaultTableModel) tblVenda.getModel();
        ProdutosTO gmcp = new ProdutosTO();
        ProdutosBO gmcpBo = new ProdutosBO();
        ListIterator<ProdutosTO> lstiP = gmcpBo.getNomeId(x).listIterator();
        while (lstiP.hasNext()) {
            gmcp = lstiP.next();
            float t = (gmcp.getValor());
            float x1 = (t * Float.parseFloat(txtQuantidade.getText()));
            tabelaP.addRow(new Object[]{gmcp.getCod_prod(), gmcp.getNome(), txtQuantidade.getText(), gmcp.getValor(), x1});
        }
    }

    public Form_Vendas(LoginTO lTO, String nivelAcesso) {
        initComponents();
        jLabel4.setVisible(false);
        ValidaAcesso = nivelAcesso;
        lTO = lTO;
        carregarNome(Integer.parseInt(jLabel4.getText()));

    }

    public Form_Vendas() {
        initComponents();
        jLabel4.setVisible(false);
        carregarNome(Integer.parseInt(jLabel4.getText()));

    }

    public Form_Vendas(String cpf) {
        initComponents();
        jLabel4.setVisible(false);
        carregarNome(Integer.parseInt(jLabel4.getText()));
        txtCpf.setText(cpf);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblRetorna = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "QTD", "Preço", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVenda);
        if (tblVenda.getColumnModel().getColumnCount() > 0) {
            tblVenda.getColumnModel().getColumn(0).setResizable(false);
            tblVenda.getColumnModel().getColumn(1).setResizable(false);
            tblVenda.getColumnModel().getColumn(2).setResizable(false);
            tblVenda.getColumnModel().getColumn(3).setResizable(false);
            tblVenda.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 610, 320));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Subtotal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 40));

        jButton2.setText("Finalizar Venda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, 30));

        lblRetorna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRetorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png"))); // NOI18N
        lblRetorna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel1.add(lblRetorna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 43, 60));

        txtSubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 288, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cliente")));

        jLabel4.setText("1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CPF");

        txtNome.setEnabled(false);

        txtCpf.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCpf))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Produto");

        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        txtCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdKeyPressed(evt);
            }
        });

        jButton1.setText("Busca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("QTD:");

        txtQuantidade.setText("1");
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 310, 110));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (janela == null) {
            janela = new Form_Con_Produtos_Venda();
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
            janela.setResizable(false);
        } else {
            janela.setVisible(true);
            janela.setResizable(false);
        }
        janela.envia(this, null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            double x = Double.parseDouble(txtSubtotal.getText());
            int zz = cadastrarVenda();
            Form_Finalizar_Venda frmFvenda = new Form_Finalizar_Venda(x, zz);

            cadastrarItens(zz);
            atualizaEstoque();
            frmFvenda.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem produtos!!");
            txtCodProd.requestFocus();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void lblRetornaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseEntered
        // TODO add your handling code here:
        lblRetorna.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_48.png")));
    }//GEN-LAST:event_lblRetornaMouseEntered

    private void lblRetornaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseExited
        // TODO add your handling code here:
        lblRetorna.setIcon(new ImageIcon(getClass().getResource("/br/com/gabrielmelo/storemusic/media/return_32.png")));
    }//GEN-LAST:event_lblRetornaMouseExited

    private void lblRetornaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetornaMouseClicked
        // TODO add your handling code here:
        if (ValidaAcesso.equals("Usuario") || ValidaAcesso.equals("usuario")) {
            Form_Menu_Simples frmSim = new Form_Menu_Simples(lTO, ValidaAcesso);
            System.err.println(ValidaAcesso);
            frmSim.show();
            this.dispose();
        } else {
            Form_menu frmMenu = new Form_menu(lTO, ValidaAcesso);
            frmMenu.show();
            this.dispose();
        }

        //Form_menu frmMenu = new Form_menu();
        //frmMenu.show();
        //this.dispose();
    }//GEN-LAST:event_lblRetornaMouseClicked

    private void txtCodProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuantidade.requestFocus();

        }
    }//GEN-LAST:event_txtCodProdKeyPressed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                ProdutosTO p = new ProdutosTO();
                p.setCod_barras(txtCodProd.getText());
                if (verificaQtd(p) == true) {
                    AdicionarProduto(p);
                    CalcSubtotal();

                }

                txtCodProd.setText("");
                txtQuantidade.setText("1");
                txtCodProd.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Adicione um produto ou quantidade valida");
                txtCodProd.requestFocus();

            }

        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void tblVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendaMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Deseja Remover esse Produto?");
        if (x == 0) {
            int linha = tblVenda.getSelectedRow();
            ((DefaultTableModel) tblVenda.getModel()).removeRow(linha);

        }
    }//GEN-LAST:event_tblVendaMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRetorna;
    private javax.swing.JTable tblVenda;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JLabel txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
