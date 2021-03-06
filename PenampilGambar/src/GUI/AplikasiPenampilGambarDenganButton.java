/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class AplikasiPenampilGambarDenganButton extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenampilGambar
     */
    public AplikasiPenampilGambarDenganButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        coin = new javax.swing.JButton();
        books = new javax.swing.JButton();
        redchild = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        child = new javax.swing.JLabel();
        cacti = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penampil Gambar Dengan Button");
        setBackground(new java.awt.Color(204, 255, 204));

        ButtonPanel.setBackground(new java.awt.Color(204, 204, 255));

        coin.setText("Aurora");
        coin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinActionPerformed(evt);
            }
        });
        ButtonPanel.add(coin);

        books.setText("Waterfall");
        books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksActionPerformed(evt);
            }
        });
        ButtonPanel.add(books);

        redchild.setText("Mountain");
        redchild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redchildActionPerformed(evt);
            }
        });
        ButtonPanel.add(redchild);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        ButtonPanel.add(exit);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_END);

        imagepanel.setLayout(new java.awt.CardLayout());

        book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/waterfall.jpg"))); // NOI18N
        imagepanel.add(book, "1");

        child.setBackground(new java.awt.Color(204, 204, 255));
        child.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Mountain.jpg"))); // NOI18N
        imagepanel.add(child, "2");

        cacti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cacti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Aurora.jpg"))); // NOI18N
        imagepanel.add(cacti, "0");

        getContentPane().add(imagepanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coinActionPerformed
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "0");
    }//GEN-LAST:event_coinActionPerformed

    private void booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksActionPerformed
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "1");
    }//GEN-LAST:event_booksActionPerformed

    private void redchildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redchildActionPerformed
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "2");
    }//GEN-LAST:event_redchildActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        String tanya = "Apakah anda yakin ingin keluar aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)==
                JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPenampilGambarDenganButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenampilGambarDenganButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenampilGambarDenganButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenampilGambarDenganButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenampilGambarDenganButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel book;
    private javax.swing.JButton books;
    private javax.swing.JLabel cacti;
    private javax.swing.JLabel child;
    private javax.swing.JButton coin;
    private javax.swing.JButton exit;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JButton redchild;
    // End of variables declaration//GEN-END:variables
}
