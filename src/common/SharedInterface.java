package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface SharedInterface extends Remote {

    public boolean logIn(String userName, String password) throws RemoteException;

    public boolean signUp(String username, String password) throws RemoteException;

    public String getId(String userName) throws RemoteException;
    public ArrayList<Product> getProducts() throws RemoteException;
    public ArrayList<Product> getCart(String id) throws RemoteException;

    public Boolean addToCart(String id, Product product) throws RemoteException;

    public Boolean deleteFromCart(String id, Product product) throws RemoteException;

    public Boolean buyItem(String username, String product) throws RemoteException;
}
