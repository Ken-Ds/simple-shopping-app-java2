package server.model;

import common.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
    public Product addProduct(Product product) throws RemoteException;
    public Product deleteProduct(Product deleteProduct) throws RemoteException;
    public Product editProduct(Product editProduct) throws RemoteException;
}
