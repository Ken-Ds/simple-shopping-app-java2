package server.controller.buttons;

import server.view.PanelMenus.EditPanel;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.SetJTable.editProduct;

public class EditProductButton implements ActionListener {
    private EditPanel editPanel;
    public EditProductButton(EditPanel editPanel){
        this.editPanel = editPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = editPanel.tableEditProduct.getSelectedRow();
        if (selectedRow >= 0) {
            String id = editPanel.tableEditProduct.getModel().getValueAt(selectedRow, 0).toString();
            String name = editPanel.returnName();
            String price = editPanel.returnPrice();
            String description = editPanel.returnDescription();
            String status = editPanel.returnStatus();
            String quantity = editPanel.returnQuantity();
            editProduct(id, name, price, description,status, Integer.parseInt(quantity));
            DefaultTableModel model = (DefaultTableModel) editPanel.tableEditProduct.getModel();
            model.setValueAt(name, selectedRow, 1);
            model.setValueAt(price, selectedRow, 2);
            model.setValueAt(description, selectedRow, 3);
            model.setValueAt(status, selectedRow, 4);
            model.setValueAt(quantity, selectedRow, 5);
        }
        editPanel.tableEditProduct.setModel(editPanel.set.setTable());
    }
}
