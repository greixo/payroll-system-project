/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.Forms;

import com.mycompany.payrollsystem.Util;
import com.mycompany.payrollsystem.interfaces.EmailInputValidator;
import com.mycompany.payrollsystem.interfaces.PasswordInputValidator;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paul
 */
public class Login extends javax.swing.JFrame implements EmailInputValidator, PasswordInputValidator {

    private final Util util = new Util();
    private Pattern pattern;
    private final String regex = "^[a-zA-Z0-9._]+@gmail\\.com$";
    /**
     * Creates new form TestLogin
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); // Centers the form
        util.fitImageToComponent(CompanyLogoPanel, "images/company_image.png");
        util.fitImageToComponent(hide_panel, "images/hide_icon.png");
        util.fitImageToComponent(close_panel, "images/close.png");
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new com.mycompany.payrollsystem.swing.RoundedPanel();
        leftRoundedCornerPanel1 = new com.mycompany.payrollsystem.swing.LeftRoundedCornerPanel();
        jLabel1 = new javax.swing.JLabel();
        CompanyLogoPanel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        password_textfield = new javax.swing.JPasswordField();
        sign_up_button = new javax.swing.JButton();
        email_error_label = new javax.swing.JLabel();
        password_error_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rightRoundedCornerPanel1 = new com.mycompany.payrollsystem.swing.RightRoundedCornerPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hide_panel = new javax.swing.JLabel();
        close_panel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        leftRoundedCornerPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel1.setText("INTRAPAYROLL & HRIS SYSTEM");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Sign in");

        email_textfield.setBackground(new java.awt.Color(238, 238, 238));
        email_textfield.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        email_textfield.setMargin(new java.awt.Insets(2, 10, 2, 2));
        email_textfield.setPreferredSize(new java.awt.Dimension(25, 24));
        email_textfield.setSelectionColor(new java.awt.Color(102, 153, 255));
        email_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email_textfieldKeyReleased(evt);
            }
        });

        password_textfield.setBackground(new java.awt.Color(238, 238, 238));
        password_textfield.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        password_textfield.setMargin(new java.awt.Insets(2, 10, 2, 2));
        password_textfield.setSelectionColor(new java.awt.Color(102, 153, 255));
        password_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_textfieldKeyReleased(evt);
            }
        });

        sign_up_button.setBackground(new java.awt.Color(110, 133, 238));
        sign_up_button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        sign_up_button.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_button.setText("SIGN IN");
        sign_up_button.setBorder(null);

        email_error_label.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        password_error_label.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setText("Email");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Forgot password?");

        javax.swing.GroupLayout leftRoundedCornerPanel1Layout = new javax.swing.GroupLayout(leftRoundedCornerPanel1);
        leftRoundedCornerPanel1.setLayout(leftRoundedCornerPanel1Layout);
        leftRoundedCornerPanel1Layout.setHorizontalGroup(
            leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                .addGroup(leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CompanyLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(sign_up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        leftRoundedCornerPanel1Layout.setVerticalGroup(
            leftRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRoundedCornerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(CompanyLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(email_error_label)
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(password_error_label)
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addComponent(sign_up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Access Your");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Payroll System");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Log in to manage and review your");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("payroll with ease. Enter your credentials");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("to access your account and stay up-to-");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("date with your payroll information.");

        hide_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_panelMouseClicked(evt);
            }
        });

        close_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightRoundedCornerPanel1Layout = new javax.swing.GroupLayout(rightRoundedCornerPanel1);
        rightRoundedCornerPanel1.setLayout(rightRoundedCornerPanel1Layout);
        rightRoundedCornerPanel1Layout.setHorizontalGroup(
            rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRoundedCornerPanel1Layout.createSequentialGroup()
                .addGroup(rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGroup(rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightRoundedCornerPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(rightRoundedCornerPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightRoundedCornerPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hide_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(close_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rightRoundedCornerPanel1Layout.setVerticalGroup(
            rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRoundedCornerPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(rightRoundedCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hide_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(leftRoundedCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightRoundedCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftRoundedCornerPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightRoundedCornerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_panelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_close_panelMouseClicked

    private void hide_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_panelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_hide_panelMouseClicked

    private void email_textfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_textfieldKeyReleased
        // TODO add your handling code here:
        String emailInput = email_textfield.getText();
        System.out.println("Email: " + emailInput);
        validateEmailInput(emailInput, email_error_label);
    }//GEN-LAST:event_email_textfieldKeyReleased

    private void password_textfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_textfieldKeyReleased
        // TODO add your handling code here:
        char[] passwordChars = password_textfield.getPassword();
        String password = new String(passwordChars);
        validatePasswordInput(password, password_error_label);
    }//GEN-LAST:event_password_textfieldKeyReleased

    @Override
    public boolean validateEmailInput(String input, JLabel error_label) {
        
        boolean isEmailValid = true;
        String errorMessage = "";
        pattern = Pattern.compile(regex);
       
        
        if (input.trim().isEmpty()) {
            isEmailValid = false;
            errorMessage = "Email can't be empty.";
        } else if (!pattern.matcher(input).matches()) {
            isEmailValid = false;
            errorMessage = "Email format is invalid.";
        }
        
        if (!isEmailValid) {
            error_label.setText(errorMessage);
            error_label.setForeground(Color.RED);
        } else {
            error_label.setText(""); // Clear the error message
            error_label.setForeground(null); // Reset to default color 
        } 
        
        return isEmailValid;
    }
    
    @Override
    public boolean validatePasswordInput(String input, JLabel error_label) {
        
        boolean isPasswordValid = true;
        String errorMessage = "";
        
        if (input.trim().isEmpty()) {
            isPasswordValid = false;
            errorMessage = "Password can't be empty.";
        } 
        
        if (!isPasswordValid) {
            error_label.setText(errorMessage);
            error_label.setForeground(Color.RED);
        } else {
            error_label.setText(""); 
            error_label.setForeground(null);
        }
        
        return isPasswordValid;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyLogoPanel;
    private javax.swing.JLabel close_panel;
    private javax.swing.JLabel email_error_label;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JLabel hide_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.mycompany.payrollsystem.swing.LeftRoundedCornerPanel leftRoundedCornerPanel1;
    private javax.swing.JLabel password_error_label;
    private javax.swing.JPasswordField password_textfield;
    private com.mycompany.payrollsystem.swing.RightRoundedCornerPanel rightRoundedCornerPanel1;
    private com.mycompany.payrollsystem.swing.RoundedPanel roundedPanel1;
    private javax.swing.JButton sign_up_button;
    // End of variables declaration//GEN-END:variables
}
