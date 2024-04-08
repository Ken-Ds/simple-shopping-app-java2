package server.view.PanelMenus;
import common.SetJTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewProductPanel extends JPanel {
    private JButton buttonViewProd = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel labelID = new JLabel();
    private JPanel panelTop = new JPanel();
    public JTable tableViewProduct = new JTable();
    private JTextField txtID = new JTextField();
    public SetJTable set = new SetJTable();

    public ViewProductPanel() {
        initComponents();
    }

    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(871, 483));
        tableViewProduct.setModel(set.setTable());
        tableViewProduct.setEnabled(false);
        jScrollPane1.setViewportView(tableViewProduct);

        labelID.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        labelID.setText("Name :");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        buttonViewProd.setText("Enter");

        GroupLayout panelTopLayout = new GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelID, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(buttonViewProd, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTopLayout.setVerticalGroup(
                panelTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonViewProd))
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
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelTop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
    }
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {
    }
    public String returnId(){
        return txtID.getText();
    }
    public void setSearchProduct(ActionListener listener){
        buttonViewProd.addActionListener(listener);
    }
}
