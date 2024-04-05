package client.view.form;

import javax.swing.*;

public class FormCart extends JPanel {
    private JPanel cartDeletePanel;
    private JPanel cartHeaderPanel;
    private JScrollPane cartScroll;
    private JTextField cartSearchBar;
    private JTable cartTable;
    private JLabel cartTitle;
    private JButton deleteButton;
    private JToggleButton jToggleButton1;

    /**
     * Creates new form FormCart
     */
    public FormCart() {
        initComponents();
    }

    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        cartHeaderPanel = new javax.swing.JPanel();
        cartTitle = new javax.swing.JLabel();
        cartSearchBar = new javax.swing.JTextField();
        cartDeletePanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        cartScroll = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        cartHeaderPanel.setBackground(new java.awt.Color(102, 204, 255));

        cartTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        cartTitle.setForeground(new java.awt.Color(255, 255, 255));
        cartTitle.setText("CART PRODUCTS");

        cartSearchBar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cartSearchBar.setForeground(new java.awt.Color(153, 153, 153));
        cartSearchBar.setText("Search here...");
        cartSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartSearchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartHeaderPanelLayout = new javax.swing.GroupLayout(cartHeaderPanel);
        cartHeaderPanel.setLayout(cartHeaderPanelLayout);
        cartHeaderPanelLayout.setHorizontalGroup(
                cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                .addGroup(cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(cartSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(cartHeaderPanelLayout.createSequentialGroup()
                                                .addGap(378, 378, 378)
                                                .addComponent(cartTitle)))
                                .addContainerGap(154, Short.MAX_VALUE))
        );
        cartHeaderPanelLayout.setVerticalGroup(
                cartHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartHeaderPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cartSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
        );

        cartDeletePanel.setBackground(new java.awt.Color(255, 204, 102));

        deleteButton.setBackground(new java.awt.Color(255, 153, 51));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartDeletePanelLayout = new javax.swing.GroupLayout(cartDeletePanel);
        cartDeletePanel.setLayout(cartDeletePanelLayout);
        cartDeletePanelLayout.setHorizontalGroup(
                cartDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartDeletePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton)
                                .addGap(22, 22, 22))
        );
        cartDeletePanelLayout.setVerticalGroup(
                cartDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartDeletePanelLayout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
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
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScroll.setViewportView(cartTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cartHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartDeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartScroll)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(cartHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cartScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cartDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void cartSearchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
