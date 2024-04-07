package client.controller.buttons.login;

import client.controller.buttons.signup.ButtonBack;
import client.controller.buttons.signup.ButtonSignUp;
import client.view.LogIn;
import client.view.Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpButton implements ActionListener {
    LogIn logIn;
    String ip;

    public SignUpButton(LogIn logIn) {
        this.logIn = logIn;
        ip = logIn.returnIpAddress();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Signup signup = new Signup();
        signup.setButtonBack(new ButtonBack(signup));
        signup.setButtonSignUp(new ButtonSignUp(signup,ip));
        signup.setVisible(true);
    }

}
