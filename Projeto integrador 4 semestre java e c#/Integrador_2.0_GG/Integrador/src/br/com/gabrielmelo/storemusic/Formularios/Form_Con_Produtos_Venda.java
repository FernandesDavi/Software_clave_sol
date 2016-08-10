/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ProdutosBO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.ProdutosTO;
import java.util.ListIterator;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gabriel Costa
 */
public class Form_Con_Produtos_Venda extends javax.swing.JFrame {

    /**
     * Creates new form Form_Con_Produtos
     */
    LoginTO lTO = new LoginTO();
    String ValidaAcesso;
    
        private Form_Vendas veioframe;
        
            public void envia(Form_Vendas veiodo1, String x){
                jLabel1.setText(x);
            this.veioframe = veiodo1;
            
            
        }

    public void preencherTabela(){
        DefaultTableModel tabelaP = (DefaultTableModel)tblProdutos.getModel();
        ProdutosTO gmcp = new ProdutosTO();
        ProdutosBO gmcpBo = new ProdutosBO();
        ListIterator<ProdutosTO> lstiP = gmcpBo.getProdutos2().listIterator();
            while(lstiP.hasNext()){
                gmcp = lstiP.next();
                tabelaP.addRow(new Object[]{gmcp.getCod_prod(),gmcp.getCod_barras(),gmcp.getTipo(),gmcp.getNome(),gmcp.getUnidade(),gmcp.getValor(),gmcp.getValor_custo(),
                    gmcp.getQuantidade()});
            }
    }
    
    public void buscaNome(){
        DefaultTableModel tabelaP = (DefaultTableModel)tblProdutos.getModel();
        TableRowSorter sorter = null;
        sorter = new TableRowSorter<DefaultTableModel>(tabelaP);  
                      
        tblProdutos.setRowSorter(sorter);
        
        String text = txtConsulta.getText();  
        if (text.length() == 0) {  
          sorter.setRowFilter(null);  
        } else {  
          sorter.setRowFilter(RowFilter.regexFilter(text));  
        }     
     
}
    
    public Form_Con_Produtos_Venda() {
        initComponents();
        preencherTabela();
    }
    
//    public Form_Con_Produtos_compra(LoginTO lto,String nivelAcesso){
//        initComponents();
//        preencherTabela();
//        ValidaAcesso = nivelAcesso;
//    }
    //Form_Compras compras = new Form_Compras();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSessao = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Codigo de Barras:", "Tipo:", "Nome:", "Unidade:", "Valor:", "Valor_custo", "Quantidade:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, 835, 117));

        jButton1.setText("Cadastrar Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 835, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA DE PRODUTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 11, -1, -1));

        lblSessao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, 129, 34));

        lblHorario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Horário"));
        jPanel1.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 328, 120, 34));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtConsulta)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, 90));

        jMenu6.setText("Sair");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Form_Ins_Produtos frmProd = new Form_Ins_Produtos(lTO,ValidaAcesso);
        frmProd.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
       int linha = tblProdutos.getSelectedRow();
       String x =String.valueOf( tblProdutos.getValueAt(linha, 1));
       
        if(veioframe !=null){
            veioframe.retorna1(x);
            this.dispose();
            
        
        }
                
        
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased
        // TODO add your handling code here:
        buscaNome();
    }//GEN-LAST:event_txtConsultaKeyReleased

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
            java.util.logging.Logger.getLogger(Form_Con_Produtos_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Produtos_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Produtos_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Produtos_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Con_Produtos_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblSessao;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
