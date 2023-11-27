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
import DAO.cliente_DAO;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.cliente;
public class cliente_cad extends javax.swing.JInternalFrame {

    /**
     * Creates new form cliente_cad
     */
    public cliente_cad() {
        initComponents();
           tboard();
    } 
    
    //Update
    
    private void update(){
            
     try {            
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

        
        // Use PreparedStatement para a atualização, em vez de ResultSet
        String sql = "UPDATE cliente SET nome_c=?, cpf_cliente=?, nome_pet=?,Categoria=?, peso_kg=?, raca=?, observacoes=?, telefone_cliente=? WHERE id_cliente=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        
        // Defina os valores dos parâmetros na ordem correta
        ps.setString(1, txtNome.getText());
        ps.setString(2, txtCpf.getText());
        ps.setString(3, txtNomePet.getText());
        ps.setString(4, cbCategoria.getSelectedItem().toString());
        ps.setString(5, txtPesoPet.getText());
        ps.setString(6, txtRacaPet.getText());
        ps.setString(7, txtObs.getText());
        ps.setString(8, txtTelefone.getText());
        ps.setString(9, txtId.getText());
        
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
    
    
    //Limpa
public void limpa(){
txtNome.setText("");
txtCpf.setText("");
txtDataCadastro.setDate(null);
txtNomePet.setText("");
txtPesoPet.setText("");
txtRacaPet.setText("");
txtObs.setText("");
txtTelefone.setText("");
txtId.setText("");
    }
    
    //Tabela
     public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT id_cliente, nome_c, nome_pet,Categoria, raca, observacoes, telefone_cliente, situacao FROM cliente");
    
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
        jLabel20 = new javax.swing.JLabel();
        txtPesoPet = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtRacaPet = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDataCadastro = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        txtNomePet = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnDesvincular = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVincular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 182, 115));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(61, 368, 0, 96);

        jPanel3.setBackground(new java.awt.Color(87, 41, 42));
        jPanel3.setForeground(new java.awt.Color(87, 41, 42));

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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro de clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel3)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 0, 880, 40);

        jPanel2.setBackground(new java.awt.Color(255, 221, 181));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, -1));

        jLabel5.setBackground(new java.awt.Color(87, 41, 42));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 41, 42));
        jLabel5.setText("Cliente:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Pet", "Categoria", "Raça", "OBS", "Telefone", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 260, 710, 310));

        jLabel7.setBackground(new java.awt.Color(87, 41, 42));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Telefone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel20.setBackground(new java.awt.Color(87, 41, 42));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(87, 41, 42));
        jLabel20.setText("Peso pet:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 142, -1));
        jPanel2.add(txtPesoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 170, -1));

        jLabel21.setBackground(new java.awt.Color(87, 41, 42));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(87, 41, 42));
        jLabel21.setText("CPF:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));
        jPanel2.add(txtRacaPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 220, -1));

        jLabel22.setBackground(new java.awt.Color(87, 41, 42));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 41, 42));
        jLabel22.setText("Raça pet:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 141, -1));

        jLabel24.setBackground(new java.awt.Color(87, 41, 42));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(87, 41, 42));
        jLabel24.setText("Id:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, -1));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane2.setViewportView(txtObs);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 50));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 170, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 220, -1));

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
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 430, -1));

        jButton1.setBackground(new java.awt.Color(255, 221, 181));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 51, -1));

        jLabel26.setBackground(new java.awt.Color(87, 41, 42));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(87, 41, 42));
        jLabel26.setText("Data de cadastro:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 130, -1));

        txtId.setEditable(false);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 90, -1));

        jLabel25.setBackground(new java.awt.Color(87, 41, 42));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(87, 41, 42));
        jLabel25.setText("Observações:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 185, -1));
        jPanel2.add(txtDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 170, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 41, 42));
        jLabel1.setText("Categoria");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Felino", "Canino", "Aves", "Roedores", "Réptil ou Anfíbio", " " }));
        jPanel2.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, -1));
        jPanel2.add(txtNomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 220, -1));

        jLabel18.setBackground(new java.awt.Color(87, 41, 42));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(87, 41, 42));
        jLabel18.setText("Nome pet:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 146, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 770, 590);

        btnDesvincular.setBackground(new java.awt.Color(255, 182, 115));
        btnDesvincular.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDesvincular.setForeground(new java.awt.Color(87, 41, 42));
        btnDesvincular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/dispensar.png"))); // NOI18N
        btnDesvincular.setText("Desvincular");
        btnDesvincular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesvincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesvincularActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesvincular);
        btnDesvincular.setBounds(10, 380, 120, 40);

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
        btnCadastrar.setBounds(10, 150, 120, 40);

        btnAlterar.setBackground(new java.awt.Color(255, 182, 115));
        btnAlterar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(87, 41, 42));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(10, 220, 120, 40);

        btnVincular.setBackground(new java.awt.Color(255, 182, 115));
        btnVincular.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVincular.setForeground(new java.awt.Color(87, 41, 42));
        btnVincular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/contratado.png"))); // NOI18N
        btnVincular.setText("Vincular");
        btnVincular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });
        jPanel1.add(btnVincular);
        btnVincular.setBounds(10, 300, 120, 40);

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
        jButton2.setBounds(10, 460, 120, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 920, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesvincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesvincularActionPerformed
   try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String cpf = txtCpf.getText();

    // Verificar se o cliente já está vinculado
    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM cliente WHERE cpf_cliente = ?");
    psCheck.setString(1, cpf);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Desvinculado".equals(situacao)) {
            JOptionPane.showMessageDialog(null, "O Cliente já se encontra Desvinculado.");
            return;
        }
    }
    int option = JOptionPane.showConfirmDialog(null, "Deseja Desvincular o cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        String sql = "UPDATE cliente SET situacao='Desvinculado' WHERE cpf_cliente=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, cpf);
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
  
    }//GEN-LAST:event_btnDesvincularActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try {
            int row = jTable1.getSelectedRow();
            String Table_click= (jTable1.getModel().getValueAt(row,0).toString());
           
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
     Statement s = (Statement) conn.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM cliente WHERE id_cliente = '" + Table_click + "'");

        
            if(rs.next()){
                String ad1 =rs.getString("nome_c");
                txtNome.setText(ad1);
                search.setText(ad1);
                
                String ad2 =rs.getString("telefone_cliente");
                txtTelefone.setText(ad2);
                
                String ad3 =rs.getString("cpf_cliente");
                txtCpf.setText(ad3);
                
                String ad4 =rs.getString("nome_pet");
                txtNomePet.setText(ad4);

                String ad5 =rs.getString("peso_kg");
                txtPesoPet.setText(ad5);
                
                String ad6 =rs.getString("raca");
                txtRacaPet.setText(ad6);
                
                String ad7 =rs.getString("observacoes");
                txtObs.setText(ad7);
                
       String ad8 = rs.getString("data_cadastro");
Date dCadastro = new SimpleDateFormat("yyyy-MM-dd").parse(ad8);
    txtDataCadastro.setDate(dCadastro);

                
                String ad9 =rs.getString("id_cliente");
                txtId.setText(ad9);
                
                String ad10 =rs.getString("Categoria");
                cbCategoria.setSelectedItem(ad10);
                
                
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

      private void desabilitar(){
        txtCpf.setEnabled(false);
        txtDataCadastro.setEnabled(false);
        txtNome.setEnabled(false);
        txtId.setEnabled(false);
        txtNomePet.setEnabled(false);
        txtObs.setEnabled(false);
        txtPesoPet.setEnabled(false);
        txtRacaPet.setEnabled(false);
        txtTelefone.setEnabled(false);
        cbCategoria.setEnabled(false);
    }
    
    private void habilitar(){
        txtCpf.setEnabled(true);
        txtDataCadastro.setEnabled(true);
        txtNome.setEnabled(true);
        txtId.setEnabled(true);
        txtNomePet.setEnabled(true);
        txtObs.setEnabled(true);
        txtPesoPet.setEnabled(true);
        txtRacaPet.setEnabled(true);
        txtTelefone.setEnabled(true);
        cbCategoria.setEnabled(true);

        
    }
  
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

        String name = search.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT id_cliente, nome_c, nome_pet, Categoria, raca, observacoes, telefone_cliente, situacao FROM cliente WHERE Categoria LIKE '%" + name + "%' OR situacao LIKE '%" + name + "%' OR id_cliente LIKE '%" + name + "%' OR nome_c LIKE '%" + name + "%'"
);

    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  //Id 
        v.add(rs.getString(2));  // Nome
        v.add(rs.getString(3));  //nome pet
        v.add(rs.getString(4));  // categoria
        v.add(rs.getString(5));  // raca
        v.add(rs.getString(6));   //OBS
        v.add(rs.getString(7));   //Tel
        v.add(rs.getString(8)); //Situacao

        
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    
    }//GEN-LAST:event_searchKeyReleased

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
 cliente c = new cliente();
    c.setNome_c(txtNome.getText());
    c.setCpf_c(txtCpf.getText());

    java.util.Date dcadastro = txtDataCadastro.getDate(); // Obtém a data do JDateChooser
    java.sql.Date dcadastro_sql = new java.sql.Date(dcadastro.getTime()); // Converte para java.sql.Date
    c.setData_cadastro(dcadastro_sql.toString());
    
    
    c.setNome_pet(txtNomePet.getText());
    c.setCategoria(cbCategoria.getSelectedItem().toString());
    c.setPeso_pet(txtPesoPet.getText());
    c.setRaca(txtRacaPet.getText());
    c.setObs(txtObs.getText());
    c.setTelefone(txtTelefone.getText());
    c.setSituacao("Vinculado");



// fazendo a validação dos dados

  try {
        String cpf = txtCpf.getText();

        // Verificar se o CPF já está cadastrado no banco de dados
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT COUNT(*) FROM cliente WHERE cpf_cliente = ?");
        ps.setString(1, cpf);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                // CPF já está cadastrado, exibir mensagem de erro
                JOptionPane.showMessageDialog(null, "CPF já está cadastrado!");
                return; // Encerrar o método e impedir a inserção
            }
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }



if ((txtNome.getText().isEmpty()) || (txtCpf.getText().isEmpty()) || (txtDataCadastro.getDate().toString().isEmpty()) || (txtNomePet.getText().isEmpty()) || (txtPesoPet.getText().isEmpty()) || (txtRacaPet.getText().isEmpty())|| (txtObs.getText().isEmpty())|| (txtTelefone.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
    cliente_DAO dao = new cliente_DAO();
    dao.adiciona(c);
    JOptionPane.showMessageDialog(null, "Cliente "+txtNome.getText()+" e pet "+txtNomePet.getText()+" inserido com sucesso! ");
    tboard();
}
limpa();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        update();
        tboard();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
       try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String cpf = txtCpf.getText();

    // Verificar se o cliente já está vinculado
    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM cliente WHERE cpf_cliente = ?");
    psCheck.setString(1, cpf);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Vinculado".equals(situacao)) {
            // Cliente já está vinculado, exibir mensagem de aviso e encerrar o método
            JOptionPane.showMessageDialog(null, "Cliente já está vinculado.");
            return;
        }
    }

    // Perguntar ao usuário se deseja vincular o cliente
    int option = JOptionPane.showConfirmDialog(null, "Deseja vincular o cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE cliente SET situacao='Vinculado' WHERE cpf_cliente=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, cpf);
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
        
    }//GEN-LAST:event_btnVincularActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
limpa();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDesvincular;
    private javax.swing.JButton btnVincular;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtDataCadastro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesoPet;
    private javax.swing.JTextField txtRacaPet;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
