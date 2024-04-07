package client.controller.buttons.signup;

import client.model.Connect;
import client.view.Signup;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class ButtonSignUp implements ActionListener {
    Signup signup;
    public ButtonSignUp(Signup signup){
        this.signup = signup;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = signup.returnTxtUserName();
        String password= signup.returnTxtPassword();
        Connect connect = new Connect();
        try {
            if(connect.signUp(username,password)){
                JOptionPane.showMessageDialog(null,"Account Successfully Added");
            }else
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
    }
}
