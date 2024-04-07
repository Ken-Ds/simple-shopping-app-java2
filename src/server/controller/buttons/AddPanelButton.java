package server.controller.buttons;

import com.google.gson.*;
import common.Product;
import server.view.PanelMenus.AddPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import static common.GenerateUniqueId.generateUniqueId;
import static common.SetJTable.addProduct;

public class AddPanelButton implements ActionListener  {
    private AddPanel addPanel;
    public AddPanelButton(AddPanel addPanel){
        this.addPanel = addPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = generateUniqueId();
        String name = addPanel.returnName().trim();
        String price = addPanel.returnPrice().trim();
        String description = addPanel.returnDescription().trim();
        String status = addPanel.returnStatus().trim();
        String quantityStr = addPanel.returnQuantity().trim();

        if(name.isEmpty() || price.isEmpty() || description.isEmpty() || status.isEmpty() || quantityStr.isEmpty()) {
            JOptionPane.showMessageDialog(addPanel, "All field must be filled up");
            return;
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedReader br = new BufferedReader(new FileReader("res/products.json"))) {
            JsonObject jsonObject = gson.fromJson(br, JsonObject.class);
            JsonArray productList = jsonObject.getAsJsonObject("data").getAsJsonArray("product");
            for (JsonElement productElement : productList) {
                JsonObject product = productElement.getAsJsonObject();
                if (product.get("name").getAsString().equals(name)) {
                    JOptionPane.showMessageDialog(addPanel,"Product already exists.");
                    addPanel.txtQuantity.setText("");
                    addPanel.txtDescription.setText("");
                    addPanel.txtName.setText("");
                    addPanel.txtPrice.setText("");
                    addPanel.txtStatus.setText("");
                    addPanel.tableAddProduct.setModel(addPanel.set.setTable());
                    return;
                }
            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        int quantity = Integer.parseInt(quantityStr);
        addProduct(id, name, price, description, status, quantity);
        addPanel.txtQuantity.setText("");
        addPanel.txtDescription.setText("");
        addPanel.txtName.setText("");
        addPanel.txtPrice.setText("");
        addPanel.txtStatus.setText("");
        addPanel.tableAddProduct.setModel(addPanel.set.setTable());
    }
}
