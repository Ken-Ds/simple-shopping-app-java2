package client.controller.buttons;

import client.view.form.FormHome;
import com.google.gson.JsonObject;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static server.model.ParseGson.searchProductByNameClient;

public class FormHomeSearchButton implements ActionListener {
    private FormHome formHome;
    public FormHomeSearchButton(FormHome formHome){
        this.formHome = formHome;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nameToSearch = formHome.homeSearchBar.getText();
        List<JsonObject> matchingProducts = searchProductByNameClient(nameToSearch);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Description", "Price"});
        for (JsonObject product : matchingProducts) {
            model.addRow(new Object[]{product.get("name").getAsString(), product.get("description").getAsString(), product.get("price").getAsString()});
        }
        formHome.setHomeTable(model);
    }
}
