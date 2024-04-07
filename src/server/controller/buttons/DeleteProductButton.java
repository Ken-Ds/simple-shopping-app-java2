package server.controller.buttons;

import server.view.PanelMenus.DeletePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.SetJTable.deleteProduct;

public class DeleteProductButton implements ActionListener {
    private DeletePanel deletePanel;
    public DeleteProductButton(DeletePanel deletePanel){
        this.deletePanel = deletePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = deletePanel.txtId.getText();
        if (!id.isEmpty()) {
            deleteProduct(id);
            deletePanel.txtId.setText("");
        }
        deletePanel.tableDeleteProduct.setModel(deletePanel.set.setTable());
    }
}
