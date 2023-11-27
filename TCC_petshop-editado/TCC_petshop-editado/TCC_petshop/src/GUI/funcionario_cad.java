/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import dao.funcionario_DAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.funcionario;
import javax.swing.JOptionPane;


public class funcionario_cad extends javax.swing.JInternalFrame {

    /**
     * Creates new form funcionario_cad
     */
    public funcionario_cad() {
        
        initComponents();
        tboard();
    }
    
    public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
    ResultSet rs = s.executeQuery("SELECT id_func, nome_func, cargo_func, telefone_func, situacao FROM funcionario");
    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // id
        v.add(rs.getString(2));  // nome
        v.add(rs.getString(3));  // cargo
        v.add(rs.getString(4));  // telefone
        v.add(rs.getString(5));
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }     
   private void update(){
          try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    // Use PreparedStatement para a atualização, em vez de ResultSet
    String sql = "UPDATE funcionario SET nome_func=?, telefone_func=?, email_func=?, cargo_func=?, cpf_func=? WHERE id_func=?";
    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
    
    // Defina os valores dos parâmetros na ordem correta
    ps.setString(1, txtNome.getText());
    ps.setString(2, txtTelefone.getText());
    ps.setString(3, txtEmail.getText());
    ps.setString(4, cbCargo.getSelectedItem().toString());
    ps.setString(5, txtCpf.getText());
    ps.setString(6, txtId.getText()); // Substitua "idFuncionarioSelecionado" pelo valor correto do ID do funcionário selecionado 

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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome_func = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        txtEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtId = new javax.swing.JTextField();
        search = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        btnCadastrar = new javax.swing.JButton();
        btnContratar = new javax.swing.JButton();
        btnAlt = new javax.swing.JButton();
        btnDemitir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel6.setText("jLabel6");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField5.setText("jTextField1");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nome:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admissão");

        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField6.setText("jTextField1");

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField7.setText("jTextField1");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome:");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Admissão");

        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome fantasia:");

        nome_func.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(884, 510));
        setPreferredSize(new java.awt.Dimension(884, 510));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 500, 0, 0);

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
        jLabel3.setText("Cadastro de funcionários");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel3)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 0, 820, 40);

        jPanel2.setBackground(new java.awt.Color(255, 221, 181));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setMinimumSize(new java.awt.Dimension(895, 570));
        jPanel2.setPreferredSize(new java.awt.Dimension(895, 570));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 41, 42));
        jLabel5.setText("Id:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cargo", "Telefone", "Situação"
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 216, 660, 324));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Telefone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(87, 41, 42));
        jLabel17.setText("E-mail:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 220, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(87, 41, 42));
        jLabel18.setText("Cargo");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(87, 41, 42));
        jLabel20.setText("Admissão:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(87, 41, 42));
        jLabel21.setText("CPF:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Caixa", "Atendente", "Estoquista", "Banhista ou tosador", "Serviços gerais" }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        jPanel2.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 220, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 170, -1));

        txtId.setEditable(false);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 80, -1));

        search.setToolTipText("Buscar");
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
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 430, -1));

        jButton3.setBackground(new java.awt.Color(255, 221, 181));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 41, 42));
        jLabel22.setText("Funcionário:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel2.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 750, 550);

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
        btnCadastrar.setBounds(10, 80, 120, 40);

        btnContratar.setBackground(new java.awt.Color(255, 182, 115));
        btnContratar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnContratar.setForeground(new java.awt.Color(87, 41, 42));
        btnContratar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/acordo.png"))); // NOI18N
        btnContratar.setText("Contratar");
        btnContratar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratar);
        btnContratar.setBounds(10, 230, 120, 40);

        btnAlt.setBackground(new java.awt.Color(255, 182, 115));
        btnAlt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAlt.setForeground(new java.awt.Color(87, 41, 42));
        btnAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        btnAlt.setText("Alterar");
        btnAlt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt);
        btnAlt.setBounds(10, 150, 120, 40);

        btnDemitir.setBackground(new java.awt.Color(255, 182, 115));
        btnDemitir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDemitir.setForeground(new java.awt.Color(87, 41, 42));
        btnDemitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/dispensar.png"))); // NOI18N
        btnDemitir.setText("Demitir");
        btnDemitir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemitirActionPerformed(evt);
            }
        });
        jPanel1.add(btnDemitir);
        btnDemitir.setBounds(10, 310, 120, 40);

        jButton4.setBackground(new java.awt.Color(255, 182, 115));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(87, 41, 42));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/esfregao.png"))); // NOI18N
        jButton4.setText("Limpar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 390, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(4, 0, 1060, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed
update();
limpa();
    }//GEN-LAST:event_btnAltActionPerformed

    private void limpa(){
         txtNome.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtData.setDate(null);
        txtCpf.setText("");
         txtId.setText("");

    }
    
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    funcionario func = new funcionario();
    func.setNome_func(txtNome.getText());
    func.setTelefone(txtTelefone.getText());
    func.setEmail(txtEmail.getText());
    func.setCargo(cbCargo.getSelectedItem().toString());
    
 java.util.Date aAdmissao = txtData.getDate(); 
java.sql.Date aAdmissao_sql = new java.sql.Date(aAdmissao.getTime()); 

// Formate a data para o formato desejado
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Defina o formato desejado
String dataFormatada = formato.format(aAdmissao_sql);
func.setData_admissao(dataFormatada);
    

    
    func.setCpf(txtCpf.getText());
    func.setSituacao("Contratado");


// fazendo a validação dos dados
if ((txtNome.getText().isEmpty()) || (txtTelefone.getText().isEmpty()) || (txtEmail.getText().isEmpty()) || (txtData.getDate().toString().isEmpty()) || (txtCpf.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    funcionario_DAO dao = new funcionario_DAO();
    dao.adiciona(func);
    JOptionPane.showMessageDialog(null, "Funcionário "+txtNome.getText()+" inserido com sucesso! ");
    tboard();

}

limpa();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCargoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
           try {
            int row = jTable1.getSelectedRow();
            String Table_click= (jTable1.getModel().getValueAt(row,0).toString());
           
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
     Statement s = (Statement) conn.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM funcionario WHERE id_func = '" + Table_click + "'");

        
            if(rs.next()){
                String ad1 =rs.getString("nome_func");
                txtNome.setText(ad1);
                
                String ad2 =rs.getString("telefone_func");
                txtTelefone.setText(ad2);
                
                String ad3 =rs.getString("email_func");
                txtEmail.setText(ad3);
                
                String ad4 =rs.getString("cargo_func");
                cbCargo.setSelectedItem(ad4);

       
                String ad5 = rs.getString("data_admissao");
Date dAdmissao = new SimpleDateFormat("yyyy-MM-dd").parse(ad5);
txtData.setDate(dAdmissao);
                
                String ad6 =rs.getString("cpf_func");
                txtCpf.setText(ad6);
                
                String ad7 =rs.getString("id_func");
                txtId.setText(ad7);
        
            } 
             String situacao = rs.getString("situacao");
            if(situacao.equals("Demitido")){
                desabilitar();
            } else if(situacao.equals("Contratado")){
                habilitar();
            }
     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void desabilitar(){
        txtCpf.setEnabled(false);
        txtData.setEnabled(false);
        txtEmail.setEnabled(false);
        txtId.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
    }
    
    private void habilitar(){
        txtCpf.setEnabled(true);
        txtData.setEnabled(true);
        txtEmail.setEnabled(true);
        txtId.setEnabled(true);
        txtNome.setEnabled(true);
        txtTelefone.setEnabled(true);
    }
  
    
    
    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
 try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String cpf = txtCpf.getText();

    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM funcionario WHERE cpf_func = ?");
    psCheck.setString(1, cpf);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Contratado".equals(situacao)) {
            JOptionPane.showMessageDialog(null, "O funcionário já se encontra contratado.");
            return;
        }
    }
    int option = JOptionPane.showConfirmDialog(null, "Deseja contratar o funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE funcionario SET situacao='Contratado' WHERE cpf_func=?";
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

    }//GEN-LAST:event_btnContratarActionPerformed

    private void btnDemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemitirActionPerformed
        try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String cpf = txtCpf.getText();

    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM funcionario WHERE cpf_func = ?");
    psCheck.setString(1, cpf);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Demitido".equals(situacao)) {
            JOptionPane.showMessageDialog(null, "O funcionário já se encontra demitido.");
            return;
        }
    }
    int option = JOptionPane.showConfirmDialog(null, "Deseja demitir o funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE funcionario SET situacao='Demitido' WHERE cpf_func=?";
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

    }//GEN-LAST:event_btnDemitirActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
  
        String name = search.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
ResultSet rs = s.executeQuery("SELECT id_func, nome_func, cargo_func, telefone_func, situacao FROM funcionario WHERE nome_func LIKE '%" + name + "%' OR situacao LIKE '%" + name + "%' OR id_func LIKE '%" + name + "%' OR cargo_func LIKE '%" + name + "%'");

    
    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // 
        v.add(rs.getString(2));  // 
        v.add(rs.getString(3));  
        v.add(rs.getString(4));  // 
        v.add(rs.getString(5));  // 

        
        
        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }
} catch (Exception e) {
    e.printStackTrace();
}
                                   

        
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpa();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnContratar;
    private javax.swing.JButton btnDemitir;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField nome_func;
    private javax.swing.JTextField search;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private int getExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setExtendedState(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object ConnectionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
