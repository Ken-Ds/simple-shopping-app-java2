package client.controller.buttons;

import client.model.Connect;
import client.view.ClientMainFrame;
import client.view.form.FormHome;
import common.Product;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormHomeAddButton implements ActionListener {
    private FormHome formHome;
    public FormHomeAddButton(FormHome formHome){
        this.formHome = formHome;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = formHome.homeTable.getSelectedRow();
        if(selectedRow >= 0){
            DefaultTableModel model = (DefaultTableModel) formHome.homeTable.getModel();
            String productName = (String) model.getValueAt(selectedRow,0);
            String productPrice = (String) model.getValueAt(selectedRow,2);
            String productDescription = (String) model.getValueAt(selectedRow,1);
            Product product = new Product(productName,productPrice,productDescription);
            Connect connect = new Connect(ClientMainFrame.ip);
            connect.addToCart(ClientMainFrame.id,product );
            model.removeRow(selectedRow);
        }
    }
}
