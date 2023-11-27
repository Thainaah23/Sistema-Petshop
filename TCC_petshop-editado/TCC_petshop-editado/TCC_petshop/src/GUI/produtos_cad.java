/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
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
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import model.produto;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class produtos_cad extends javax.swing.JInternalFrame {


    public produtos_cad() {
        initComponents();
        tboard();
    }
     public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT codigo_prod, nome_prod, cartegoria, fornecedor, data_fabricacao, data_validade, preco FROM produto");
    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // id
        v.add(rs.getString(2));  // nome
        v.add(rs.getString(3));  // cart
        v.add(rs.getString(4));  // fornecedor
        v.add(rs.getString(5));  // dfabricacao
        v.add(rs.getString(6));  // dvalidade
        v.add(rs.getString(7));  // dpreco
        
        
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
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCartegoria = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtValidade = new com.toedter.calendar.JDateChooser();
        txtFabricacao = new com.toedter.calendar.JDateChooser();
        btnCadastrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(884, 510));
        setMinimumSize(new java.awt.Dimension(884, 510));
        setPreferredSize(new java.awt.Dimension(884, 510));
        getContentPane().setLayout(null);

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
        jLabel3.setText("Cadastro de produtos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel3)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 0, 990, 40);

        jPanel2.setBackground(new java.awt.Color(255, 221, 181));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 41, 42));
        jLabel5.setText(" Nome do produto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Categoria", "Fornecedor", "Fabricação", "Validade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 670, 320));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Categoria:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(87, 41, 42));
        jLabel17.setText("Fornecedor:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 108, -1));
        jPanel2.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 180, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(87, 41, 42));
        jLabel18.setText("Id:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(87, 41, 42));
        jLabel20.setText("Fabricação");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(87, 41, 42));
        jLabel21.setText("Preço unitário:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 130, -1));
        jPanel2.add(txtCartegoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 200, -1));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 180, -1));

        txtId.setEditable(false);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 90, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 41, 42));
        jLabel22.setText("Validade");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 400, -1));

        jButton1.setBackground(new java.awt.Color(255, 221, 181));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, -1));
        jPanel2.add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, -1));
        jPanel2.add(txtFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 810, 550);

        btnCadastrar.setBackground(new java.awt.Color(255, 182, 115));
        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(87, 41, 42));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(10, 90, 120, 40);

        jButton5.setBackground(new java.awt.Color(255, 182, 115));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(87, 41, 42));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/delete (1).png"))); // NOI18N
        jButton5.setText("Deletar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 160, 120, 40);

        jButton6.setBackground(new java.awt.Color(255, 182, 115));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(87, 41, 42));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/entregavel.png"))); // NOI18N
        jButton6.setText("Estoque");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(10, 300, 120, 40);

        jButton7.setBackground(new java.awt.Color(255, 182, 115));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(87, 41, 42));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        jButton7.setText("Alterar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(10, 230, 120, 40);

        jButton2.setBackground(new java.awt.Color(255, 182, 115));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(87, 41, 42));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/esfregao.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 370, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(4, 0, 1030, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpa(){
txtNome.setText("");
txtNome.setText("");
txtValidade.setDate(null);
txtFabricacao.setDate(null);
txtPreco.setText("");
txtCartegoria.setText("");
txtFornecedor.setText("");
txtId.setText("");
    }
    
    private void update(){
                    
      try {            
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        String sql = "UPDATE produto SET nome_prod=?, data_validade=?, data_fabricacao=?, preco=?, cartegoria=?, fornecedor=? WHERE codigo_prod=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
    
        // Defina os valores dos parâmetros na ordem correta
        ps.setString(1, txtNome.getText());
        java.util.Date utilDateValidade = txtValidade.getDate();
if (utilDateValidade != null) {
    java.sql.Date sqlDateValidade = new java.sql.Date(utilDateValidade.getTime());
    ps.setDate(2, sqlDateValidade); // Insira a data no banco de dados
} else {
    ps.setNull(2, java.sql.Types.DATE); // Define a data no banco de dados como NULL
}
java.util.Date utilDateFabricacao = txtFabricacao.getDate();
java.sql.Date sqlDateFabricacao = new java.sql.Date(utilDateFabricacao.getTime());
ps.setDate(3, sqlDateFabricacao); // Insira a data no banco de dados
        
        
String precoTexto = txtPreco.getText();
precoTexto = precoTexto.replace(',', '.');
ps.setString(4, precoTexto);
ps.setString(5, txtCartegoria.getText());
        ps.setString(6, txtFornecedor.getText());
        ps.setString(7, txtId.getText());
    
        int rowsAffected = ps.executeUpdate(); // Execute a atualização e obtenha o número de linhas afetadas
        
        if (rowsAffected > 0) {
            // A atualização foi bem-sucedida, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!");
            limpa();
            tboard();
        } else {
            // A atualização falhou ou nenhum registro foi afetado, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Falha ao atualizar o registro.");
        }
    
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
    }
    
    
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
   
    produto prod = new produto();
    prod.setNome_produto(txtNome.getText());
   
    
   Date dataValidade = txtValidade.getDate();
if (dataValidade != null) {
    prod.setData_validade(new SimpleDateFormat("yyyy-MM-dd").format(dataValidade));
} else {
    prod.setData_validade(null);
}

java.util.Date dataFabricacao = txtFabricacao.getDate();
java.sql.Date dataFabricacaoSQL = new java.sql.Date(dataFabricacao.getTime());
prod.setData_fabricacao(dataFabricacaoSQL);


String precoString = txtPreco.getText().replace(",", ".");
prod.setPreco(Float.parseFloat(precoString));

    prod.setCartegoria(txtCartegoria.getText());
    prod.setFornecedor(txtFornecedor.getText());


// fazendo a validação dos dados
if ((txtNome.getText().isEmpty()) || (txtFabricacao.getDate().toString().isEmpty()) || (txtPreco.getText().isEmpty()) || (txtCartegoria.getText().isEmpty()) || (txtFornecedor.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
    produto_DAO dao = new produto_DAO();
    dao.adiciona(prod);
    JOptionPane.showMessageDialog(null, "Produto "+txtNome.getText()+" inserido com sucesso! ");
    tboard();
}

// apaga os dados preenchidos nos campos de texto
limpa();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
update();
limpa();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           try {
            int row = jTable1.getSelectedRow();
            String Table_click= (jTable1.getModel().getValueAt(row,0).toString());
           
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
     Statement s = (Statement) conn.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM produto WHERE codigo_prod = '" + Table_click + "'");

        
            if(rs.next()){
                String ad1 =rs.getString("nome_prod");
                txtNome.setText(ad1);
                
                String ad2 =rs.getString("cartegoria");
                txtCartegoria.setText(ad2);
                
                String ad3 =rs.getString("fornecedor");
                txtFornecedor.setText(ad3);


                String ad5 =rs.getString("data_fabricacao");
                Date dfabri = new SimpleDateFormat("yyyy-MM-dd").parse(ad5);
                txtFabricacao.setDate(dfabri);
                
                String ad6 =rs.getString("preco");
                txtPreco.setText(ad6);
            
                String ad8 = rs.getString("data_validade");
                Date dataValidade = null;

                if (ad8 != null && !ad8.isEmpty()) {
            try {
                dataValidade = new SimpleDateFormat("yyyy-MM-dd").parse(ad8);
            } catch (ParseException e) {
                e.printStackTrace();
                }
            }

        if (dataValidade != null) {
                txtValidade.setDate(dataValidade);
            } else {
                txtValidade.setDate(null); // Define o JDateChooser como nulo quando a data é nula ou vazia
                    }
        
               String ad7 =rs.getString("codigo_prod");
               txtId.setText(ad7);
               
            } 
     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Deseja apagar o produto?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        String deleteSql = "DELETE FROM produto WHERE codigo_prod = ?";

try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String id = txtId.getText(); // Obtém o CPF do campo de texto

    PreparedStatement deleteStmt = (PreparedStatement) conn.prepareStatement(deleteSql);
    deleteStmt.setString(1, id);

    int rowsDeleted = deleteStmt.executeUpdate();

    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
        //Atualiza tabela e limpa campos    
        tboard();
        limpa();
        
        
    } else {
        JOptionPane.showMessageDialog(null, "Nenhum produto encontrado.");
    }

    deleteStmt.close();
    conn.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}      
    } else {
       return; 
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        menu_gerente m = new menu_gerente();
        estoque e = new estoque();
        m.dispose();
        this.dispose();
        e.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        
         String prod = search.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT codigo_prod, nome_prod, cartegoria, fornecedor, data_fabricacao, data_validade, preco FROM produto "
            + "WHERE nome_prod LIKE '%" + prod + "%' OR codigo_prod LIKE '%" + prod + "%' OR fornecedor LIKE '%" + prod + "%' OR cartegoria LIKE '%" + prod + "%'");

    
     while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // id
        v.add(rs.getString(2));  // nome
        v.add(rs.getString(3));  // cart
        v.add(rs.getString(4));  // fornecedor
        v.add(rs.getString(5));  // dfabricacao
        v.add(rs.getString(6));  // dvalidade
        v.add(rs.getString(7));  // dpreco

        
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
        
        
        
    }//GEN-LAST:event_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
limpa();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtCartegoria;
    private com.toedter.calendar.JDateChooser txtFabricacao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private com.toedter.calendar.JDateChooser txtValidade;
    // End of variables declaration//GEN-END:variables
}
