package server;

import server.controller.Controller;
import server.model.MainModel;
import server.view.MainView;

import java.rmi.RemoteException;

public class ServerApplication {
    public static void main(String[] args) throws RemoteException {
        MainView mainView = new MainView();
        MainModel mainModel = new MainModel();
        Controller controller = new Controller(mainView,mainModel);
    }
}
