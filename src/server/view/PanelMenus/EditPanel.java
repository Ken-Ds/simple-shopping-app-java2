package server.view.PanelMenus;

import common.SetJTable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import static common.SetJTable.editProduct;

public class EditPanel extends JPanel {
    private JButton buttonEnterEdit = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel labelDescription = new JLabel();
    private JLabel labelName = new JLabel();
    private JLabel labelPrice = new JLabel();
    private JLabel labelQuantity = new JLabel();
    private JLabel labelStatus = new JLabel(); // Added label for status
    private JPanel panelTop = new JPanel();
    private JTable tableEditProduct = new JTable();
    private JTextField txtDescription = new JTextField();
    private JTextField txtName = new JTextField();
    private JTextField txtPrice = new JTextField();
    private JTextField txtQuantity = new JTextField();
    private JTextField txtStatus = new JTextField(); // Added text field for status
    private SetJTable set = new SetJTable();

    public EditPanel() {
        initComponents();
    }

    private void initComponents() {
        buttonEnterEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableEditProduct.getSelectedRow();
                if (selectedRow >= 0) {
                    String id = tableEditProduct.getModel().getValueAt(selectedRow, 0).toString();
                    String name = returnName();
                    String price = returnPrice();
                    String description = returnDescription();
                    String status = returnStatus();
                    String quantity = returnQuantity();
                    editProduct(id, name, price, description,status, Integer.parseInt(quantity));
                    DefaultTableModel model = (DefaultTableModel) tableEditProduct.getModel();
                    model.setValueAt(name, selectedRow, 1);
                    model.setValueAt(price, selectedRow, 2);
                    model.setValueAt(description, selectedRow, 3);
                    model.setValueAt(status, selectedRow, 4);
                    model.setValueAt(quantity, selectedRow, 5);

                }


            }
        });
        tableEditProduct.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = tableEditProduct.getSelectedRow();
                if (selectedRow >= 0) {
                    String id = tableEditProduct.getModel().getValueAt(selectedRow, 0).toString();
                    String name = tableEditProduct.getModel().getValueAt(selectedRow, 1).toString();
                    String price = tableEditProduct.getModel().getValueAt(selectedRow, 2).toString();
                    String description = tableEditProduct.getModel().getValueAt(selectedRow, 3).toString();
                    String status = tableEditProduct.getModel().getValueAt(selectedRow, 4).toString();
                    String quantity = tableEditProduct.getModel().getValueAt(selectedRow, 5).toString();

                    txtName.setText(name);
                    txtPrice.setText(price);
                    txtDescription.setText(description);
                    txtStatus.setText(status);
                    txtQuantity.setText(quantity);

                }

            }
        });
        setPreferredSize(new java.awt.Dimension(763, 481));
        tableEditProduct.setModel(set.setTable());

        jScrollPane1.setViewportView(tableEditProduct);

        labelName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelName.setText("Name :");

        labelPrice.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelPrice.setText("Price :");

        labelDescription.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelDescription.setText("Description :");

        labelQuantity.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelQuantity.setText("Quantity :");

        labelStatus.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelStatus.setText("Status :"); // Set label text for status

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        buttonEnterEdit.setText("Enter");

        GroupLayout panelTopLayout = new GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelName, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPrice, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(labelDescription)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(labelQuantity)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelStatus) // Add label for status
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE) // Add text field for status
                                .addGap(18, 18, 18)
                                .addComponent(buttonEnterEdit, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        panelTopLayout.setVerticalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelPrice, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDescription)
                                        .addComponent(labelQuantity)
                                        .addComponent(labelStatus) // Add label for status
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonEnterEdit)
                                        .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)) // Add text field for status
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                        .addComponent(panelTop, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(panelTop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(0, 0, 0).addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)));
    }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {
    }
    public String returnName(){
        return txtName.getText();
    }
    public String returnPrice(){
        return txtPrice.getText();
    }
    public String returnDescription(){
        return txtDescription.getText();
    }
    public String returnQuantity(){
        return txtQuantity.getText();
    }
    public String returnStatus(){
        return txtStatus.getText();
    }
}
