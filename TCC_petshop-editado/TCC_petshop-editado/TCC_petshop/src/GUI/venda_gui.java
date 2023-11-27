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





public class venda_gui extends javax.swing.JFrame {

    /**
     * Creates new form venda_gui
     */
    public venda_gui() {
        initComponents();
        FillCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalProd = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtRecebido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnNotaFiscal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        spQuant1 = new javax.swing.JSpinner();
        btnAdicionar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPagamento1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        cbProdutos = new javax.swing.JTextField();
        cbCliente = new javax.swing.JFormattedTextField();
        btnHist1 = new javax.swing.JButton();
        id_cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(87, 41, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.setBackground(new java.awt.Color(255, 221, 181));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 145, 77));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 41, 42));
        jLabel1.setText("Total:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 9, 54, -1));
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, 250, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 350, 60));

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Produto", "Quantidade", "Unitário", "TotalProd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 270));

        jPanel4.setBackground(new java.awt.Color(255, 182, 115));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 41, 42));
        jLabel2.setText("CPF Cliente");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(87, 41, 42));
        jLabel4.setText("Quant:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, -1));

        txtTotalProd.setEditable(false);
        txtTotalProd.setBackground(new java.awt.Color(255, 182, 115));
        txtTotalProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalProd.setForeground(new java.awt.Color(87, 41, 42));
        txtTotalProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 41, 42), 2));
        txtTotalProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalProdActionPerformed(evt);
            }
        });
        jPanel4.add(txtTotalProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, -1));

        txtIdCliente.setEditable(false);
        txtIdCliente.setBackground(new java.awt.Color(255, 182, 115));
        txtIdCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(87, 41, 42));
        txtIdCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 41, 42), 2));
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 200, -1));

        txtRecebido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecebidoActionPerformed(evt);
            }
        });
        jPanel4.add(txtRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(87, 41, 42));
        jLabel13.setText("Id Produto");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnFinalizar.setBackground(new java.awt.Color(255, 145, 77));
        btnFinalizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(87, 41, 42));
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/marca-de-verificacao.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 30));

        btnPDF.setBackground(new java.awt.Color(255, 145, 77));
        btnPDF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(87, 41, 42));
        btnPDF.setText("Limpar campos");
        btnPDF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPDF.setPreferredSize(new java.awt.Dimension(75, 23));
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel4.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 130, -1));

        btnNotaFiscal.setBackground(new java.awt.Color(255, 145, 77));
        btnNotaFiscal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNotaFiscal.setForeground(new java.awt.Color(87, 41, 42));
        btnNotaFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fatura.png"))); // NOI18N
        btnNotaFiscal.setText("Nota fiscal");
        btnNotaFiscal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotaFiscal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNotaFiscal.setPreferredSize(new java.awt.Dimension(75, 23));
        btnNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaFiscalActionPerformed(evt);
            }
        });
        jPanel4.add(btnNotaFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 41, 42));
        jLabel8.setText("Unit:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        spQuant1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        spQuant1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spQuant1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spQuant1StateChanged(evt);
            }
        });
        jPanel4.add(spQuant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));

        btnAdicionar1.setBackground(new java.awt.Color(255, 145, 77));
        btnAdicionar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAdicionar1.setForeground(new java.awt.Color(87, 41, 42));
        btnAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add (3).png"))); // NOI18N
        btnAdicionar1.setText("Adicionar");
        btnAdicionar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionar1.setPreferredSize(new java.awt.Dimension(75, 23));
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdicionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 41, 42));
        jLabel9.setText("Recebido:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        txtUnit.setEditable(false);
        txtUnit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitActionPerformed(evt);
            }
        });
        jPanel4.add(txtUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 41, 42));
        jLabel10.setText("Troco:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, -1));

        txtTroco.setEditable(false);
        txtTroco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });
        jPanel4.add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 130, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(87, 41, 42));
        jLabel11.setText("Total produto:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 100, -1));

        txtIdProd.setEditable(false);
        txtIdProd.setBackground(new java.awt.Color(255, 182, 115));
        txtIdProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtIdProd.setForeground(new java.awt.Color(87, 41, 42));
        txtIdProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 41, 42), 2));
        txtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 310, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(87, 41, 42));
        jLabel12.setText("Pagamento:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        txtPagamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Débito", "Dinheiro", "Pix" }));
        jPanel4.add(txtPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, -1));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 310, 230));
        jPanel4.add(cbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        try {
            cbCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        btnHist1.setBackground(new java.awt.Color(255, 145, 77));
        btnHist1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnHist1.setForeground(new java.awt.Color(87, 41, 42));
        btnHist1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/historia.png"))); // NOI18N
        btnHist1.setText("Histórico");
        btnHist1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHist1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHist1.setPreferredSize(new java.awt.Dimension(75, 23));
        btnHist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHist1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnHist1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        id_cliente.setEditable(false);
        id_cliente.setBackground(new java.awt.Color(255, 182, 115));
        id_cliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        id_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 41, 42), 2));
        jPanel4.add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 100, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 580, 390));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 41, 42));
        jLabel7.setText("Vendas");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 160, -1));

        jScrollPane3.setViewportView(jEditorPane1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1180, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void bill()
    {
        String total = txtTotal.getText();
         String pay = txtRecebido.getText();
         String bal = txtTroco.getText();
         
          DefaultTableModel model = new DefaultTableModel();
        
        model = (DefaultTableModel)jTable1.getModel();
         
         txtbill.setText(txtbill.getText() + "******************************************************\n");
         txtbill.setText(txtbill.getText() + "                         Recibo                        \n");
         txtbill.setText(txtbill.getText() + "*******************************************************\n");
         
         //Heading
          txtbill.setText(txtbill.getText() + "Produto" + "\t" + "Unitário" + "\t" + "total" + "\n"  );
          
          
          for(int i = 0; i < model.getRowCount(); i++)
          {
              
              String pname = (String)model.getValueAt(i, 1);
              String price = (String)model.getValueAt(i, 3);
              String amount = (String)model.getValueAt(i, 4); 
              
           txtbill.setText(txtbill.getText() + pname  + "\t" + price + "\t" + amount  + "\n"  );
    
          }
          
          txtbill.setText(txtbill.getText() + "\n");     
          
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Total :" + total + "\n");
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Recebido: " + pay + "\n");
          txtbill.setText(txtbill.getText() + "\t" + "\t" + "Troco: " + bal + "\n");
          txtbill.setText(txtbill.getText() + "\n");
          txtbill.setText(txtbill.getText() + "*******************************************************\n");
          txtbill.setText(txtbill.getText() + "        Obrigado e volte sempre!             \n");
        
    }
    
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtTotalProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalProdActionPerformed

    private void txtRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecebidoActionPerformed

    }//GEN-LAST:event_txtRecebidoActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
limpa();

    }//GEN-LAST:event_btnPDFActionPerformed

    private void limpa(){
txtIdCliente.setText("");
txtbill.setText("");
txtIdProd.setText("");
txtTotal.setText("");
txtTotalProd.setText("");
txtTroco.setText("");
txtRecebido.setText("");
id_cliente.setText("");
cbCliente.setText("");
cbProdutos.setText("");

DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
dtm.setRowCount(0);
    }
    
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
    
//************** Validações **************************************************
if (txtRecebido.getText().isEmpty() || txtTotal.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
} else if ((int) spQuant1.getValue() <= 0) {
    JOptionPane.showMessageDialog(null, "Insira uma quantidade válida");
} else {
    inserir_produtos();
    troco();
    bill();
    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso! Limpe os campos para realizar uma nova venda");


}
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void inserir_produtos() {
  try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
    conn.setAutoCommit(false);  // Desabilita o commit automático

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    String sqlQuery = "INSERT INTO venda (cliente_fk, produto_fk, quant_prod, unit, total_prod, total_venda, recebido, troco, pagamento, data_venda, nome_cliente_fk) VALUES (?, ?, ?, ?, ?,?,?,?,?,?,?)";
    PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sqlQuery);

    for (int i = 0; i < model.getRowCount(); i++) {
        int cliente_fk = Integer.parseInt(id_cliente.getText()); // Substitua id_cliente pelo campo correto que contém o cliente_fk
        int prod = Integer.valueOf(model.getValueAt(i, 1).toString());
        int quant = Integer.valueOf(model.getValueAt(i, 2).toString());
        Double unit = Double.valueOf(model.getValueAt(i, 3).toString().replace(",", ".")); // Substitui vírgula por ponto
        Double totalProd = Double.valueOf(model.getValueAt(i, 4).toString().replace(",", ".")); // Substitui vírgula por ponto
        Double totalvenda = Double.valueOf(txtTotal.getText().toString().replace(",", "."));
        Double recebido = Double.valueOf(txtRecebido.getText().toString().replace(",", "."));
        Double troco = Double.valueOf(txtTroco.getText().toString().replace(",", "."));
        String pagamento = txtPagamento1.getSelectedItem().toString();
        String cliente = txtIdCliente.getText();
        
        
        
        pstmt.setInt(1, cliente_fk);
        pstmt.setInt(2, prod);
        pstmt.setInt(3, quant);
        pstmt.setDouble(4, unit);
        pstmt.setDouble(5, totalProd);
        pstmt.setDouble(6, totalvenda);
        pstmt.setDouble(7, recebido);
        pstmt.setDouble(8, troco);
        pstmt.setString(9, pagamento);
        
         java.util.Date dataAtual = new java.util.Date();
SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
String dataFormatada = formatador.format(dataAtual);
        pstmt.setString(10, dataFormatada);
        pstmt.setString(11, cliente);
        
        pstmt.addBatch();
    }

    pstmt.executeBatch();
    conn.commit();  // Realiza o commit após inserir todos os produtos
    conn.setAutoCommit(true);  // Habilita o commit automático novamente
    conn.close();

    System.out.println("Produtos inseridos");
} catch (SQLException ex) {
    Logger.getLogger(venda_gui.class.getName()).log(Level.SEVERE, null, ex);
}
}
    
    
    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
menu_caixa m = new menu_caixa();
dispose();
m.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaFiscalActionPerformed
    troco();
    bill();
    }//GEN-LAST:event_btnNotaFiscalActionPerformed

    //Verificar e atualizar estoque
    
  private boolean verificarEstoque(String idProduto, int quantidadeVenda) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT estoque_geral FROM produto WHERE codigo_prod = ?");
        ps.setString(1, idProduto);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int estoque = rs.getInt("estoque_geral");
            return estoque >= quantidadeVenda;
        }

        return false;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
 
    private void atualizarEstoque(String idProduto, int quantidadeVenda) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement("UPDATE produto SET estoque_geral = estoque_geral - ? WHERE codigo_prod = ?");
        ps.setInt(1, quantidadeVenda);
        ps.setString(2, idProduto);
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public void printer(){
       MessageFormat header = new MessageFormat("Recibo");
       MessageFormat footer = new MessageFormat("TechnoJalt");
       try {
           PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
           set.add(OrientationRequested.LANDSCAPE);
           txtbill.print();
           JOptionPane.showMessageDialog(null,"Relatório gerado com sucesso!");

       }
       catch(java.awt.print.PrinterException e){
           JOptionPane.showMessageDialog(null, "/n"+"Failed"
           + "\n" + e);
       }

   }
    
    
    
    
    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
    
String idProduto = cbProdutos.getText();
int quantidadeVenda = (int) spQuant1.getValue();  


//************** Validações **************************************************
   if (txtIdProd.getText().isEmpty() || txtIdCliente.getText().isEmpty()||txtTotalProd.getText().isEmpty()||txtUnit.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
} 
   else if ((int) spQuant1.getValue() <= 0) {
    JOptionPane.showMessageDialog(null, "Insira uma quantidade válida");
}
   
  //****************************************************************************
   
   else if (verificarEstoque(idProduto, quantidadeVenda)) {
 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

Object[] rowData = {
    txtIdCliente.getText(),
    cbProdutos.getText(),
    spQuant1.getValue().toString(),
    txtUnit.getText(),
    txtTotalProd.getText()
};

  model.insertRow(0, rowData);
        atualizarEstoque(idProduto, quantidadeVenda);
        total();
 }
 else {
        JOptionPane.showMessageDialog(this, "Estoque insuficiente para este produto.", "Estoque Insuficiente", JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

 //Calcular total
    private void total(){
        double sum = 0.0;

for (int i = 0; i < jTable1.getRowCount(); i++) {
    Object valueAtCell = jTable1.getValueAt(i, 4);
    if (valueAtCell != null) {
        String stringValue = valueAtCell.toString();
        // Substitui a vírgula pelo ponto como separador decimal
        stringValue = stringValue.replace(",", ".");
        
        sum = sum + Double.parseDouble(stringValue);
    }
}

txtTotal.setText(String.format("%.2f", sum));
txtIdProd.setText("");
txtUnit.setText("");
txtTotalProd.setText("");
txtIdProd.requestFocus();  

    }
    
    
    
    private void txtUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitActionPerformed
    
    public void troco() {
        
           if (txtRecebido.getText().isEmpty()||txtTotal.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");

           } else {
        String totalStr = txtTotal.getText().replace("R$", "").replace(",", ".");
        String recebidoStr = txtRecebido.getText().replace("R$", "").replace(",", ".");

        double total = Double.parseDouble(totalStr);
        double recebido = Double.parseDouble(recebidoStr);

        double troco = recebido - total;
        String formattedTroco = String.format("%.2f%n", troco);
        txtTroco.setText(formattedTroco);
           }
}
    
    
    
    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void txtIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdActionPerformed

   public void FillCampos() {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        Statement s = (Statement) conn.createStatement();

        ResultSet rsProduto = s.executeQuery("SELECT * FROM produto");
        while (rsProduto.next()) {
            int IdProd = rsProduto.getInt("codigo_prod");
            
           
        }

        ResultSet rsCliente = s.executeQuery("SELECT * FROM cliente");
        while (rsCliente.next()) {
            String CPF_cliente = rsCliente.getString("cpf_cliente");
            
        }

        cbProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CodigoProdSelecionado = cbProdutos.getText();
                try {
                    String sql = "SELECT * FROM produto WHERE codigo_prod = ?";
                    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                    ps.setString(1, CodigoProdSelecionado);
                    ResultSet rsIdProd = ps.executeQuery();

                    if (rsIdProd.next()) {
                        String idProduto = rsIdProd.getString("nome_prod");
                        double unit = rsIdProd.getDouble("preco");

                        txtUnit.setText(Double.toString(unit));
                        txtIdProd.setText(idProduto);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        cbCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CpfClienteSelecionado = cbCliente.getText();
                try {
                    String sql = "SELECT * FROM cliente WHERE cpf_cliente = ?";
                    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                    ps.setString(1, CpfClienteSelecionado);
                    ResultSet rsIdCliente = ps.executeQuery();

                    if (rsIdCliente.next()) {
                        String NomeCliente = rsIdCliente.getString("nome_c");
                        txtIdCliente.setText(NomeCliente);
                        
                        int cod_cliente = rsIdCliente.getInt("id_cliente");
                        id_cliente.setText(Integer.toString(cod_cliente));
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    private void spQuant1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQuant1StateChanged
      
        int quant = Integer.parseInt(spQuant1.getValue().toString());
        double unit = Double.parseDouble(txtUnit.getText());
        
        
        double tot = quant*unit;
        txtTotalProd.setText(String.format("%.2f", tot));
    }//GEN-LAST:event_spQuant1StateChanged

    private void btnHist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHist1ActionPerformed
historico h = new historico();
this.dispose();
h.setVisible(true);
    }//GEN-LAST:event_btnHist1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

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
            java.util.logging.Logger.getLogger(venda_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venda_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venda_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venda_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venda_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnHist1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNotaFiscal;
    private javax.swing.JButton btnPDF;
    private javax.swing.JFormattedTextField cbCliente;
    private javax.swing.JTextField cbProdutos;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spQuant1;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JComboBox<String> txtPagamento1;
    private javax.swing.JTextField txtRecebido;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalProd;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtUnit;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}
