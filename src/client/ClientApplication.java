package client;

import client.controller.ClientController;
import client.model.ClientModel;
import client.view.ClientView;
import java.rmi.RemoteException;

public class ClientApplication {
    public static void main(String[] args) throws RemoteException {
        ClientView view = new ClientView();
        ClientModel model = new ClientModel();
        ClientController controller = new ClientController(model,view);
    }
}
