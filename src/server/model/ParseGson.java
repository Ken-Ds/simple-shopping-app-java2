package server.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileReader;

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
                    JsonObject cart = account.getAsJsonObject("cart");
                    JsonArray prod = cart.getAsJsonArray("product");
                    jsonArray.add(prod);
                }
            }
        } catch (Exception e){
            e.getMessage();
        }
        return jsonArray;
    }
}
