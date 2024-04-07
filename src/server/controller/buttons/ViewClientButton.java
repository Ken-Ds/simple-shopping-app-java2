package server.controller.buttons;

import com.google.gson.JsonObject;
import server.view.PanelMenus.ViewClientPanel;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static common.SetJTable.searchAccount;


public class ViewClientButton implements ActionListener {
    private ViewClientPanel viewClientPanel;
    public ViewClientButton(ViewClientPanel viewClientPanel){
        this.viewClientPanel = viewClientPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = viewClientPanel.returnID();
        List<JsonObject> matchingAccount = searchAccount(id);
        DefaultTableModel model = (DefaultTableModel) viewClientPanel.tableViewClient.getModel();
        model.setRowCount(0);
        for (JsonObject product : matchingAccount) {
            model.addRow(new Object[]{product.get("id").getAsString(),product.get("username").getAsString()});
        }
    }
}
