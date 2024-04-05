package common;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
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
            e.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel setViewClientTable(){
        Gson gson = new Gson();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("res/accounts.json"))){
            JsonObject jsonObject = gson.fromJson(bufferedReader,JsonObject.class);
            JsonArray accountList = jsonObject.getAsJsonObject("accounts").getAsJsonArray("account");

            String[] columnNames = {"Username", "ID"};
            DefaultTableModel model = new DefaultTableModel(columnNames,0);
            for(int x = 0; x<accountList.size(); x++){
                JsonObject account = accountList.get(x).getAsJsonObject();
                String username = account.get("username").getAsString();
                String id = account.get("id").getAsString();
                model.addRow(new Object[]{username, id});
            }
            return model;
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}
