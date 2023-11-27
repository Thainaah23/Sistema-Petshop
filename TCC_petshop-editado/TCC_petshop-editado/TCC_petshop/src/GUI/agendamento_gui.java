/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import DAO.agendamento_DAO;
import model.agendamento;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

        
public class agendamento_gui extends javax.swing.JInternalFrame {

    
    public agendamento_gui() {
        initComponents();
        Fillcombo();
        tboard();
    }

   public void Fillcombo() {

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        Statement s = (Statement) conn.createStatement();
        
        // Select para clientes
        ResultSet rsClientes = s.executeQuery("SELECT * FROM cliente");
        while (rsClientes.next()) {
            int idCliente = rsClientes.getInt("id_cliente");
            String CPFCliente = rsClientes.getString("cpf_cliente");
        }
        
        txtCpf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CPF = (String) txtCpf.getText();
                try {
                    // Consulta para buscar o ID do cliente selecionado
                    String sql = "SELECT id_cliente, nome_c, nome_pet, raca, observacoes, Categoria FROM cliente WHERE cpf_cliente = ?";
                    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                    ps.setString(1, CPF);
                    ResultSet rsIdCliente = ps.executeQuery();

                    // Preencher o campo de ID com o valor obtido
                    if (rsIdCliente.next()) {
                        int idCliente = rsIdCliente.getInt("id_cliente");
                        String nomepet = rsIdCliente.getString("nome_pet");
                        String raca = rsIdCliente.getString("raca");
                        String obs = rsIdCliente.getString("observacoes");
                        String cat = rsIdCliente.getString("Categoria");
                        String nome_c = rsIdCliente.getString("nome_c");
                        
                        txtIdCliente.setText(Integer.toString(idCliente));
                        cbCliente.setText(nome_c);
                        txtNomePet.setText(nomepet);
                        txtRaca.setText(raca);
                        txtObs.setText(obs);
                        txtCat.setText(cat);
                    }

                    // Fechar os recursos
                    rsIdCliente.close();
                    ps.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Fechar os recursos
        rsClientes.close();
        s.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public void tboard(){
        
   try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
   String query = "SELECT c.nome_c, c.id_cliente, a.opcoes_agendamento, a.data_agendamento, a.horario, a.preco, a.situacao "
                     + "FROM agendamento a "
                     + "INNER JOIN cliente c ON a.cliente_fk = c.id_cliente";
        
        ResultSet rs = s.executeQuery(query);

        while (rs.next()) {
            Vector v = new Vector();
            v.add(rs.getString(1));  // id
            v.add(rs.getString(2));  // opcoes_agendamento
            v.add(rs.getString(3));  // nome do cliente
            v.add(rs.getString(4));  // data_agendamento
            v.add(rs.getString(5));  // horario
            v.add(rs.getString(6));  // preco
            v.add(rs.getString(7));  // situacao
            

            dt.addRow(v); // Adicionar a linha ao modelo da tabela
        }
        rs.close();
        s.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public void limpa(){
        txtData.setDate(null);
        txtHora.setText("");
        cbCliente.setText("");
        txtIdCliente.setText("");
        txtNomePet.setText("");
        txtObs.setText("");
        txtPreco.setText("");
        txtRaca.setText("");
        txtCpf.setText("");
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        txtNomePet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtIdCliente = new javax.swing.JTextField();
        cbServico = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtHora = new javax.swing.JFormattedTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCat = new javax.swing.JTextField();
        cbCliente = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAgendar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 41, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        jPanel3.setBackground(new java.awt.Color(255, 221, 181));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Id", "Serviço", "Data", "Horário", "Preço", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 690, 440));

        jPanel4.setBackground(new java.awt.Color(255, 182, 115));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 41, 42));
        jLabel2.setText("CPF:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 41, 42));
        jLabel3.setText("Pet:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(87, 41, 42));
        jLabel4.setText("Data:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 41, 42));
        jLabel5.setText("Raça:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtRaca.setEditable(false);
        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });
        jPanel4.add(txtRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 320, -1));

        txtNomePet.setEditable(false);
        txtNomePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePetActionPerformed(evt);
            }
        });
        jPanel4.add(txtNomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 320, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 41, 42));
        jLabel8.setText("Serviço:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 41, 42));
        jLabel6.setText("ID:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        txtObs.setEditable(false);
        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane2.setViewportView(txtObs);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 90));

        txtIdCliente.setEditable(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, -1));

        cbServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banho & tosa", "Apenas banho", "Apenas tosa" }));
        jPanel4.add(cbServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 41, 42));
        jLabel10.setText("Hora:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(87, 41, 42));
        jLabel11.setText("Preço:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(87, 41, 42));
        jLabel12.setText("Observações:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel4.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 130, -1));

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, -1));
        jPanel4.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 41, 42));
        jLabel9.setText("Cliente:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(87, 41, 42));
        jLabel13.setText("Categoria:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtCat.setEditable(false);
        jPanel4.add(txtCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 320, -1));

        cbCliente.setEditable(false);
        jPanel4.add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 320, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 340));

        jPanel5.setBackground(new java.awt.Color(255, 145, 77));

        btnAgendar.setBackground(new java.awt.Color(255, 145, 77));
        btnAgendar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(87, 41, 42));
        btnAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgendar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 145, 77));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(87, 41, 42));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/delete (1).png"))); // NOI18N
        jButton7.setText("Deletar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setPreferredSize(new java.awt.Dimension(75, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 145, 77));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(87, 41, 42));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/marca-de-verificacao.png"))); // NOI18N
        jButton9.setText("Finalizar");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setPreferredSize(new java.awt.Dimension(75, 23));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnLimpa.setBackground(new java.awt.Color(255, 145, 77));
        btnLimpa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLimpa.setForeground(new java.awt.Color(87, 41, 42));
        btnLimpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/esfregao.png"))); // NOI18N
        btnLimpa.setText("Limpar");
        btnLimpa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 70));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Agendamento");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, -1));

        jButton1.setBackground(new java.awt.Color(255, 221, 181));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/centro-de-pesquisa.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 50, -1));

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 330, -1));

        jButton2.setBackground(new java.awt.Color(255, 221, 181));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(87, 41, 42));
        jButton2.setText("Limpar tabela");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
  
        agendamento ag = new agendamento();
ag.setOpcoes_agentamento(cbServico.getSelectedItem().toString());
ag.setCliente_fk(Integer.parseInt(txtIdCliente.getText()));
Double preco = Double.parseDouble(txtPreco.getText().replace(",", "."));
ag.setPreco(preco);


java.util.Date dAge = txtData.getDate(); 
    java.sql.Date dAge_sql = new java.sql.Date(dAge.getTime()); 
    ag.setData_agendamento(dAge_sql.toString());


ag.setHorario(txtHora.getText());
ag.setSituacao("Andamento");
agendamento_DAO dao = new agendamento_DAO();

if (txtNomePet.getText().isEmpty() || txtData.getDate().toString().isEmpty() || txtHora.getText().isEmpty() ||
    txtIdCliente.getText().isEmpty() || txtPreco.getText().isEmpty() || txtRaca.getText().isEmpty() ||
    txtObs.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");


}
if (dao.possuiAgendamentoEmAndamento((int) ag.getCliente_fk()) || dao.existeAgendamentoNaDataHora(ag.getData_agendamento(), ag.getHorario())) {
    JOptionPane.showMessageDialog(null, "Solicitação de agendamento inválida.");
    limpa();
}


else {
    dao.adiciona(ag);
    JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
    limpa();
    tboard();
}

    }//GEN-LAST:event_btnAgendarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         String deleteSql = "DELETE FROM agendamento WHERE cliente_fk = ?";

try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String id = txtIdCliente.getText(); // Obtém o CPF do campo de texto

    PreparedStatement deleteStmt = (PreparedStatement) conn.prepareStatement(deleteSql);
    deleteStmt.setString(1, id);

    int rowsDeleted = deleteStmt.executeUpdate();

    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, "Agendamento deletado com sucesso!");
        //Atualiza tabela e limpa campos    
        tboard();
        limpa();
        
        
    } else {
        JOptionPane.showMessageDialog(null, "Nenhum agendamento encontrado.");
    }

    deleteStmt.close();
    conn.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRacaActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 try {            
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");

    String indice = txtIdCliente.getText();

    PreparedStatement psCheck = (PreparedStatement) conn.prepareStatement("SELECT situacao FROM agendamento WHERE cliente_fk = ?");
    psCheck.setString(1, indice);
    ResultSet rs = psCheck.executeQuery();

    if (rs.next()) {
        String situacao = rs.getString("situacao");
        if ("Concluído".equals(situacao)) {
            JOptionPane.showMessageDialog(null, "O agendamento já se encontra concuído");
            return;
        }
    }
    int option = JOptionPane.showConfirmDialog(null, "Deseja finalizar o agendamento?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // O usuário confirmou, executar a atualização
        String sql = "UPDATE agendamento SET situacao='Concluído' WHERE cliente_fk=?";
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, indice);
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

    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtNomePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePetActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 try {
    int row = jTable1.getSelectedRow();
    if (row >= 0) {
        // Uma linha válida foi selecionada, agora você pode obter o valor da primeira coluna
        String Table_click = jTable1.getModel().getValueAt(row, 0).toString();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        Statement s = (Statement) conn.createStatement();

        // Consulta SQL com JOIN para obter os dados do cliente e do agendamento ao mesmo tempo
        String sql = "SELECT c.nome_c, c.nome_pet, c.id_cliente, c.raca, c.observacoes, a.data_agendamento, a.horario, a.opcoes_agendamento, a.preco "
                     + "FROM cliente c "
                     + "INNER JOIN agendamento a ON c.id_cliente = a.cliente_fk "
                     + "WHERE c.nome_c = '" + Table_click + "'";

        ResultSet rs = s.executeQuery(sql);

        if (rs.next()) {
            // Preencha os campos com os dados do cliente e do agendamento
            cbCliente.setText(rs.getString("nome_c"));
            txtNomePet.setText(rs.getString("nome_pet"));
            txtIdCliente.setText(rs.getString("id_cliente"));
            txtRaca.setText(rs.getString("raca"));
            txtObs.setText(rs.getString("observacoes"));
            
               String data = rs.getString("data_agendamento");
DateFormat dateFormatDB = new SimpleDateFormat("yyyy-MM-dd"); // Formato do banco de dados
DateFormat dateFormatCalendar = new SimpleDateFormat("dd-MM-yyyy"); // Formato para exibição no JCalendar

Date data_ag = dateFormatDB.parse(data); // Parse da data do banco de dados
String dataFormatada = dateFormatCalendar.format(data_ag); // Formatar para o formato desejado

txtData.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(dataFormatada));
            
            txtHora.setText(rs.getString("horario"));
            cbServico.setSelectedItem(rs.getString("opcoes_agendamento"));
            
            
            txtPreco.setText(String.valueOf(rs.getDouble("preco")));
        }

        rs.close();
        s.close();
        conn.close();
    } else {
        // Nenhuma linha foi selecionada, exiba uma mensagem ou tome alguma ação apropriada
        JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
            }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
  String name = search.getText();
         
        try {
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    Statement s =(Statement) (java.sql.Statement) conn.createStatement();
       String sql = "SELECT c.nome_c, c.id_cliente, a.opcoes_agendamento, a.data_agendamento, a.horario, a.preco, a.situacao " +
            "FROM agendamento a " +
            "INNER JOIN cliente c ON a.cliente_fk = c.id_cliente " +
            "WHERE c.nome_c LIKE '%" + name + "%' OR a.situacao LIKE '%" + name + "%'";

    ResultSet rs = s.executeQuery(sql);

    while (rs.next()) {
        Vector v = new Vector();
        v.add(rs.getString(1));  // nome_c
        v.add(rs.getString(2));  // id_cliente
        v.add(rs.getString(3));  // opcoes_agendamento
        v.add(rs.getString(4));  // data_agendamento
        v.add(rs.getString(5));  // horario
        v.add(rs.getString(6));  // preco
        v.add(rs.getString(7));  // situacao

        dt.addRow(v); // Adicionar a linha ao modelo da tabela
    }

    rs.close();
    s.close();
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
dtm.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
      limpa();
    }//GEN-LAST:event_btnLimpaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JTextField cbCliente;
    private javax.swing.JComboBox<String> cbServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtCat;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
