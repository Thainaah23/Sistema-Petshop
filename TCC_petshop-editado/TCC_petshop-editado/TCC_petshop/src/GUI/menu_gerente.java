/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Casa
 */
public class menu_gerente extends javax.swing.JFrame {

    /**
     * Creates new form menu_gerente
     */
    public menu_gerente() {
        initComponents();
        
        this.setExtendedState(this.getExtendedState()|menu_gerente.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("wallpaper.jpg.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }};
            jLabel2 = new javax.swing.JLabel();
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            jMenuItem1 = new javax.swing.JMenuItem();
            jMenu4 = new javax.swing.JMenu();
            jMenuItem2 = new javax.swing.JMenuItem();
            jMenu2 = new javax.swing.JMenu();
            jMenuItem4 = new javax.swing.JMenuItem();
            jMenu3 = new javax.swing.JMenu();
            jMenuItem5 = new javax.swing.JMenuItem();
            jMenu5 = new javax.swing.JMenu();

            jCheckBoxMenuItem1.setSelected(true);
            jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

            jMenuItem3.setText("jMenuItem3");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 1044, Short.MAX_VALUE)
                    .addComponent(jLabel2))
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 607, Short.MAX_VALUE)
                    .addComponent(jLabel2))
            );

            jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pessoas.png"))); // NOI18N
            jMenu1.setText("Funcionários");

            jMenuItem1.setText("Cadastrar funcionário");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem1);

            jMenuBar1.add(jMenu1);

            jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/patas.png"))); // NOI18N
            jMenu4.setText("Clientes");

            jMenuItem2.setText("Cadastrar cliente");
            jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuItem2);

            jMenuBar1.add(jMenu4);

            jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/acordo.png"))); // NOI18N
            jMenu2.setText("Fornecedores");

            jMenuItem4.setText("Adicionar fornecedor");
            jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem4);

            jMenuBar1.add(jMenu2);

            jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/entregavel.png"))); // NOI18N
            jMenu3.setText("Produtos");

            jMenuItem5.setText("Novo produto");
            jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem5ActionPerformed(evt);
                }
            });
            jMenu3.add(jMenuItem5);

            jMenuBar1.add(jMenu3);

            jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/sair.png"))); // NOI18N
            jMenu5.setText("Desconectar");
            jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu5MouseClicked(evt);
                }
            });
            jMenuBar1.add(jMenu5);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jDesktopPane1)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        funcionario_cad i = new funcionario_cad();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cliente_cad c = new cliente_cad();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        fornecedor_cad f = new fornecedor_cad();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        produtos_cad p = new produtos_cad();
        jDesktopPane1.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
login l = new login();
this.dispose();
l.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(menu_gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}