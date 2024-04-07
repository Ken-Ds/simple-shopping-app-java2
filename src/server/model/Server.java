package server.model;

import com.google.gson.*;
import common.Product;
import common.SharedInterface;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

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
