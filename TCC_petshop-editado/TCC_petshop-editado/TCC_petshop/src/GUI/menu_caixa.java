/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class menu_caixa extends javax.swing.JFrame {

    /**
     * Creates new form menu_caixa
     */
    public menu_caixa() {
        initComponents();
        this.setExtendedState(this.getExtendedState()|menu_caixa.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("wallpaper.jpg.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }};
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            jMenu2 = new javax.swing.JMenu();
            jMenu3 = new javax.swing.JMenu();
            jMenu4 = new javax.swing.JMenu();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 792, Short.MAX_VALUE)
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 539, Short.MAX_VALUE)
            );

            jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/crescimento.png"))); // NOI18N
            jMenu1.setText("Vendas");
            jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu1MouseClicked(evt);
                }
            });
            jMenuBar1.add(jMenu1);

            jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/patas.png"))); // NOI18N
            jMenu2.setText("Clientes");
            jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu2MouseClicked(evt);
                }
            });
            jMenuBar1.add(jMenu2);

            jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/agenda.png"))); // NOI18N
            jMenu3.setText("Agendamento");
            jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu3MouseClicked(evt);
                }
            });
            jMenuBar1.add(jMenu3);

            jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/sair.png"))); // NOI18N
            jMenu4.setText("Desconectar");
            jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu4MouseClicked(evt);
                }
            });
            jMenuBar1.add(jMenu4);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        venda_gui v = new venda_gui();
        this.dispose();
        v.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        cliente_cad c = new cliente_cad();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        agendamento_gui a = new agendamento_gui();
        jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
login l = new login();
this.dispose();
l.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(menu_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
