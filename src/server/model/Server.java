package server.model;

import com.google.gson.*;
import common.Product;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Server extends UnicastRemoteObject implements ServerInterface{
    public Server() throws RemoteException {
    }

    public static void startServer() {
        try{
            ServerInterface serverInterface = new Server();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("midTeam4", serverInterface);
            System.out.println("Server is Running");

        }catch(RemoteException ex){
            ex.printStackTrace();
        }
    }


    @Override
    public void addProduct(String id, String name, String price, String description,String status, int quantity) throws RemoteException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            JsonObject newProduct = new JsonObject();
            newProduct.addProperty("id", id);
            newProduct.addProperty("name", name);
            newProduct.addProperty("price", price);
            newProduct.addProperty("description", description);
            newProduct.addProperty("status", status);
            newProduct.addProperty("quantity", quantity);
            productList.add(newProduct);
            try (FileWriter writer = new FileWriter("res/products.json")) {
                gson.toJson(jsonObject, writer);
            } catch (IOException e) {
                throw new RuntimeException("Error writing to JSON file", e);
            }
            System.out.println("Product added successfully.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found", e);
        } catch (IOException | JsonParseException e) {
            throw new RuntimeException("Error parsing JSON", e);
        }
    }

    @Override
    public void deleteProduct(String name) throws RemoteException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            for (JsonElement productElement : productList) {
                JsonObject product = productElement.getAsJsonObject();
                if (product.get("name").getAsString().equals(name)) {
                    productList.remove(productElement);
                    break;
                }
            }
            try (FileWriter writer = new FileWriter("res/products.json")) {
                gson.toJson(jsonObject, writer);
            } catch (IOException e) {
                throw new RuntimeException("Error writing to JSON file", e);
            }
            System.out.println("Product with ID " + name + " deleted successfully.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading/parsing JSON", e);
        }
    }

    @Override
    public void editProduct(String id, String name, String price, String description,String status, int quantity) throws RemoteException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            for (JsonElement productElement : productList) {
                JsonObject product = productElement.getAsJsonObject();
                if (product.get("id").getAsString().equals(id)) {
                    product.addProperty("name", name);
                    product.addProperty("price", price);
                    product.addProperty("description", description);
                    product.addProperty("status", status);
                    product.addProperty("quantity", quantity);
                    break;
                }
            }
            try (FileWriter writer = new FileWriter("res/products.json")) {
                gson.toJson(jsonObject, writer);
            } catch (IOException e) {
                throw new RuntimeException("Error writing to JSON file", e);
            }
            System.out.println("Product with ID " + id + " edited successfully.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading/parsing JSON", e);
        }
    }

}
