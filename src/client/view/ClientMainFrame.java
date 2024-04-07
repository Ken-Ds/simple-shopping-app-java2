package client.view;

import client.model.Connect;
import client.view.component.ClientMenu;
import client.view.component.Header;
import client.view.event.EventMenuSelected;
import client.view.form.FormCart;
import client.view.form.FormHome;
import client.view.swing.PanelBorder;
import common.SetJTable;
import server.model.ParseGson;

import java.awt.Color;
import javax.swing.*;

public class ClientMainFrame extends JFrame {
    private ClientMenu clientMenu1 = new ClientMenu();
    private Header mainHeader = new Header();
    private JPanel mainPanel = new JPanel();
    private PanelBorder panelBorder1 = new PanelBorder();
    private FormHome home = new FormHome();
    private FormCart cart = new FormCart();

    public ClientMainFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        clientMenu1.initMoving(ClientMainFrame.this);
        clientMenu1.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    ParseGson parseGson = new ParseGson();
                    SetJTable setJTable = new SetJTable();
                    Connect connect = new Connect();
                    home.setHomeTable(setJTable.setProductClientTable(connect.getProducts()));
                    setForm(home);
                } else if (index == 2) {
                    ParseGson parseGson = new ParseGson();
                    SetJTable setJTable = new SetJTable();
                    Connect connect = new Connect();
                    cart.setCartTable(setJTable.setClientCart(connect.getCart()));
                    setForm(cart);
                }
            }
        });
        setForm(new FormHome());
    }
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainHeader, GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(mainHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(clientMenu1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(panelBorder1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(panelBorder1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clientMenu1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
}
