/*
 * @author Nafeesa Yousaf
 */
package view;

import controller.AuthenticationController;
import javax.swing.JOptionPane;
import models.AuthenticationModel;

public class SignupScreen extends javax.swing.JFrame {

    public SignupScreen() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        signupText = new javax.swing.JLabel();
        heroBackground = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        slogon = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        passwordTextField = new javax.swing.JPasswordField();
        roleDropDown = new javax.swing.JComboBox<>();
        loginLabel = new javax.swing.JLabel();
        loginNavigationText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        signupText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signupText.setForeground(new java.awt.Color(102, 0, 102));
        signupText.setText("SIGN UP");

        heroBackground.setBackground(new java.awt.Color(102, 0, 102));
        heroBackground.setToolTipText("");

        welcomeText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(255, 255, 255));
        welcomeText.setText("Welcome To Event Planing System");

        slogon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        slogon.setForeground(new java.awt.Color(255, 255, 255));
        slogon.setText("Turning Moments into Memories – Seamlessly!");

        javax.swing.GroupLayout heroBackgroundLayout = new javax.swing.GroupLayout(heroBackground);
        heroBackground.setLayout(heroBackgroundLayout);
        heroBackgroundLayout.setHorizontalGroup(
            heroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heroBackgroundLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(heroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, heroBackgroundLayout.createSequentialGroup()
                        .addComponent(welcomeText)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, heroBackgroundLayout.createSequentialGroup()
                        .addComponent(slogon)
                        .addGap(172, 172, 172))))
        );
        heroBackgroundLayout.setVerticalGroup(
            heroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heroBackgroundLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(welcomeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slogon)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password:");

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        confirmPasswordLabel.setText("Confirm Password:");

        signUpButton.setBackground(new java.awt.Color(102, 0, 102));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        roleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(0, 0, 0));
        roleLabel.setText("Role:");

        roleDropDown.setBackground(new java.awt.Color(255, 255, 255));
        roleDropDown.setForeground(new java.awt.Color(0, 0, 0));
        roleDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Event Manager", "Vendor" }));
        roleDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleDropDownActionPerformed(evt);
            }
        });

        loginLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginLabel.setText("Already Have an Account? ");

        loginNavigationText.setForeground(new java.awt.Color(102, 0, 102));
        loginNavigationText.setText("Login");
        loginNavigationText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginNavigationTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heroBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addComponent(roleLabel)
                            .addComponent(confirmPasswordLabel))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField)
                            .addComponent(confirmPasswordTextField)
                            .addComponent(passwordTextField)
                            .addComponent(roleDropDown, 0, 180, Short.MAX_VALUE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginNavigationText))
                            .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(221, 221, 221))))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(signupText)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heroBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLabel)
                    .addComponent(roleDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginNavigationText))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String email = emailTextField.getText().trim();
        String password = new String(passwordTextField.getPassword());
        String confirmPassword = new String(confirmPasswordTextField.getPassword());
        String role = (String) roleDropDown.getSelectedItem();

        if (email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(this, "Enter a valid email address!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (role == null || role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a role!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Confirm password cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        AuthenticationModel newUser = new AuthenticationModel(email, password, role);

        AuthenticationController authController = new AuthenticationController();
        boolean isSuccess = authController.registerUser(newUser);

        if (isSuccess) {
            JOptionPane.showMessageDialog(this, "User successfully registered!", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);

            LoginScreen loginForm = new LoginScreen();
            loginForm.setVisible(true);
        } else {
        }


    }//GEN-LAST:event_signUpButtonActionPerformed

    private void roleDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleDropDownActionPerformed

    private void loginNavigationTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginNavigationTextMouseClicked
        this.setVisible(false);

        LoginScreen loginForm = new LoginScreen();
        loginForm.setVisible(true);    }//GEN-LAST:event_loginNavigationTextMouseClicked

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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel heroBackground;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginNavigationText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JComboBox<String> roleDropDown;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signupText;
    private javax.swing.JLabel slogon;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
