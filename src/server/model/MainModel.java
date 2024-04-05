package server.model;

import java.rmi.RemoteException;

public class MainModel {
    public Server server;

    public MainModel() throws RemoteException {
        Server server = new Server();
    }
}
