package client.controller.buttons;

import client.model.Connect;
import client.view.form.FormCart;
import common.Product;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCartDeleteButton implements ActionListener {
    private FormCart formCart;

    public FormCartDeleteButton(FormCart formCart){
        this.formCart = formCart;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = formCart.cartTable.getSelectedRow();
        if(selectedRow >= 0){
            DefaultTableModel model = (DefaultTableModel) formCart.cartTable.getModel();
            String productName = (String) model.getValueAt(selectedRow,0);
            String productPrice = (String) model.getValueAt(selectedRow,2);
            String productDescription = (String) model.getValueAt(selectedRow,1);
            Connect connect = new Connect();
            connect.removeFromCart("0", new Product(productName,productPrice,productDescription));
        }
    }
}
