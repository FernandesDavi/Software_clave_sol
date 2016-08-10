/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ClienteBO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import java.util.ListIterator;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Davi
 */
public class Form_Cliente_venda extends javax.swing.JFrame {


    public Form_Cliente_venda() {
        initComponents();
        preencherTabela();
    }
 public void buscaNome(){
        DefaultTableModel tabelaP = (DefaultTableModel)tbCliente.getModel();
        TableRowSorter sorter = null;
        sorter = new TableRowSorter<DefaultTableModel>(tabelaP);  
                      
        tbCliente.setRowSorter(sorter);
        
        String text = txtConsulta.getText();  
        if (text.length() == 0) {  
          sorter.setRowFilter(null);  
        } else {  
          sorter.setRowFilter(RowFilter.regexFilter(text));  
        }     
     
    }
public void preencherTabela(){
        DefaultTableModel tabelaP = (DefaultTableModel)tbCliente.getModel();
        ClienteTO gmcp = new ClienteTO();
        ClienteBO gmcpBo = new ClienteBO();
        ListIterator<ClienteTO> lstiP = gmcpBo.getCliente().listIterator();
            while(lstiP.hasNext()){
                gmcp = lstiP.next();
                tabelaP.addRow(new Object[]{gmcp.getCod_cli(), gmcp.getNome(),gmcp.getCpf(),gmcp.getTelefone(),gmcp.getCelular()});
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(238, 220, 192));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "Nome", "CPF", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCliente);
        if (tbCliente.getColumnModel().getColumnCount() > 0) {
            tbCliente.getColumnModel().getColumn(0).setResizable(false);
            tbCliente.getColumnModel().getColumn(1).setResizable(false);
            tbCliente.getColumnModel().getColumn(2).setResizable(false);
            tbCliente.getColumnModel().getColumn(3).setResizable(false);
            tbCliente.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 256));

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
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 800, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 440));

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
         DefaultTableModel tabelaP = (DefaultTableModel)tbCliente.getModel();
        int nro = tbCliente.getSelectedRow();
        String id = String.valueOf(tbCliente.getValueAt(nro, 0));
       // int id = Integer.parseInt(tblCliente.getValueAt(nro, 0));
        System.out.println(id);
       
        
       // gmcp.setCpf(cpf);
        int aux = Integer.parseInt(id);
         Form_Vendas frmCli = new Form_Vendas(aux);

         frmCli.setVisible(true);
         this.dispose();

    }//GEN-LAST:event_tbClienteMouseClicked

    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased
        // TODO add your handling code here:
        buscaNome();
    }//GEN-LAST:event_txtConsultaKeyReleased

    private void jMenu2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2KeyPressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
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
            java.util.logging.Logger.getLogger(Form_Cliente_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Cliente_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Cliente_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Cliente_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Cliente_venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
