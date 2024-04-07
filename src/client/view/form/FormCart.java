package client.view.form;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormCart extends JPanel {
    private JPanel cartHeaderPanel = new JPanel();
    private JScrollPane cartScroll = new JScrollPane();
    private JTextField cartSearchBar = new JTextField();
    private JTable cartTable = new JTable();
    private JLabel cartTitle = new JLabel();
    private JButton deleteButton = new JButton();
    private JToggleButton jToggleButton1 = new JToggleButton();


    public FormCart() {
        initComponents();
    }

    private void initComponents() {

        jToggleButton1.setText("jToggleButton1");

        cartHeaderPanel.setBackground(new java.awt.Color(102, 204, 255));

        cartTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        cartTitle.setForeground(new java.awt.Color(255, 255, 255));
        cartTitle.setText("CART PRODUCTS");

        cartSearchBar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cartSearchBar.setForeground(new java.awt.Color(153, 153, 153));
        cartSearchBar.setText("Search here...");
        cartSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartSearchBarActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        GroupLayout cartHeaderPanelLayout = new GroupLayout(cartHeaderPanel);
        cartHeaderPanel.setLayout(cartHeaderPanelLayout);
        cartHeaderPanelLayout.setHorizontalGroup(
                cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(378, 378, 378)
                                                .addComponent(cartTitle))
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(cartSearchBar, GroupLayout.PREFERRED_SIZE, 842, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteButton)))
                                .addContainerGap(79, Short.MAX_VALUE))
        );
        cartHeaderPanelLayout.setVerticalGroup(
                cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, cartHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cartTitle, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cartSearchBar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE))
        );
        cartScroll.setViewportView(cartTable);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(cartHeaderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartScroll)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(cartHeaderPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cartScroll, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
    }

    private void cartSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void setCartTable(DefaultTableModel model){
        cartTable.setModel(model);
    }
}
