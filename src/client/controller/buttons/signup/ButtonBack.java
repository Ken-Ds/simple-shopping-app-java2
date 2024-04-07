package client.controller.buttons.signup;

import client.controller.buttons.login.LogInButton;
import client.controller.buttons.login.SignUpButton;
import client.view.LogIn;
import client.view.Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBack implements ActionListener {
    Signup signup;
    public ButtonBack(Signup signup){
        this.signup = signup;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        LogIn logIn = new LogIn();
        logIn.setButtonLogIn(new LogInButton(logIn));
        logIn.setButtonSignUp(new SignUpButton(logIn));
        logIn.setVisible(true);
        signup.dispose();
    }
}
