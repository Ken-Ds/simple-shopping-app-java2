package client.view.form;


import common.SetJTable;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormCart extends JPanel {
    private JPanel cartHeaderPanel = new JPanel();
    private JScrollPane cartScroll = new JScrollPane();
    private JTextField cartSearchBar = new JTextField();
    public JTable cartTable = new JTable();
    private JLabel cartTitle = new JLabel();
    private JButton deleteButton = new JButton();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JButton searchButtonCart = new JButton();
    public SetJTable table = new SetJTable();


    public FormCart() {
        initComponents();
    }

    private void initComponents() {

        jToggleButton1.setText("jToggleButton1");

        cartHeaderPanel.setBackground(new Color(102, 204, 255));

        cartTitle.setFont(new Font("Century Gothic", Font.BOLD, 36));
        cartTitle.setForeground(new Color(255, 255, 255));
        cartTitle.setText("CART PRODUCTS");

        cartSearchBar.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        cartSearchBar.setForeground(new Color(153, 153, 153));
        cartSearchBar.setText("Search here...");


        deleteButton.setBackground(new Color(204, 204, 204));
        deleteButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        deleteButton.setText("DELETE");

        searchButtonCart.setBackground(new Color(204, 204, 204));
        searchButtonCart.setFont(new Font("Segoe UI", Font.BOLD, 12));
        searchButtonCart.setText("Search");

        GroupLayout cartHeaderPanelLayout = new GroupLayout(cartHeaderPanel);
        cartHeaderPanel.setLayout(cartHeaderPanelLayout);
        cartHeaderPanelLayout.setHorizontalGroup(
                cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(cartSearchBar, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchButtonCart)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(deleteButton))
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(378, 378, 378)
                                                .addComponent(cartTitle)))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        cartHeaderPanelLayout.setVerticalGroup(
                cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(cartHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(deleteButton)
                                                .addComponent(searchButtonCart))
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addComponent(cartTitle, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(cartSearchBar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 22, Short.MAX_VALUE))
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


    public void setCartTable(DefaultTableModel model){
        cartTable.setModel(model);
    }
    public void setButtonDelete(ActionListener listener){
        deleteButton.addActionListener(listener);
    }
    public String returnName(){
        return cartSearchBar.getText();
    }
    public  void setButtonSearch(ActionListener listener){
        searchButtonCart.addActionListener(listener);
    }

}
