package server.controller.buttons;

import server.view.PanelMenus.AddPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        String name = addPanel.returnName();
        String price = addPanel.returnPrice();
        String description = addPanel.returnDescription();
        int quantity = Integer.parseInt(addPanel.returnQuantity());
        String status = addPanel.returnStatus();
        addProduct(String.valueOf(id), name, price, description, status, quantity);
        addPanel.tableAddProduct.setModel(addPanel.set.setTable());
    }
}
