package client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Signup extends JFrame {
    private JButton buttonBack = new JButton();
    private JButton buttonSignUp = new JButton();
    private JLabel labelPass = new JLabel();
    private JLabel labelTitle = new JLabel();
    private JLabel labelUsername = new JLabel();
    private JPanel mainPanel = new JPanel();
    private JPanel jPanel2 = new JPanel();
    private JTextField textPass = new JTextField();
    private JTextField textUsername = new JTextField();

    public Signup() {
        initComponents();
    }


    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(253, 245, 223));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 28)); // NOI18N
        labelTitle.setText("SignUp");

        labelUsername.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 17)); // NOI18N
        labelUsername.setText("Username");

        labelPass.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 17)); // NOI18N
        labelPass.setText("Password");

        buttonSignUp.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        buttonSignUp.setText("Sign Up");

        buttonBack.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        buttonBack.setText("Back");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(textPass, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(labelUsername)
                                                        .addComponent(labelPass, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(49, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(labelTitle)
                                                .addGap(142, 142, 142))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonSignUp, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(labelUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelPass,javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(textUsername)
                                                        .addComponent(textPass))))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonBack, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(labelTitle)
                                .addGap(38, 38, 38)
                                .addComponent(labelUsername)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPass)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(buttonSignUp)
                                .addContainerGap(139, Short.MAX_VALUE)
                                .addComponent(buttonBack)
                                .addGap(58, 58, 58))
        );

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(186, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        setResizable(false);
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();

    }

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {


    }

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public String returnTxtUserName(){
        return textUsername.getText();
    }

    public String returnTxtPassword(){
        return textPass.getText();
    }
    public void setButtonBack(ActionListener actionListener){
        buttonBack.addActionListener(actionListener);
    }
    public void setButtonSignUp(ActionListener actionListener){
        buttonSignUp.addActionListener(actionListener);
    }
}
