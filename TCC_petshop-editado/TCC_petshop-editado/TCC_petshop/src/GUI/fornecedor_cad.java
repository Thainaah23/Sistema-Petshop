/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;
import DAO.fornecedor_DAO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import model.fornecedor;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Casa
 */
public class fornecedor_cad extends javax.swing.JInternalFrame {

    /**
     * Creates new form fornecedor_cad
     */
    public fornecedor_cad() {
        initComponents();
        tboard();
    }
    
      public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT id_fornecedor, nome_fantasia, tipo_produto, telefone_fornecedor, situacao FROM fornecedor");
    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // id
        v.add(rs.getString(2));  // nome fantasia
        v.add(rs.getString(3));  // cargo
        v.add(rs.getString(4));  // telefone
        v.add(rs.getString(5));
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }   
      
      private void limpa(){
txtRazaoEmpresarial.setText("");
txtCnpj.setText("");
txtContato.setText("");
txtNomeFantasia.setText("");
txtEmail.setText("");
txtTipoProduto.setText("");
      }
      
      
      private void update(){
          try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    // Use PreparedStatement para a atualização, em vez de ResultSet
    String sql = "UPDATE fornecedor SET nome_fantasia=?, telefone_fornecedor=?, email=?, razao_empresarial=?, tipo_produto=?, cnpj=? WHERE id_fornecedor=?";
    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
    
    // Defina os valores dos parâmetros na ordem correta
    ps.setString(1, txtNomeFantasia.getText());
    ps.setString(2, txtContato.getText());
    ps.setString(3, txtEmail.getText());
    ps.setString(4, txtRazaoEmpresarial.getText());
    ps.setString(5, txtTipoProduto.getText());
    ps.setString(6, txtCnpj.getText());

    ps.setInt(7,Integer.parseInt(txtId.getText())); // Substitua "idFornecedorSelecionado" pelo valor correto do ID do fornecedor selecionado

    int rowsAffected = ps.executeUpdate(); // Execute a atualização e obtenha o número de linhas afetadas
    
    if (rowsAffected > 0) {
        // A atualização foi bem-sucedida, faça o tratamento necessário
        JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!");
        limpa();
    } else {
        // A atualização falhou ou nenhum registro foi afetado, faça o tratamento necessário
        JOptionPane.showMessageDialog(null, "Falha ao atualizar o registro.");
    }

    ps.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
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
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTipoProduto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtRazaoEmpresarial = new javax.swing.JTextField();
        txtContato = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlt = new javax.swing.JButton();
        btnDesvinc = new javax.swing.JButton();
        btnVinc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(884, 510));

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
        jLabel3.setText("Cadastro de fornecedor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel3)
                .addContainerGap(489, Short.MAX_VALUE))
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

        txtId.setEditable(false);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 41, 42));
        jLabel5.setText("Nome fantasia:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome fantasia", "Tipo de produto", "Contato", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 227, 670, 310));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Contato:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(87, 41, 42));
        jLabel17.setText("E-mail:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 190, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(87, 41, 42));
        jLabel18.setText("Razão empresarial:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 166, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(87, 41, 42));
        jLabel20.setText("Tipo de produto:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 171, -1));
        jPanel2.add(txtTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(87, 41, 42));
        jLabel21.setText("CNPJ:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        txtRazaoEmpresarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoEmpresarialActionPerformed(evt);
            }
        });
        jPanel2.add(txtRazaoEmpresarial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 30));

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, 30));

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 190, 30));

        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 30));

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
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 370, -1));

        jButton1.setBackground(new java.awt.Color(255, 221, 181));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMaximumSize(new java.awt.Dimension(51, 28));
        jButton1.setMinimumSize(new java.awt.Dimension(51, 28));
        jButton1.setPreferredSize(new java.awt.Dimension(51, 28));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 41, 42));
        jLabel22.setText("Id:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 30, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 700, 550);

        btnCadastrar.setBackground(new java.awt.Color(255, 182, 115));
        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(87, 41, 42));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(10, 160, 120, 40);

        btnAlt.setBackground(new java.awt.Color(255, 182, 115));
        btnAlt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAlt.setForeground(new java.awt.Color(87, 41, 42));
        btnAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        btnAlt.setText("Alterar");
        btnAlt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt);
        btnAlt.setBounds(10, 370, 120, 40);

        btnDesvinc.setBackground(new java.awt.Color(255, 182, 115));
        btnDesvinc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDesvinc.setForeground(new java.awt.Color(87, 41, 42));
        btnDesvinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/dispensar.png"))); // NOI18N
        btnDesvinc.setText("Desvincular");
        btnDesvinc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesvinc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDesvinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesvincActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesvinc);
        btnDesvinc.setBounds(10, 230, 120, 40);

        btnVinc.setBackground(new java.awt.Color(255, 182, 115));
        btnVinc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVinc.setForeground(new java.awt.Color(87, 41, 42));
        btnVinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/contratado.png"))); // NOI18N
        btnVinc.setText("Vincular");
        btnVinc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVinc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincActionPerformed(evt);
            }
        });
        jPanel1.add(btnVinc);
        btnVinc.setBounds(10, 300, 120, 40);

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
        jButton2.setBounds(10, 440, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
              
    fornecedor fo = new fornecedor();
    fo.setRazao_empresarial(txtRazaoEmpresarial.getText());
    fo.setTelefone_fornecedor(txtContato.getText());
    fo.setCnpj(txtCnpj.getText());
    fo.setTipo_produto(txtTipoProduto.getText());
    fo.setNome_fantasia(txtNomeFantasia.getText());
    fo.setEmail(txtEmail.getText());
    fo.setSituacao("Vinculado");
    


// fazendo a validação dos dados
if ((txtRazaoEmpresarial.getText().isEmpty()) || (txtContato.getText().isEmpty()) || (txtCnpj.getText().isEmpty()) || (txtTipoProduto.getText().isEmpty()) || (txtNomeFantasia.getText().isEmpty()) || (txtEmail.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
    fornecedor_DAO dao = new fornecedor_DAO();
    dao.adiciona(fo);
    JOptionPane.showMessageDialog(null, "Fornecedor "+txtNomeFantasia.getText()+" adicionado! ");
    tboard();
}
limpa();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtRazaoEmpresarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoEmpresarialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoEmpresarialActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         try {
            int row = jTable1.getSelectedRow();
            String Table_click= (jTable1.getModel().getValueAt(row,0).toString());
           
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
     Statement s = (Statement) conn.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM fornecedor WHERE id_fornecedor = '" + Table_click + "'");

        
            if(rs.next()){
                String ad1 =rs.getString("nome_fantasia");
                txtNomeFantasia.setText(ad1);
                
                String ad2 =rs.getString("telefone_fornecedor");
                txtContato.setText(ad2);
                
                String ad3 =rs.getString("email");
                txtEmail.setText(ad3);
                
                String ad4 =rs.getString("razao_empresarial");
                txtRazaoEmpresarial.setText(ad4);

                String ad5 =rs.getString("tipo_produto");
                txtTipoProduto.setText(ad5);
                
                String ad6 =rs.getString("cnpj");
                txtCnpj.setText(ad6);
                
                String ad7 =rs.getString("id_fornecedor");
                txtId.setText(ad7);

            }
            String situacao = rs.getString("situacao");
            if(situacao.equals("Desvinculado")){
                desabilitar();
            } else if(situacao.equals("Vinculado")){
                habilitar();
            }
     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed
update();
tboard();
        
    }//GEN-LAST:event_btnAltActionPerformed

    private void desabilitar(){
        txtCnpj.setEnabled(false);
        txtContato.setEnabled(false);
        txtEmail.setEnabled(false);
        txtId.setEnabled(false);
        txtNomeFantasia.setEnabled(false);
        txtRazaoEmpresarial.setEnabled(false);
        txtTipoProduto.setEnabled(false);
    }
    
    private void habilitar(){
        txtCnpj.setEnabled(true);
        txtContato.setEnabled(true);
        txtEmail.setEnabled(true);
        txtId.setEnabled(true);
        txtNomeFantasia.setEnabled(true);
        txtRazaoEmpresarial.setEnabled(true);
        txtTipoProduto.setEnabled(true);
        
    }
    
    private void btnDesvincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesvincActionPerformed
       try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String id = txtId.getText();

    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM fornecedor WHERE id_fornecedor = ?");
    psCheck.setString(1, id);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Desvinculado".equals(situacao)) {
            JOptionPane.showMessageDialog(null, "O fornecedor já se encontra desvinculado.");
            return;
        }
    }
    int option = JOptionPane.showConfirmDialog(null, "Deseja desvincular o fornecedor?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE fornecedor SET situacao='Desvinculado' WHERE id_fornecedor=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, id);
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            // A atualização foi bem-sucedida, exibir mensagem de sucesso e fazer tratamentos necessários
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!");
            tboard();
            limpa();
        } else {
            // A atualização falhou ou nenhum registro foi afetado, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Falha ao atualizar o registro.");
        }

        ps.close();
    } else {
        // O usuário não confirmou, encerrar o método
        return;
    }

    psCheck.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_btnDesvincActionPerformed

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
             String name = search.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
   ResultSet rs = s.executeQuery("SELECT id_fornecedor, nome_fantasia, tipo_produto, telefone_fornecedor, situacao FROM fornecedor WHERE nome_fantasia LIKE '%" + name + "%' OR id_fornecedor LIKE '%" + name + "%' OR situacao LIKE '%" + name + "%'");

    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // id
        v.add(rs.getString(2));  // nome fantasia
        v.add(rs.getString(3));  // cargo
        v.add(rs.getString(4));  // telefone
        v.add(rs.getString(5));
        
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void btnVincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincActionPerformed
           try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String id = txtId.getText();

    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM fornecedor WHERE id_fornecedor = ?");
    psCheck.setString(1, id);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Vinculado".equals(situacao)) {
            
            JOptionPane.showMessageDialog(null, "fornecedor já está vinculado.");
            return;
        }
    }
    
    int option = JOptionPane.showConfirmDialog(null, "Deseja vincular o fornecedor?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE fornecedor SET situacao='Vinculado' WHERE id_fornecedor=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, id);
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            // A atualização foi bem-sucedida, exibir mensagem de sucesso e fazer tratamentos necessários
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!");
            tboard();
            limpa();
        } else {
            // A atualização falhou ou nenhum registro foi afetado, faça o tratamento necessário
            JOptionPane.showMessageDialog(null, "Falha ao atualizar o registro.");
        }

        ps.close();
    } else {
        // O usuário não confirmou, encerrar o método
        return;
    }

    psCheck.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_btnVincActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpa();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDesvinc;
    private javax.swing.JButton btnVinc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoEmpresarial;
    private javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
}
