package client.view.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormCart extends JPanel {
    private JPanel cartHeaderPanel;
    private JScrollPane cartScroll;
    private JTextField cartSearchBar;
    private JTable cartTable;
    private JLabel cartTitle;
    private JButton deleteButton;
    private JToggleButton jToggleButton1;

    /**
     * Creates new form FormCart
     */
    public FormCart() {
        initComponents();
    }

    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        cartHeaderPanel = new javax.swing.JPanel();
        cartTitle = new javax.swing.JLabel();
        cartSearchBar = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        cartScroll = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();

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

        javax.swing.GroupLayout cartHeaderPanelLayout = new javax.swing.GroupLayout(cartHeaderPanel);
        cartHeaderPanel.setLayout(cartHeaderPanelLayout);
        cartHeaderPanelLayout.setHorizontalGroup(
                cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(378, 378, 378)
                                                .addComponent(cartTitle))
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(cartSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteButton)))
                                .addContainerGap(79, Short.MAX_VALUE))
        );
        cartHeaderPanelLayout.setVerticalGroup(
                cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cartSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE))
        );

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "PRODUCT", "DESCRIPTION", "STOCKS", "PRICE"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScroll.setViewportView(cartTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cartHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartScroll)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(cartHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cartScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
    }

    private void cartSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
