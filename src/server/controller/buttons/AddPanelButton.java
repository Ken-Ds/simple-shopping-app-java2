package server.controller.buttons;

import common.Product;
import server.view.PanelMenus.AddPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        if (name.isEmpty() || price.isEmpty() || description.isEmpty() || status.isEmpty() || quantityStr.isEmpty()) {
            JOptionPane.showMessageDialog(addPanel,"All field must be filled up");
            return;
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
