package server.view.PanelMenus;
import common.SetJTable;

import javax.swing.*;
import java.awt.*;

public class DeletePanel extends JPanel {
    private JToggleButton buttonDelete = new JToggleButton();
    private JScrollPane scrollDelete = new JScrollPane();
    private JTable tableDeleteProduct = new JTable();
    private SetJTable set = new SetJTable();

    public DeletePanel() {
        initComponents();
    }

    private void initComponents() {
        tableDeleteProduct.setModel(set.setTable());

        scrollDelete.setViewportView(tableDeleteProduct);
        tableDeleteProduct.setEnabled(false);

        buttonDelete.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollDelete, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollDelete, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete)
                                .addContainerGap())
        );
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {

    }
}
