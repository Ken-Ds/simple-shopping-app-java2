package server.view.PanelMenus;
import common.SetJTable;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;

public class AddPanel extends JPanel {
    private JButton buttonEnterAdd = new JButton();
    private JLabel labelDescription = new JLabel();
    private JLabel labelName = new JLabel();
    private JLabel labelPrice = new JLabel();
    private JLabel labelQuantity = new JLabel();
    private JLabel labelStatus = new JLabel();
    private JPanel panelTop = new JPanel();
    private JScrollPane scrollTable = new JScrollPane();
    public JTable tableAddProduct = new JTable();
    private JTextField txtDescription = new JTextField();
    private JTextField txtName = new JTextField();
    private JTextField txtPrice = new JTextField();
    private JTextField txtQuantity = new JTextField();
    private JTextField txtStatus = new JTextField();
    public SetJTable set = new SetJTable();

    public AddPanel() {
        initComponents();
    }

    private void initComponents() {

        tableAddProduct.setModel(set.setTable());
        tableAddProduct.setEnabled(false);
        setBackground(new java.awt.Color(242, 242, 242));

        labelName.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelName.setText("Name :");

        labelPrice.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelPrice.setText("Price :");

        labelDescription.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelDescription.setText("Description :");

        labelQuantity.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelQuantity.setText("Quantity :");

        labelStatus.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelStatus.setText("Status :");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        buttonEnterAdd.setText("Enter");

        GroupLayout panelTopLayout = new GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelName, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(labelPrice, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(labelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEnterAdd, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelTopLayout.setVerticalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDescription)
                                        .addComponent(labelQuantity)
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonEnterAdd)
                                        .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelStatus)
                                        .addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );


        scrollTable.setViewportView(tableAddProduct);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelTop, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollTable)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelTop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrollTable, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
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
    public void setAddButton(ActionListener listener){
        buttonEnterAdd.addActionListener(listener);
    }

}
