package GUI;
import DAO.vendas_DAO;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.venda;

/**
 *
 * @author Casa
 */
public class historico extends javax.swing.JFrame {

    /**
     * Creates new form historico
     */
    public historico() {
        initComponents();
        tboard();
        
        jTable1.getTableHeader().setFont(new Font("Sergoe UI", Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(new Color(0, 0, 0));
        jTable1.setRowHeight(25);
        
    }

private void soma(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
            String sql = "SELECT SUM(total_venda) AS soma FROM venda";
            
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
   
            if (rs.next()) {
            double soma = rs.getDouble("soma");
            txtSomatorio.setText(String.format("%.2f", soma));
        }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

   public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT nome_cliente_fk, cliente_fk, produto_fk, quant_prod, unit, total_prod, total_venda, pagamento, recebido, troco, data_venda FROM venda");
    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1)); 
        v.add(rs.getString(2)); 
        v.add(rs.getString(3)); 
        v.add(rs.getString(4)); 
        v.add(rs.getString(5)); 
        v.add(rs.getString(6)); 
        v.add(rs.getString(7)); 
        v.add(rs.getString(8));  
        v.add(rs.getString(9)); 
        v.add(rs.getString(10)); 
        v.add(rs.getString(11)); 
        
        dt.addRow(v);
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }
   
   public void printer(){
       MessageFormat header = new MessageFormat("Relatório de vendas");
       MessageFormat footer = new MessageFormat("TechnoJalt");
       try {
           PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
           set.add(OrientationRequested.LANDSCAPE);
           jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
           JOptionPane.showMessageDialog(null,"Relatório gerado com sucesso!");

       }
       catch(java.awt.print.PrinterException e){
           JOptionPane.showMessageDialog(null, "/n"+"Failed"
           + "\n" + e);
       }

   }
   



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtSomatorio = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        relatoria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(87, 41, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 221, 181));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "IdCliente", "Produto", "Quantidade", "Unitário", "TotalProd", "TotalVenda", "Pagamento", "Recebido", "Troco", "DataVenda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 145, 77));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1140, 450));

        jPanel4.setBackground(new java.awt.Color(255, 182, 115));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 41, 42));
        jLabel1.setText("Histórico de vendas");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1160, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(87, 41, 42));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jLabel13.setText("Busca por data:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 460, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(87, 41, 42));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        jLabel14.setText("Somatório das vendas:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 221, 181));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(87, 41, 42));
        jButton2.setText("Limpar campos");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 110, 30));

        txtSomatorio.setEditable(false);
        txtSomatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSomatorioActionPerformed(evt);
            }
        });
        jPanel3.add(txtSomatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1160, 630));

        btnMenu.setBackground(new java.awt.Color(87, 41, 42));
        btnMenu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/casa.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setBorder(null);
        btnMenu.setPreferredSize(new java.awt.Dimension(75, 23));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 91, 37));

        relatoria.setText("Relatório");
        relatoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatoriaMouseClicked(evt);
            }
        });
        jMenuBar1.add(relatoria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu_caixa m = new menu_caixa();
        dispose();
        m.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
txtSearch.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
    String search = txtSearch.getText();

    try {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        Statement s = (Statement) conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT nome_cliente_fk, cliente_fk, produto_fk, quant_prod, unit, total_prod, total_venda, pagamento, recebido, troco, data_venda FROM venda "
            + "WHERE data_venda LIKE '%" + search + "%'");

        double soma = 0.0;

        while (rs.next()) {
            Vector<Object> v = new Vector<>();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));
            v.add(rs.getString(5));
            v.add(rs.getString(6));
            v.add(rs.getString(7));
            v.add(rs.getString(8));
            v.add(rs.getString(9));
            v.add(rs.getString(10));
            v.add(rs.getString(11));

            dt.addRow(v);

            // Somar apenas os valores dos campos correspondentes à pesquisa
            double totalVenda = rs.getDouble("total_venda");
            soma += totalVenda;
        }

        // Atualiza o campo de texto txtSomatorio com o valor da soma
        txtSomatorio.setText(String.format("%.2f", soma));
    } catch (Exception e) {
        e.printStackTrace();
    }
            
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSomatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSomatorioActionPerformed
    }//GEN-LAST:event_txtSomatorioActionPerformed

    private void relatoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatoriaMouseClicked
        printer();
    }//GEN-LAST:event_relatoriaMouseClicked

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
            java.util.logging.Logger.getLogger(historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu relatoria;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSomatorio;
    // End of variables declaration//GEN-END:variables
}
