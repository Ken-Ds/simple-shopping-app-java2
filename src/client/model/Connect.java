package client.model;
import client.view.LogIn;
import common.Product;
import common.SharedInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Connect {
    private static LogIn logIn = new LogIn();
    private static String ip = logIn.returnIpAddress();
    public Connect(String add){
        ip = add;
    }
    public boolean isAccounts(String userName, String password){
        Boolean isAccount = false;
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
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
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
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

    public String getId(String username) throws RemoteException {
        String id = "";
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            id = sharedInterface.getId(username);
        }catch (Exception e){
            e.getMessage();
        }
        return id;
    }
    public ArrayList<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
             SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
             products = sharedInterface.getProducts();
        }catch (Exception e){
            e.getMessage();
        }
        return products;
    }

    public ArrayList<Product> getCart(String id){
        ArrayList<Product> products = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            products = sharedInterface.getCart(id);
        }catch (Exception e){
            e.getMessage();
        }
        return products;
    }

    public Boolean addToCart(String id, Product product){
        Boolean added = false;
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            added = sharedInterface.addToCart(id, product);
        }catch (Exception e){
            e.getMessage();
        }
        return added;
    }

    public Boolean removeFromCart(String id, Product product){
        Boolean removed = false;
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            removed = sharedInterface.deleteFromCart(id,product);
        }catch (Exception e){
            e.getMessage();
        }
        return removed;
    }

    public boolean bought(String username, String product){
        Boolean bought = false;
        try {
            Registry registry = LocateRegistry.getRegistry(ip, 1099);
            SharedInterface sharedInterface = (SharedInterface) registry.lookup("midTeam4");
            bought = sharedInterface.buyItem(username,product);
        }catch (Exception e){
            e.getMessage();
        }
        return bought;
    }
}
