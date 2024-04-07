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
    private ParseGson parseGson = new ParseGson();
    protected InterfaceImp() throws RemoteException {
    }

    @Override
    public boolean logIn(String userName, String password) throws RemoteException {
        Boolean isAccount = false;
        if (parseGson.isUserExist(userName,password))
            isAccount = true;
        return isAccount;
    }

    @Override
    public boolean signUp(String username, String password) throws RemoteException {
        Boolean added = false;
        if(!parseGson.isUserNameExist(username) && password != ""){
            parseGson.addAccount(username,password);
            added = true;
        }
        return added;
    }

    @Override
    public String getId(String userName) throws RemoteException {
        return parseGson.getUserID(userName);
    }

    @Override
    public ArrayList<Product> getProducts() throws RemoteException {
        ArrayList<Product> products= new ArrayList<>();
        parseGson = new ParseGson();
        JsonArray productArray = parseGson.getProducts();

        for (int i = 0; i < productArray.size(); i++) {
            JsonObject product = productArray.get(i).getAsJsonObject();
            String id = product.get("id").getAsString();
            String name = product.get("name").getAsString();
            String price = product.get("price").getAsString();
            String description = product.get("description").getAsString();
            String status = product.get("status").getAsString();
            int quantity = product.get("quantity").getAsInt();
            if (quantity > 0) {
                Product p = new Product(id, name, price, description, status, quantity);
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public ArrayList<Product> getCart(String idKey) throws RemoteException {
        ArrayList<Product> products= new ArrayList<>();
        JsonArray cart = parseGson.getAccountsCart(idKey);
        for (int i = 0; i < cart.size(); i++) {
            JsonObject product = cart.get(i).getAsJsonObject();
            String id = product.get("id").getAsString();
            String name = product.get("name").getAsString();
            String price = product.get("price").getAsString();
            String description = product.get("description").getAsString();
            String status = product.get("status").getAsString();
            int quantity = 0;
            Product p = new Product(id, name, price, description, status, quantity);
            products.add(p);
        }
        return products;
    }

    @Override
    public Boolean addToCart(String id, Product product) throws RemoteException {
        return parseGson.addToCart(id,product);
    }

    @Override
    public Boolean deleteFromCart(String id, Product product) throws RemoteException {
        return parseGson.deleteFromCart(id,product);
    }

    @Override
    public Boolean buyItem(String username, String product) throws RemoteException {
        return parseGson.buyItem(username, product);
    }


}
