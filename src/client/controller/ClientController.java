package client.controller;

import client.model.ClientModel;
import client.model.Connect;
import client.view.ClientMainFrame;
import client.view.ClientView;

public class ClientController {
    private ClientModel model;
    private ClientView view;

    public ClientController(ClientModel clientModel, ClientView clientView){
        model = clientModel;
        view = clientView;
        Connect connect = new Connect(ClientMainFrame.ip);
        connect.getProducts();
    }
}
