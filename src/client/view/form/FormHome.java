package client.view.form;

import client.model.Connect;
import common.SetJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class FormHome extends JPanel {
    private JButton addButton = new JButton();
    private JPanel homeHeaderPanel = new JPanel();
    private JScrollPane homeScroll = new JScrollPane();
    private JTextField homeSearchBar = new JTextField();
    private JTable homeTable = new JTable();
    private JLabel homeTitle = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTable1 = new JTable();


    public FormHome() {
        initComponents();
    }

    private void initComponents() {

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

        homeHeaderPanel.setBackground(new java.awt.Color(14, 210, 196));

        homeTitle.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 36));
        homeTitle.setForeground(new java.awt.Color(255, 255, 255));
        homeTitle.setText("PRODUCTS ON SALE");

        homeSearchBar.setFont(new java.awt.Font("Segoe UI", Font.ITALIC, 14));
        homeSearchBar.setForeground(new java.awt.Color(153, 153, 153));
        homeSearchBar.setText("Search here...");
        homeSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeSearchBarActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI Black", Font.BOLD, 14));
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        GroupLayout homeHeaderPanelLayout = new GroupLayout(homeHeaderPanel);
        homeHeaderPanel.setLayout(homeHeaderPanelLayout);
        homeHeaderPanelLayout.setHorizontalGroup(
                homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                                .addGap(348, 348, 348)
                                                .addComponent(homeTitle))
                                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(homeSearchBar, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(72, Short.MAX_VALUE))
        );
        homeHeaderPanelLayout.setVerticalGroup(
                homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(homeTitle, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addButton, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(homeSearchBar))
                                .addGap(20, 20, 20))
        );
        homeScroll.setViewportView(homeTable);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(homeHeaderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeScroll)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(homeHeaderPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(homeScroll, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void homeSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    public void setHomeTable(DefaultTableModel tableModel){
        homeTable.setModel(tableModel);
    }
}
