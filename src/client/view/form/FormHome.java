package client.view.form;

import client.model.Connect;
import common.Product;
import common.SetJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class FormHome extends JPanel {
    private JButton addButton = new JButton();
    private JPanel homeHeaderPanel = new JPanel();
    private JScrollPane homeScroll = new JScrollPane();
    private JTextField homeSearchBar = new JTextField();
    public JTable homeTable = new JTable();
    private JLabel homeTitle = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTable1 = new JTable();
    private JButton searchButtonHome =  new JButton();


    public FormHome() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        homeHeaderPanel = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        homeSearchBar = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        searchButtonHome = new javax.swing.JButton();
        homeScroll = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        homeHeaderPanel.setBackground(new java.awt.Color(32, 217, 217));

        homeTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        homeTitle.setForeground(new java.awt.Color(255, 255, 255));
        homeTitle.setText("PRODUCTS ON SALE");

        homeSearchBar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        homeSearchBar.setForeground(new java.awt.Color(153, 153, 153));
        homeSearchBar.setText("Search here...");
        homeSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeSearchBarActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        searchButtonHome.setBackground(new java.awt.Color(204, 204, 204));
        searchButtonHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchButtonHome.setText("Search");
        searchButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeHeaderPanelLayout = new javax.swing.GroupLayout(homeHeaderPanel);
        homeHeaderPanel.setLayout(homeHeaderPanelLayout);
        homeHeaderPanelLayout.setHorizontalGroup(
                homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                                .addGap(348, 348, 348)
                                                .addComponent(homeTitle))
                                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(homeSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchButtonHome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        homeHeaderPanelLayout.setVerticalGroup(
                homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(homeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(homeSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton)
                                        .addComponent(searchButtonHome))
                                .addGap(19, 19, 19))
        );

        homeScroll.setViewportView(homeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homeHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeScroll)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(homeHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(homeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = homeTable.getSelectedRow();
        if(selectedRow >= 0){
            DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
            String productName = (String) model.getValueAt(selectedRow,0);
            String productPrice = (String) model.getValueAt(selectedRow,2);
            String productDescription = (String) model.getValueAt(selectedRow,1);
            Product product = new Product(productName,productPrice,productDescription);
            Connect connect = new Connect();
            connect.addToCart("0",product );
            model.removeRow(selectedRow);
        }
    }
    private void searchButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void homeSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    public void setHomeTable(DefaultTableModel tableModel){
        homeTable.setModel(tableModel);
    }
}
