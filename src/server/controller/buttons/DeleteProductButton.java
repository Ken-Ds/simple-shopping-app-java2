package server.controller.buttons;

import server.view.PanelMenus.DeletePanel;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.SetJTable.deleteProduct;
import static common.SetJTable.editProduct;

public class DeleteProductButton implements ActionListener {
    private DeletePanel deletePanel;
    public DeleteProductButton(DeletePanel deletePanel){
        this.deletePanel = deletePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = deletePanel.tableDeleteProduct.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) deletePanel.tableDeleteProduct.getModel();
            String productName = (String) model.getValueAt(selectedRow, 1);
            deleteProduct(productName);
            model.removeRow(selectedRow);
        }
        deletePanel.tableDeleteProduct.setModel(deletePanel.set.setTable());
    }
}
