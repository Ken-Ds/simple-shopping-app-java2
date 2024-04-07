package server.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import common.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParseGson {
    public static Gson gson = new Gson();
    public static String productsDir = "res/products.json";
    private static String accountsDir = "res/accounts.json";
    public JsonArray getProducts(){
        JsonArray jsonArray= new JsonArray();
        try (BufferedReader reader = new BufferedReader(new FileReader(productsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");;
            jsonArray = productList;
        } catch (Exception e){
            e.getMessage();
        }
        return jsonArray;
    }

    public JsonArray getAccounts(){
        JsonArray jsonArray= new JsonArray();
        try (BufferedReader reader = new BufferedReader(new FileReader(accountsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray accountList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");
            jsonArray = accountList;
        } catch (Exception e){
            e.getMessage();
        }
        return jsonArray;
    }

    public JsonArray getAccountsCart(String searchKey){
        JsonArray jsonArray= new JsonArray();
        try (BufferedReader reader = new BufferedReader(new FileReader(accountsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray accountList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");
            for (JsonElement accountElement : accountList ){
                JsonObject account = accountElement.getAsJsonObject();
                if(account.get("id").getAsString().equals(searchKey)){
                    JsonArray prod = account.getAsJsonObject("cart").getAsJsonArray("product");
                    for (JsonElement productElement : prod) {
                        jsonArray.add(productElement);
                    }
                }
            }
        } catch (Exception e){
            e.getMessage();
        }
        return jsonArray;
    }

    public Product getProdInfo(String name){
        Product prod = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(productsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            for (JsonElement productElement : productList){
                JsonObject product = productElement.getAsJsonObject();

                String pName = product.get("name").getAsString();
                if(pName.equals(name)){
                    String id = product.get("id").getAsString();
                    String price = product.get("price").getAsString();
                    String description = product.get("description").getAsString();
                    String status = product.get("status").getAsString();
                    int quantity = product.get("quantity").getAsInt();
                    prod = new Product(id,pName,price,description,status,quantity);
                }
            }
        } catch (Exception e){
            e.getMessage();
        }
        return prod;
    }

    public Boolean addToCart(String id, Product product){
        Boolean added = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(accountsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray accounts = jsonObject.getAsJsonObject("accounts").getAsJsonArray("accounts");
            for (JsonElement accountElement : accounts){
                JsonObject account = accountElement.getAsJsonObject();
                if(account.get("id").getAsString().equals(id)){
                    JsonArray cart = account.getAsJsonObject("cart").getAsJsonArray("product");
                    Product product1 = getProdInfo(product.getName());
                    JsonObject newToCart = new JsonObject();
                    newToCart.addProperty("id", product1.getId());
                    newToCart.addProperty("name", product1.getName());
                    newToCart.addProperty("price", product1.getPrice());
                    newToCart.addProperty("description", product1.getDescription());
                    newToCart.addProperty("status", product1.getStatus());
                    cart.add(newToCart);
                    break;
                }
            }
            try (FileWriter writer = new FileWriter(accountsDir)){
                gson.toJson(jsonObject, writer);
            } catch (Exception e){
                throw new RuntimeException("Error writing to JSON file", e);
            }
            added = true;
            System.out.println("Product has Been Added TO Cart");
        }catch (Exception e){
            e.getMessage();
        }
        return added;
    }

    public Boolean deleteFromCart(String id, Product product){
        Boolean removed = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(accountsDir))){
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray accountList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");
            for (JsonElement accountElement : accountList ){
                JsonObject account = accountElement.getAsJsonObject();
                if(account.get("id").getAsString().equals(id)){
                    JsonArray prod = account.getAsJsonObject("cart").getAsJsonArray("product");
                    for (JsonElement productElement : prod) {
                        JsonObject cartProd = productElement.getAsJsonObject();
                        if (cartProd.get("name").getAsString().equals(product.getName())){
                            prod.remove(productElement);
                            break;
                        }
                    }
                }
            }
            try (FileWriter writer = new FileWriter("res/accounts.json")) {
                gson.toJson(jsonObject, writer);
            } catch (IOException e) {
                throw new RuntimeException("Error writing to JSON file", e);
            }
            System.out.println("Product removed from cart");
            removed = true;
        } catch (Exception e){
            e.getMessage();
        }
        return removed;
    }
}
