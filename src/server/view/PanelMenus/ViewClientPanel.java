package server.view.PanelMenus;

import java.awt.*;
import javax.swing.*;

public class ViewClientPanel extends JPanel {
    private JButton buttonSearch = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable tableViewClient = new JTable();

    public ViewClientPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(new java.awt.Color(242, 242, 242));

        tableViewClient.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Username", "ID"
                }
        ));
        jScrollPane1.setViewportView(tableViewClient);

        buttonSearch.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        buttonSearch.setText("Search");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonSearch, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch)
                                .addGap(8, 8, 8))
        );
    }
}
