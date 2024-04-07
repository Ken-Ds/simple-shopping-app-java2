package common;

import com.google.gson.*;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SetJTable {
    public DefaultTableModel setTable() {
        Gson gson = new Gson();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");

            String[] columnNames = {"ID", "Name", "Price", "Description", "Status", "Quantity"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            for (int i = 0; i < productList.size(); i++) {
                JsonObject product = productList.get(i).getAsJsonObject();
                String id = product.get("id").getAsString();
                String name = product.get("name").getAsString();
                String price = product.get("price").getAsString();
                String description = product.get("description").getAsString();
                String status = product.get("status").getAsString();
                int quantity = product.get("quantity").getAsInt();
                model.addRow(new Object[]{id, name, price, description, status, quantity});
            }
            return model;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DefaultTableModel setViewClientTable() {
        Gson gson = new Gson();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("res/accounts.json"))) {
            JsonObject jsonObject = gson.fromJson(bufferedReader, JsonObject.class);
            JsonArray accountList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");
            String[] columnNames = {"ID", "Username"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            for (int x = 0; x < accountList.size(); x++) {
                JsonObject account = accountList.get(x).getAsJsonObject();
                String username = account.get("username").getAsString();
                String id = account.get("id").getAsString();
                model.addRow(new Object[]{id, username});
            }
            return model;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void addProduct(String id, String name, String price, String description,String status, int quantity) {
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

    public static void deleteProduct(String name) {
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

    public static void editProduct(String id, String name, String price, String description,String status, int quantity) {
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
    public static List<JsonObject> searchProductByName(String name) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<JsonObject> matchingProducts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            for (JsonElement productElement : productList) {
                JsonObject product = productElement.getAsJsonObject();
                if (product.get("name").getAsString().equals(name)) {
                    matchingProducts.add(product);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading/parsing JSON", e);
        }
        return matchingProducts;
    }
    public static List<JsonObject> searchAccount(String searchKey){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<JsonObject> matchingID = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("res/accounts.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");
            for (JsonElement productElement : productList) {
                JsonObject product = productElement.getAsJsonObject();
                if (product.get("id").getAsString().equals(searchKey)) {
                    matchingID.add(product);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading/parsing JSON", e);
        }
        return matchingID;
    }

}
