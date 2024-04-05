package server.model;

import common.Product;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements ServerInterface{
    public Server() throws RemoteException {
    }

    public static void startServer() {
        try{
            ServerInterface serverInterface = new Server();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("midTeam4", serverInterface);
            System.out.println("Server is Running");

        }catch(RemoteException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Product addProduct(Product product) throws RemoteException {
        return null;
    }

    @Override
    public Product deleteProduct(Product deleteProduct) throws RemoteException {
        return null;
    }

    @Override
    public Product editProduct(Product editProduct) throws RemoteException {
        return null;
    }
}
