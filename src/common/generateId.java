package common;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class generateId {
    public static String generateUniqueId() {
        JsonObject jsonObject = loadJsonFromFile("res/products.json");
        JsonArray productArray = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
        int maxId = 0;
        for (JsonElement productElement : productArray) {
            JsonObject product = productElement.getAsJsonObject();
            int id = Integer.parseInt(product.get("id").getAsString());
            if (id > maxId) {
                maxId = id;
            }
        }
        return String.valueOf(maxId + 1);
    }
    private static JsonObject loadJsonFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Gson gson = new Gson();
            return gson.fromJson(br, JsonObject.class);
        } catch (IOException e) {
            throw new RuntimeException("Error reading JSON file", e);
        }
    }

}
