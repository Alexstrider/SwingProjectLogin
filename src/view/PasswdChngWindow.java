/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.LoginView;
/**
 *
 * @author Ruben Hernandez
 */
public class PasswdChngWindow extends javax.swing.JFrame {

    /**
     * Creates new form PasswdChngWindow
     */
    public PasswdChngWindow() {
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

        lblOldPasswd = new javax.swing.JLabel();
        lblNewPasswd = new javax.swing.JLabel();
        lblConfNewPasswd = new javax.swing.JLabel();
        txtOldPasswd = new javax.swing.JTextField();
        txtNewPasswd = new javax.swing.JTextField();
        txtConfNewPasswd = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOldPasswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOldPasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOldPasswd.setText("Old Password");

        lblNewPasswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewPasswd.setText("New Password");

        lblConfNewPasswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConfNewPasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfNewPasswd.setText("Confirm New Password");

        txtOldPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPasswdActionPerformed(evt);
            }
        });

        txtNewPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswdActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfNewPasswd)
                            .addComponent(lblNewPasswd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOldPasswd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOldPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtNewPasswd)
                            .addComponent(txtConfNewPasswd))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPasswd)
                    .addComponent(txtOldPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPasswd)
                    .addComponent(txtNewPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfNewPasswd)
                    .addComponent(txtConfNewPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOldPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswdActionPerformed

    private void txtNewPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswdActionPerformed

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
            java.util.logging.Logger.getLogger(PasswdChngWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswdChngWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswdChngWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswdChngWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswdChngWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblConfNewPasswd;
    private javax.swing.JLabel lblNewPasswd;
    private javax.swing.JLabel lblOldPasswd;
    private javax.swing.JTextField txtConfNewPasswd;
    private javax.swing.JTextField txtNewPasswd;
    private javax.swing.JTextField txtOldPasswd;
    // End of variables declaration//GEN-END:variables
}
