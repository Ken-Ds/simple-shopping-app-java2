package server.view.PanelMenus;
import common.SetJTable;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.SetJTable.deleteProduct;

public class DeletePanel extends JPanel {
    private JToggleButton buttonDelete = new JToggleButton();
    private JScrollPane scrollDelete = new JScrollPane();
    private JTable tableDeleteProduct = new JTable();
    private SetJTable set = new SetJTable();
    private JTextField txtId = new JTextField();

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
                String id = txtId.getText();
                if (!id.isEmpty()) {
                    deleteProduct(id);
                    txtId.setText("");
                    tableDeleteProduct.setModel(set.setTable());
                }
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollDelete, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDelete)
                                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
    }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {
    }
}
