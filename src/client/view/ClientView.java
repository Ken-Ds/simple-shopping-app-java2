package client.view;

import client.controller.buttons.login.LogInButton;
import client.controller.buttons.login.SignUpButton;

public class ClientView {
    public ClientView(){
        LogIn logIn = new LogIn();
        logIn.setButtonLogIn(new LogInButton(logIn));
        logIn.setButtonSignUp(new SignUpButton(logIn));
        logIn.setVisible(true);
    }
}
