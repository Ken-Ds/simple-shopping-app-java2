package server.model;

import java.rmi.RemoteException;

public class MainModel {
    public MainModel() throws RemoteException {
        Server server = new Server();
    }
}
