package client.model;

import common.Product;
import common.SharedInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Connect {

    public boolean isAccounts(String userName, String password){
        Boolean isAccount = false;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            return sharedInterface.logIn(userName,password);
        }catch (Exception e){
            e.getMessage();
        }
        return isAccount;
    }

    public boolean signUp(String username, String password) throws RemoteException {
        Boolean isAccount = false;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            isAccount = sharedInterface.signUp(username,password);
            if(isAccount){
                System.out.println("Account Added");
            }
        }catch (Exception e){
            e.getMessage();
        }
        return isAccount;
    }
    public ArrayList<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
             SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
             products = sharedInterface.getProducts();
        }catch (Exception e){
            e.getMessage();
        }
        return products;
    }

    public ArrayList<Product> getCart(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            products = sharedInterface.getCart();
        }catch (Exception e){
            e.getMessage();
        }
        return products;
    }

    public Boolean addToCart(String id, Product product){
        Boolean added = false;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            sharedInterface.addToCart(id,product);
            added = true;
        }catch (Exception e){
            e.getMessage();
        }
        return added;
    }

    public Boolean removeFromCart(String id, Product product){
        Boolean removed = false;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");

            removed = sharedInterface.deleteFromCart(id,product);
        }catch (Exception e){
            e.getMessage();
        }
        return removed;
    }
}
