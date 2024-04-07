package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface SharedInterface extends Remote {
    public ArrayList<Product> getProducts() throws RemoteException;
    public ArrayList<Product> getCart() throws RemoteException;
}
