/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Formularios;

import br.com.gabrielmelo.storemusic.BO.CaixaBO;
import br.com.gabrielmelo.storemusic.TO.CaixaTO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;
import java.awt.Color;
import java.util.ListIterator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Davi
 */
public final class Form_financas extends javax.swing.JFrame {

    /**
     * Creates new form Form_financas
     */
    public String Jbuton;
   
    public Form_financas() {
        initComponents();
        VendaAvista("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as x from caixa where status = 0 AND cod_comp is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        VendaPrazo("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as y from caixa where status = 1 AND cod_comp is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        CompraAvista("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as x from caixa where status = 0 AND cod_venda is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        CompraPrazo("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as y from caixa where status = 1 AND cod_venda is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        subtrair();
       
        criaGrafico();

    }
    

    public void subtrair() {
        float x, y, rs;
        x = (Float.parseFloat(jLabel1.getText()));
        y = (Float.parseFloat(jLabel3.getText()));
        rs = x - y;
        jLabel11.setText(String.valueOf(rs));
        if (rs < 0) {
            pnlCaixa.setBackground(Color.red);
        } else if (rs == 0) {
            pnlCaixa.setBackground(Color.YELLOW);
        } else {
            pnlCaixa.setBackground(Color.GREEN);
        }

        //float x, y, rs;
        x = (Float.parseFloat(jLabel2.getText()));
        y = (Float.parseFloat(jLabel4.getText()));
        rs = x - y;
        jLabel12.setText(String.valueOf(rs));
        if (rs < 0) {
            pnlFulturo.setBackground(Color.red);
        } else if (rs == 0) {
            pnlFulturo.setBackground(Color.YELLOW);
        } else {
            pnlFulturo.setBackground(Color.GREEN);
        }

    }

    public void VendaAvista(String query) {
        //DefaultTableModel tabelaP = (DefaultTableModel)tblContador.getModel();
        CaixaTO gmcp = new CaixaTO();
        CaixaBO gmcpBo = new CaixaBO();
        ListIterator<CaixaTO> lstiP = gmcpBo.ConsultarGenericoVista(query).listIterator();
        while (lstiP.hasNext()) {
            gmcp = lstiP.next();
            jLabel1.setText(String.valueOf(gmcp.getVista()));
        }
    }

    public void VendaPrazo(String query) {
        //DefaultTableModel tabelaP = (DefaultTableModel)tblContador.getModel();
        CaixaTO gmcp = new CaixaTO();
        CaixaBO gmcpBo = new CaixaBO();
        ListIterator<CaixaTO> lstiP = gmcpBo.ConsultarGenericoPrazo(query).listIterator();
        while (lstiP.hasNext()) {
            gmcp = lstiP.next();
            jLabel2.setText(String.valueOf(gmcp.getPrazo()));
        }
    }

    public void CompraAvista(String query) {
        //DefaultTableModel tabelaP = (DefaultTableModel)tblContador.getModel();
        CaixaTO gmcp = new CaixaTO();
        CaixaBO gmcpBo = new CaixaBO();
        ListIterator<CaixaTO> lstiP = gmcpBo.ConsultarGenericoVista(query).listIterator();
        while (lstiP.hasNext()) {
            gmcp = lstiP.next();
            jLabel3.setText(String.valueOf(gmcp.getVista()));
        }
    }

    public void CompraPrazo(String query) {
        //DefaultTableModel tabelaP = (DefaultTableModel)tblContador.getModel();
        CaixaTO gmcp = new CaixaTO();
        CaixaBO gmcpBo = new CaixaBO();
        ListIterator<CaixaTO> lstiP = gmcpBo.ConsultarGenericoPrazo(query).listIterator();
        while (lstiP.hasNext()) {
            gmcp = lstiP.next();
            jLabel4.setText(String.valueOf(gmcp.getPrazo()));
        }
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(Float.parseFloat(jLabel1.getText()), "Venda à Vista", "REAIS");
        dataset.addValue(Float.parseFloat(jLabel3.getText()), "Compra à Vista", "REAIS");
        dataset.addValue(Float.parseFloat(jLabel2.getText()), "Venda à Prazo", "REAIS");
        dataset.addValue(Float.parseFloat(jLabel4.getText()), "Compra à Prazo", "REAIS");
        dataset.addValue(Float.parseFloat(jLabel11.getText()), "Valor em caixa", "REAIS");
        dataset.addValue(Float.parseFloat(jLabel12.getText()), "Lançamentos Futuros", "REAIS");

        return dataset;

    }

    public void criaGrafico() {
        CategoryDataset cds = createDataset();
        String titulo = "Finanças";
        String eixoy = "Valores";
        String txt_legenda = "Legenda:";
        boolean legenda = true;
        boolean tooltips = true;
        boolean urls = true;
        JFreeChart graf = ChartFactory.createBarChart3D(titulo, txt_legenda, eixoy, cds, PlotOrientation.VERTICAL, legenda, tooltips, urls);
        ChartPanel myChartPanel = new ChartPanel(graf, true);
        myChartPanel.setSize(jPanel5.getWidth(), jPanel5.getHeight());
        myChartPanel.setVisible(true);
        jPanel5.removeAll();
        jPanel5.add(myChartPanel);
        jPanel5.revalidate();
        jPanel5.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        pnlCaixa = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlFulturo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 90, 440, 0));

        jPanel8.setBackground(new java.awt.Color(238, 220, 192));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle Financeiro"));

        pnlCaixa.setBackground(new java.awt.Color(153, 255, 153));
        pnlCaixa.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor em Caixa"));
        pnlCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");
        pnlCaixa.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        pnlFulturo.setBackground(new java.awt.Color(153, 255, 153));
        pnlFulturo.setBorder(javax.swing.BorderFactory.createTitledBorder("Lançamentos Futuros"));
        pnlFulturo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");
        pnlFulturo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 35, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda à Vista"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra à Prazo"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 32, -1, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda à Prazo"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra à Prazo"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Hoje");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 24, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Este Mês ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 24, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Este Ano");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 24, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafico"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 340));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(pnlCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(pnlFulturo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlFulturo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 410));

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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        VendaAvista("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as x from caixa where status = 0 AND cod_comp is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        VendaPrazo("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as y from caixa where status = 1 AND cod_comp is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        CompraAvista("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as x from caixa where status = 0 AND cod_venda is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        CompraPrazo("SELECT EXTRACT(DAY FROM data_hora) AS DIA , SUM(valor) as y from caixa where status = 1 AND cod_venda is null and EXTRACT(DAY FROM data_hora) = EXTRACT(DAY FROM CURRENT_DATE);");
        subtrair();
        criaGrafico();
        Jbuton = "HOJE";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        VendaAvista("SELECT EXTRACT(month FROM data_hora) AS mes , SUM(valor) as x from caixa where status = 0 AND cod_comp is null and EXTRACT(month FROM data_hora) = EXTRACT(month FROM CURRENT_DATE);");
        VendaPrazo("SELECT EXTRACT(month FROM data_hora) AS mes , SUM(valor) as y from caixa where status = 1 AND cod_comp is null and EXTRACT(month FROM data_hora) = EXTRACT(month FROM CURRENT_DATE);");
        CompraAvista("SELECT EXTRACT(month FROM data_hora) AS mes , SUM(valor) as x from caixa where status = 0 AND cod_venda is null and EXTRACT(month FROM data_hora) = EXTRACT(month FROM CURRENT_DATE);");
        CompraPrazo("SELECT EXTRACT(month FROM data_hora) AS mes , SUM(valor) as y from caixa where status = 1 AND cod_venda is null and EXTRACT(month FROM data_hora) = EXTRACT(month FROM CURRENT_DATE);");
        subtrair();
        criaGrafico();
        Jbuton = "MÊS";

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        VendaAvista("SELECT EXTRACT(year FROM data_hora) AS ano , SUM(valor) as x from caixa where status = 0 AND cod_comp is null and EXTRACT(year FROM data_hora) = EXTRACT(year FROM CURRENT_DATE);");
        VendaPrazo("SELECT EXTRACT(year FROM data_hora) AS ano , SUM(valor) as y from caixa where status = 1 AND cod_comp is null and EXTRACT(year FROM data_hora) = EXTRACT(year FROM CURRENT_DATE);");
        CompraAvista("SELECT EXTRACT(year FROM data_hora) AS ano , SUM(valor) as x from caixa where status = 0 AND cod_venda is null and EXTRACT(year FROM data_hora) = EXTRACT(year FROM CURRENT_DATE);");
        CompraPrazo("SELECT EXTRACT(year FROM data_hora) AS ano , SUM(valor) as y from caixa where status = 1 AND cod_venda is null and EXTRACT(year FROM data_hora) = EXTRACT(year FROM CURRENT_DATE);");
        subtrair();
        criaGrafico();
        Jbuton = "ANO";

    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_financas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_financas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_financas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_financas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_financas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlCaixa;
    private javax.swing.JPanel pnlFulturo;
    // End of variables declaration//GEN-END:variables
}
