package client.view.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormHome extends JPanel {
    private JButton addButton;
    private JPanel homeHeaderPanel;
    private JScrollPane homeScroll;
    private JTextField homeSearchBar;
    private JTable homeTable;
    private JLabel homeTitle;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    /**
     * Creates new form FormHome
     */
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

        homeHeaderPanel.setBackground(new java.awt.Color(14, 210, 196));

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
                                                .addComponent(homeSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(72, Short.MAX_VALUE))
        );
        homeHeaderPanelLayout.setVerticalGroup(
                homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homeHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(homeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homeHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(homeSearchBar))
                                .addGap(20, 20, 20))
        );

        homeTable.setModel(new javax.swing.table.DefaultTableModel(
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
            Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                                .addComponent(homeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void homeSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
