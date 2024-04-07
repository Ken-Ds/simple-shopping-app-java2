package server.view.PanelMenus;

import server.view.Component.CardNumUser;
import server.view.Component.CardOrder;
import server.view.Component.CardProfit;
import server.view.Component.PanelBoard;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DashboardPanel extends JPanel {
    private boolean selected;
    private CardNumUser cardNumUser = new CardNumUser();
    private CardOrder cardOrder = new CardOrder();
    private CardProfit cardProfit = new CardProfit();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel labelStats = new JLabel();
    private JLayeredPane layeredpaneDashboard = new JLayeredPane();
    private PanelBoard panelDashboard = new PanelBoard();
    private JTable table = new JTable();

    public DashboardPanel() {
        initComponents();
        setOpaque(false);

    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    private void initComponents() {

        setBackground(new java.awt.Color(242, 242, 242));

        layeredpaneDashboard.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        cardProfit.setColor1(new java.awt.Color(255, 205, 170));
        cardProfit.setColor2(new java.awt.Color(255, 205, 170));
        layeredpaneDashboard.add(cardProfit);

        cardNumUser.setColor1(new java.awt.Color(238, 137, 128));
        cardNumUser.setColor2(new java.awt.Color(238, 137, 128));
        layeredpaneDashboard.add(cardNumUser);

        cardOrder.setColor1(new java.awt.Color(156, 184, 152));
        cardOrder.setColor2(new java.awt.Color(156, 184, 152));
        layeredpaneDashboard.add(cardOrder);

        panelDashboard.setBackground(new java.awt.Color(255, 255, 255));

        labelStats.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        labelStats.setText("Statistics");

        table.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        jScrollPane1.setViewportView(table);

        GroupLayout panelDashboardLayout = new GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
                panelDashboardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelStats)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        panelDashboardLayout.setVerticalGroup(
                panelDashboardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelStats)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(layeredpaneDashboard)
                                        .addComponent(panelDashboard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(layeredpaneDashboard, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(panelDashboard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }

    public void setDashboard(DefaultTableModel dashboard){
        table.setModel(dashboard);
    }
}
