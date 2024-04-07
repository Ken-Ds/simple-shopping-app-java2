package client.controller.buttons.login;

import client.model.Connect;
import client.view.LogIn;
import server.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LogInButton implements ActionListener {
    LogIn logIn;

    public LogInButton(LogIn logIn){
        this.logIn = logIn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = logIn.returnTxtUserName();
        String password = logIn.returnTxtPass();
        Connect connect = new Connect();
        if (connect.isAccounts(username,password)) {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            logIn.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
