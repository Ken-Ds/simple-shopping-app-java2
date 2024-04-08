package server.model;

import common.SharedInterface;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    protected Server() throws RemoteException {
    }

    public static void startServer() {
        try{
            SharedInterface serverInterface = new InterfaceImp();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("midTeam4", serverInterface);
            System.out.println("Server is Running");

        }catch(RemoteException ex){
            ex.printStackTrace();
        }
    }

}
