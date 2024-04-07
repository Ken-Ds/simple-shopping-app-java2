package server.controller.buttons;

import com.google.gson.JsonObject;
import server.view.PanelMenus.ViewProductPanel;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.List;

import static common.SetJTable.searchProductByName;

public class ViewProductButton implements ActionListener {
    private ViewProductPanel viewProductPanel;
    public ViewProductButton(ViewProductPanel viewProductPanel){
        this.viewProductPanel = viewProductPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = viewProductPanel.returnId();
        List<JsonObject> matchingProducts = searchProductByName(name);
        DefaultTableModel model = (DefaultTableModel) viewProductPanel.tableViewProduct.getModel();
        model.setRowCount(0);
        for (JsonObject product : matchingProducts) {
            model.addRow(new Object[]{product.get("id").getAsString(),product.get("name").getAsString(), product.get("price").getAsString(),product.get("description").getAsString(),product.get("status").getAsString(), product.get("quantity").getAsString()});
        }

    }
}
