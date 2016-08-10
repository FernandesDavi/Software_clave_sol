/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.ClienteBO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ListIterator;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gabriel Costa
 */
public class Form_Con_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Form_Con_Cliente
     */
    LoginTO lTO = new LoginTO();
    String ValidaAcesso;
    
     public String geraRelogio(){
      Date data = new Date();
      SimpleDateFormat horaF = new SimpleDateFormat("HH:mm:ss");
      String hora = horaF.format(data);
        return hora;
    }
    
    public void preencherTabela(){
        DefaultTableModel tabelaP = (DefaultTableModel)tblCliente.getModel();
        ClienteTO gmcp = new ClienteTO();
        ClienteBO gmcpBo = new ClienteBO();
        ListIterator<ClienteTO> lstiP = gmcpBo.getCliente().listIterator();
            while(lstiP.hasNext()){
                gmcp = lstiP.next();
                tabelaP.addRow(new Object[]{gmcp.getCod_cli(), gmcp.getNome(),gmcp.getCpf(),gmcp.getRg(),gmcp.getData(),gmcp.getLogradouro(),
                    gmcp.getNumero(),gmcp.getCep(),gmcp.getComplemento(),gmcp.getTelefone(),gmcp.getCelular()});
            }
    }

    public void buscaNome(){
        DefaultTableModel tabelaP = (DefaultTableModel)tblCliente.getModel();
        TableRowSorter sorter = null;
        sorter = new TableRowSorter<DefaultTableModel>(tabelaP);  
                      
        tblCliente.setRowSorter(sorter);
        
        String text = txtConsulta.getText();  
        if (text.length() == 0) {  
          sorter.setRowFilter(null);  
        } else {  
          sorter.setRowFilter(RowFilter.regexFilter(text));  
        }     
     
}
    
    public Form_Con_Cliente() {
        initComponents();
        preencherTabela();
    }

    public Form_Con_Cliente(LoginTO lto,String nivelAcesso) {
        initComponents();
        preencherTabela();
        lTO = lto;
        ValidaAcesso = nivelAcesso;
        String sessao = lTO.getUsuario();
        lblSessao.setText(""+sessao);
        timer1.start();
        lblHorario.setText(geraRelogio());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        btnVolta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblSessao = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 220, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolta.setText("VOLTAR");
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 309, 760, -1));

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "Nome:", "Cpf:", "Rg:", "Data de Nascimento", "Logradouro:", "Numero:", "Cep", "Complemento", "Telefone:", "Celular:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 760, 124));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA DE CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 11, -1, -1));

        lblSessao.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblSessao.setForeground(new java.awt.Color(0, 153, 0));
        lblSessao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário"));
        jPanel1.add(lblSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 129, 39));

        lblHorario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(0, 153, 0));
        lblHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horário"));
        jPanel1.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 340, 120, 39));

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
                .addGap(23, 23, 23)
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 760, -1));

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        // TODO add your handling code here:
        Form_Con_Geral frmCli = new Form_Con_Geral(lTO,ValidaAcesso);
        frmCli.show();
        this.dispose();
    }//GEN-LAST:event_btnVoltaActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tabelaP = (DefaultTableModel)tblCliente.getModel();
        int nro = tblCliente.getSelectedRow();
        String id = String.valueOf(tblCliente.getValueAt(nro, 0));
        // int id = Integer.parseInt(tblCliente.getValueAt(nro, 0));
        System.out.println(id);
       
        
        // gmcp.setCpf(cpf);
        int aux = Integer.parseInt(id);
         Form_Ins_Cliente frmCli = new Form_Ins_Cliente(aux,lTO,ValidaAcesso);

         frmCli.setVisible(true);
         this.dispose();

    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased
        // TODO add your handling code here:
        buscaNome();
    }//GEN-LAST:event_txtConsultaKeyReleased

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       Form_Con_Geral frmProd = new Form_Con_Geral(lTO,ValidaAcesso);
        frmProd.show();
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(Form_Con_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Con_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Con_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblSessao;
    private javax.swing.JTable tblCliente;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
