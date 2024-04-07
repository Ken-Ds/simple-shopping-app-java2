package server.model;

import com.google.gson.JsonObject;
import common.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServerInterface extends Remote {
    public void addProduct(String id, String name, String price, String description,String status, int quantity) throws RemoteException;
    public void deleteProduct(String name) throws RemoteException;
    public void editProduct(String id, String name, String price, String description,String status, int quantity) throws RemoteException;

}
