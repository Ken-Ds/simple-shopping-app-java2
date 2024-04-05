package server.view.PanelMenus;

import common.SetJTable;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewClientPanel extends JPanel {
    private JButton buttonSearch = new JButton();
    private JLabel labelUser = new JLabel();
    private JTextField textUsername = new JTextField();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable tableViewClient = new JTable();
    private SetJTable set = new SetJTable();

    public ViewClientPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(new java.awt.Color(242, 242, 242));
        tableViewClient.setModel(set.setViewClientTable());

        jScrollPane1.setViewportView(tableViewClient);

        buttonSearch.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        buttonSearch.setText("Search");

        labelUser.setText("Username :");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(buttonSearch, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonSearch)
                                        .addComponent(labelUser)
                                        .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );
    }
}
