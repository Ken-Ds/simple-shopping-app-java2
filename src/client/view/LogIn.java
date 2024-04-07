package client.view;

import javax.swing.*;
import java.awt.*;

public class LogIn extends JFrame{
    private JButton buttonLogIn = new JButton();
    private JButton buttonSignUp = new JButton();
    private JLabel labelIPAdd = new JLabel();
    private JLabel labelOR = new JLabel();
    private JLabel labelPass= new JLabel();
    private JLabel labelTitle= new JLabel();
    private JLabel labelUsername= new JLabel();
    private JPanel mainPanelLogIn= new JPanel();
    private JPanel panelLogIn = new JPanel();
    private JSeparator separatorInORLeft = new JSeparator();
    private JSeparator separatorInORRight = new JSeparator();
    private JTextField textIPAdd = new JTextField();
    private JTextField textPass = new JTextField();
    private JTextField textUsername = new JTextField();

    public LogIn() {
        initComponents();
    }


    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanelLogIn.setBackground(new java.awt.Color(253, 245, 223));

        panelLogIn.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 28)); // NOI18N
        labelTitle.setText("Login");

        labelUsername.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 17)); // NOI18N
        labelUsername.setText("Username");

        labelPass.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 17)); // NOI18N
        labelPass.setText("Password");

        buttonLogIn.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        buttonLogIn.setText("Login");

        buttonSignUp.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        buttonSignUp.setText("Sign Up");

        labelIPAdd.setText("IP :");

        labelOR.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        labelOR.setText("Or");

        GroupLayout panelLogInLayout = new GroupLayout(panelLogIn);
        panelLogIn.setLayout(panelLogInLayout);
        panelLogInLayout.setHorizontalGroup(
                panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLogInLayout.createSequentialGroup()
                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLogInLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelPass, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(panelLogInLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(textPass, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 87, Short.MAX_VALUE))))
                                        .addGroup(panelLogInLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(labelIPAdd, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textIPAdd, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(panelLogInLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelLogInLayout.createSequentialGroup()
                                                                .addComponent(separatorInORLeft)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(labelOR, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(separatorInORRight, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(107, 107, 107))
                                                        .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(buttonSignUp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(buttonLogIn, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                        .addGroup(panelLogInLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(labelTitle)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLogInLayout.setVerticalGroup(
                panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLogInLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelIPAdd)
                                        .addComponent(textIPAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(labelTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLogInLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textUsername)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelPass, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textPass)
                                                .addGap(43, 43, 43)
                                                .addComponent(buttonLogIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelLogInLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelOR)
                                                        .addComponent(separatorInORLeft, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelLogInLayout.createSequentialGroup()
                                                .addGap(218, 218, 218)
                                                .addComponent(separatorInORRight, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSignUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118))
        );

        GroupLayout mainPanelLogInLayout = new GroupLayout(mainPanelLogIn);
        mainPanelLogIn.setLayout(mainPanelLogInLayout);
        mainPanelLogInLayout.setHorizontalGroup(
                mainPanelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLogInLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(panelLogIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(187, Short.MAX_VALUE))
        );
        mainPanelLogInLayout.setVerticalGroup(
                mainPanelLogInLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLogInLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(panelLogIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanelLogIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanelLogIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();




    }// </editor-fold>

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void textIPAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
}
