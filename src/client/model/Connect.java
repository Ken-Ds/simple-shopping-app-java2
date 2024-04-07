package client.model;

import common.Product;
import common.SharedInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Connect {

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
}
