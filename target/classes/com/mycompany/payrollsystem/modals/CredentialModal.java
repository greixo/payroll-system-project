/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.modals;

import java.awt.Color;

/**
 *
 * @author Paul
 */
public class CredentialModal extends javax.swing.JFrame {

    /**
     * Creates new form CreatePositionModal
     */
    public CredentialModal() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedCornersPanel3 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        modal_title2 = new javax.swing.JLabel();
        close_icon_modal2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        close_modal_button2 = new javax.swing.JButton();
        save_changes_modal_button2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        backgroundLabelCode = new com.mycompany.payrollsystem.swing.BackgroundLabel();
        backgroundLabelCode1 = new com.mycompany.payrollsystem.swing.BackgroundLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundedCornersPanel3.setBackground(new java.awt.Color(245, 247, 248));

        modal_title2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modal_title2.setForeground(new java.awt.Color(51, 51, 51));
        modal_title2.setText("Credential");

        close_icon_modal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_icon_modal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/x-icon.png"))); // NOI18N
        close_icon_modal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_icon_modal2MousePressed(evt);
            }
        });

        close_modal_button2.setBackground(new java.awt.Color(204, 0, 0));
        close_modal_button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        close_modal_button2.setForeground(new java.awt.Color(255, 255, 255));
        close_modal_button2.setText("Close");
        close_modal_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_modal_button2ActionPerformed(evt);
            }
        });

        save_changes_modal_button2.setBackground(new java.awt.Color(0, 204, 51));
        save_changes_modal_button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        save_changes_modal_button2.setForeground(new java.awt.Color(255, 255, 255));
        save_changes_modal_button2.setText("Submit");

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setText("User Name");
        jTextField5.setMargin(new java.awt.Insets(2, 10, 2, 2));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Password");
        jTextField6.setMargin(new java.awt.Insets(2, 10, 2, 2));

        backgroundLabelCode.setBackground(new java.awt.Color(0, 158, 251));
        backgroundLabelCode.setLabelText("User Name");

        backgroundLabelCode1.setBackground(new java.awt.Color(0, 158, 251));
        backgroundLabelCode1.setLabelText("Password");

        javax.swing.GroupLayout roundedCornersPanel3Layout = new javax.swing.GroupLayout(roundedCornersPanel3);
        roundedCornersPanel3.setLayout(roundedCornersPanel3Layout);
        roundedCornersPanel3Layout.setHorizontalGroup(
            roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(roundedCornersPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedCornersPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(modal_title2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close_icon_modal2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedCornersPanel3Layout.createSequentialGroup()
                        .addComponent(backgroundLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(roundedCornersPanel3Layout.createSequentialGroup()
                        .addComponent(backgroundLabelCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save_changes_modal_button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(close_modal_button2)))
                .addContainerGap())
        );
        roundedCornersPanel3Layout.setVerticalGroup(
            roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close_icon_modal2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modal_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backgroundLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundLabelCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(roundedCornersPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_modal_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_changes_modal_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedCornersPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedCornersPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_icon_modal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_icon_modal2MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_close_icon_modal2MousePressed

    private void close_modal_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_modal_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_close_modal_button2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreatePositionModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreatePositionModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreatePositionModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreatePositionModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreatePositionModal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.swing.BackgroundLabel backgroundLabelCode;
    private com.mycompany.payrollsystem.swing.BackgroundLabel backgroundLabelCode1;
    private javax.swing.JLabel close_icon_modal2;
    private javax.swing.JButton close_modal_button2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel modal_title2;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel3;
    private javax.swing.JButton save_changes_modal_button2;
    // End of variables declaration//GEN-END:variables
}
