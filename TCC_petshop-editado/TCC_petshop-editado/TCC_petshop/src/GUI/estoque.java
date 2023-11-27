/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import DAO.produto_DAO;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.*;
import javax.swing.*;

import javax.swing.filechooser.FileSystemView;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.produto;
public class estoque extends javax.swing.JFrame {

    /**
     * Creates new form estoque
     */
    public estoque() {
        initComponents();
        tboard();
    }

   public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT codigo_prod, nome_prod, cartegoria, fornecedor, preco, estoque_geral FROM produto");
    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  
        v.add(rs.getString(2));  
        v.add(rs.getString(3));  
        v.add(rs.getString(4));  
        v.add(rs.getString(5));  
        v.add(rs.getString(6)); 

        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        cbProdutos = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 182, 115));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(61, 368, 0, 96);

        jPanel3.setBackground(new java.awt.Color(87, 41, 42));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 40, 40);

        jPanel4.setBackground(new java.awt.Color(255, 145, 77));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estoque");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(506, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(435, 435, 435))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 0, 1010, 40);

        jPanel2.setBackground(new java.awt.Color(255, 221, 181));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cartegoria", "Fornecedor", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 860, 420));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 41, 42));
        jLabel6.setText("Produto: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Id:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 20));

        txtIdProd.setEditable(false);
        jPanel2.add(txtIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 41, 42));
        jLabel8.setText("Estoque:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 120, -1));
        jPanel2.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 41, 42));
        jLabel9.setText("Adicionar quantidade:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtEstoque.setEditable(false);
        jPanel2.add(txtEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 190, -1));

        cbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutosActionPerformed(evt);
            }
        });
        cbProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbProdutosKeyReleased(evt);
            }
        });
        jPanel2.add(cbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 380, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 900, 560);

        jButton3.setBackground(new java.awt.Color(255, 182, 115));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(87, 41, 42));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        jButton3.setText("Adicionar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 170, 120, 40);

        jButton8.setBackground(new java.awt.Color(255, 182, 115));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(87, 41, 42));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        jButton8.setText("Atualizar");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(10, 440, 120, 40);

        jButton9.setBackground(new java.awt.Color(255, 182, 115));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(87, 41, 42));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/sair.png"))); // NOI18N
        jButton9.setText("Voltar");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(10, 350, 120, 40);

        jButton6.setBackground(new java.awt.Color(255, 182, 115));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(87, 41, 42));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/delete (1).png"))); // NOI18N
        jButton6.setText("Deletar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(10, 260, 120, 40);

        jMenu1.setText("Gerar relatório PDF");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     adicionar();
     tboard();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
      private void adicionar() {
    try {            
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

        // Buscar o valor atual do estoque do produto selecionado
        String codigoProduto = txtIdProd.getText();
        String sqlConsulta = "SELECT estoque_geral FROM produto WHERE codigo_prod=?";
        PreparedStatement psConsulta = (PreparedStatement) conn.prepareStatement(sqlConsulta);
        psConsulta.setString(1, codigoProduto);
        ResultSet rsConsulta = psConsulta.executeQuery();

        int estoqueAtual = 0;
        if (rsConsulta.next()) {
            estoqueAtual = rsConsulta.getInt("estoque_geral");
        }

        // Obter a quantidade que deseja adicionar ao estoque
        int quantidadeAdicionar = Integer.parseInt(txtQuant.getText());

        // Calcular o novo estoque (estoque atual + quantidade a ser adicionada)
        int novoEstoque = estoqueAtual + quantidadeAdicionar;

        // Atualizar o estoque no banco de dados com o novo valor
        String sqlAtualizacao = "UPDATE produto SET estoque_geral=? WHERE codigo_prod=?";
        PreparedStatement psAtualizacao = (PreparedStatement) conn.prepareStatement(sqlAtualizacao);
        psAtualizacao.setInt(1, novoEstoque);
        psAtualizacao.setString(2, codigoProduto);
        int rowsAffected = psAtualizacao.executeUpdate(); // Execute a atualização e obtenha o número de linhas afetadas

        if (rowsAffected > 0) {
            // A atualização foi bem-sucedida, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Quantidade adicionada ao estoque com sucesso!");
             this.dispose();
            estoque e = new estoque();
            e.setVisible(true);
            tboard();
        } else {
            // A atualização falhou ou nenhum registro foi afetado, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Falha ao adicionar quantidade ao estoque.");
        }

        psConsulta.close();
        psAtualizacao.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}
    
    private void atualiza(){
        this.dispose();
        estoque e = new estoque();
        e.setVisible(true);
    }
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        atualiza();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    this.dispose();
 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try {
            int row = jTable1.getSelectedRow();
            String Table_click= (jTable1.getModel().getValueAt(row,0).toString());
           
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
     Statement s = (Statement) conn.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM produto WHERE codigo_prod = '" + Table_click + "'");

        
            if(rs.next()){ 
                String ad4 =rs.getString("nome_prod");
                cbProdutos.setText(ad4);
                
                String ad3 =rs.getString("codigo_prod");
                txtIdProd.setText(ad3);

                String ad5 =rs.getString("estoque_geral");
                txtEstoque.setText(ad5);

            } 
     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 String deleteSql = "DELETE FROM produto WHERE codigo_prod = ?";

try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String id = txtIdProd.getText(); // Obtém o CPF do campo de texto

    PreparedStatement deleteStmt = (PreparedStatement) conn.prepareStatement(deleteSql);
    deleteStmt.setString(1, id);

    int rowsDeleted = deleteStmt.executeUpdate();

    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
        //Atualiza tabela e limpa campos    
        tboard();
        txtIdProd.setText("");
        txtEstoque.setText("");

        
    } else {
        JOptionPane.showMessageDialog(null, "Nenhum produto encontrado.");
    }

    deleteStmt.close();
    conn.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
     try {
    // Obtém o nome do produto selecionado no combobox
    String nomeProduto = cbProdutos.getText();

    // Obtém o ID do produto a partir do campo de texto
    int idProduto = Integer.parseInt(txtIdProd.getText());

    // Obtém o estoque do produto a partir do campo de texto
    int estoque = Integer.parseInt(txtEstoque.getText());

    if (!nomeProduto.isEmpty() && idProduto > 0 && estoque >= 0) {
        doc(nomeProduto, idProduto, estoque);
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente.",
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para o ID e o estoque.",
            "Erro", JOptionPane.ERROR_MESSAGE);
} catch (DocumentException ex) {
    Logger.getLogger(estoque.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cbProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbProdutosKeyReleased
         String prod = cbProdutos.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
  ResultSet rs = s.executeQuery("SELECT codigo_prod, nome_prod, cartegoria, fornecedor, preco, estoque_geral FROM produto " +
                "WHERE nome_prod LIKE '%" + prod + "%' OR codigo_prod LIKE '%" + prod + "%' OR fornecedor LIKE '%" + prod + "%' OR cartegoria LIKE '%" + prod + "%'");

    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // 
        v.add(rs.getString(2));  // 
        v.add(rs.getString(3));  
        v.add(rs.getString(4));  // 
        v.add(rs.getString(5));  // 
        v.add(rs.getString(6));  // 

        
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_cbProdutosKeyReleased

    private void cbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdutosActionPerformed

    
    public static void doc(String nomeProduto,int idProduto,int estoqueProduto) throws DocumentException{
    
        
    Document documentPDF = new Document();

    try {
          FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File desktopDir = fileSystemView.getHomeDirectory();

        JFileChooser fileChooser = new JFileChooser(desktopDir);
        fileChooser.setDialogTitle("Salvar PDF");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            
            
            String filePath = file.getAbsolutePath();

            PdfWriter.getInstance(documentPDF, new FileOutputStream(filePath));
            documentPDF.setPageSize(PageSize.A4);
            documentPDF.open();
            
         //fontes
        Font titleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 18, BaseColor.ORANGE);
        Font normalFont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK);
        Font headerr = FontFactory.getFont(FontFactory.TIMES_ROMAN,8, BaseColor.ORANGE );
       
        Paragraph header = new Paragraph("TechnoJalt",headerr);
        header.setAlignment(Element.ALIGN_CENTER);
        documentPDF.add(header);

        //título
        Paragraph title = new Paragraph("Relatório de Estoque", titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        documentPDF.add(title);

        documentPDF.add(Chunk.NEWLINE);

        //paragrafos
            //documentPDF.add(new Paragraph("Nome do produto: " + nomeProduto));
            
 
        //tabela
        
        // Criar uma tabela com 3 colunas
PdfPTable table = new PdfPTable(3);

// Adicionar cabeçalhos de coluna
table.addCell("Produto");
table.addCell("Id");
table.addCell("Estoque");

// Adicionar dados à tabela
table.addCell(nomeProduto);
table.addCell(String.valueOf(idProduto));
table.addCell(String.valueOf(estoqueProduto));

documentPDF.add(table);


            JOptionPane.showMessageDialog(null, "PDF Gerado em: " + filePath);
        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo PDF.");

    } finally {
        documentPDF.close();
    }

    }
    
    
    
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
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cbProdutos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
