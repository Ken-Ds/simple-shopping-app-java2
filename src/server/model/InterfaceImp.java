package server.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import common.Product;
import common.SharedInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class InterfaceImp extends UnicastRemoteObject implements SharedInterface {
    protected InterfaceImp() throws RemoteException {
    }

    @Override
    public ArrayList<Product> getProducts() throws RemoteException {
        ArrayList<Product> products= new ArrayList<>();
        ParseGson parseGson = new ParseGson();
        JsonArray productArray = parseGson.getProducts();

        for (int i = 0; i < productArray.size(); i++) {
            JsonObject product = productArray.get(i).getAsJsonObject();
            String id = product.get("id").getAsString();
            String name = product.get("name").getAsString();
            String price = product.get("price").getAsString();
            String description = product.get("description").getAsString();
            String status = product.get("status").getAsString();
            int quantity = product.get("quantity").getAsInt();
            Product p = new Product(id, name, price, description, status, quantity);
            products.add(p);
        }
        return products;
    }

    @Override
    public ArrayList<Product> getCart() throws RemoteException {
        ArrayList<Product> products= new ArrayList<>();
        ParseGson parseGson = new ParseGson();
        JsonArray cart = parseGson.getAccountsCart("0");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
            JsonObject product = cart.get(i).getAsJsonObject();
            String id = product.get("id").getAsString();
            String name = product.get("name").getAsString();
            String price = product.get("price").getAsString();
            String description = product.get("description").getAsString();
            String status = product.get("status").getAsString();
            int quantity = product.get("quantity").getAsInt();
            Product p = new Product(id, name, price, description, status, quantity);
            products.add(p);
        }
        return products;
    }


}
