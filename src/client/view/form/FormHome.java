package client.view.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;


public class FormHome extends JPanel {
    private JButton addButton = new JButton();
    private JPanel homeHeaderPanel = new JPanel();
    private JScrollPane homeScroll = new JScrollPane();
    public JTextField homeSearchBar = new JTextField();
    public JTable homeTable = new JTable();
    private JLabel homeTitle = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTable1 = new JTable();
    private JButton searchButtonHome =  new JButton();


    public FormHome() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1.setViewportView(jTable1);

        homeHeaderPanel.setBackground(new Color(32, 217, 217));

        homeTitle.setFont(new Font("Century Gothic", Font.BOLD, 36));
        homeTitle.setForeground(new Color(255, 255, 255));
        homeTitle.setText("PRODUCTS ON SALE");

        homeSearchBar.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        homeSearchBar.setForeground(new Color(153, 153, 153));

        addButton.setBackground(new Color(204, 204, 204));
        addButton.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
        addButton.setText("+");


        searchButtonHome.setBackground(new Color(204, 204, 204));
        searchButtonHome.setFont(new Font("Segoe UI", Font.BOLD, 12));
        searchButtonHome.setText("Search");

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
                                                .addComponent(homeSearchBar, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchButtonHome)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        homeHeaderPanelLayout.setVerticalGroup(
                homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(homeTitle, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(homeSearchBar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton)
                                        .addComponent(searchButtonHome))
                                .addGap(19, 19, 19))
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
                                .addComponent(homeScroll, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
    }

    public void setHomeTable(DefaultTableModel tableModel){
        homeTable.setModel(tableModel);
    }
    public void setButtonAdd(ActionListener listener){
        addButton.addActionListener(listener);
    }
    public  void setButtonSearch(ActionListener listener){
        searchButtonHome.addActionListener(listener);
    }
}
