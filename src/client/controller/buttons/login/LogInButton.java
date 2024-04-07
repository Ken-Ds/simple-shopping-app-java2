package client.controller.buttons.login;

import client.model.Connect;
import client.view.ClientMainFrame;
import client.view.ClientView;
import client.view.LogIn;
import server.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;


public class LogInButton implements ActionListener {
    LogIn logIn;

    public LogInButton(LogIn logIn){
        this.logIn = logIn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = logIn.returnTxtUserName();
        String password = logIn.returnTxtPass();
        String ip = logIn.returnIpAddress();
        Connect connect = new Connect(ip);
        if (connect.isAccounts(username,password)) {
            ClientMainFrame clientMainFrame = null;
            try {
                clientMainFrame = new ClientMainFrame(username,ip);
            } catch (RemoteException ex) {
                throw new RuntimeException(ex);
            }
            clientMainFrame.setVisible(true);
            logIn.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
