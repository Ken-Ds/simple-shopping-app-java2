package server.view.Component;

import java.awt.*;
import javax.swing.*;

public class Header extends JPanel {
    private JLabel labelExit;
    private JPanel panelExit;

    public Header() {
        initComponents();
        setOpaque(false);
    }


    private void initComponents() {

        panelExit = new JPanel();
        labelExit = new JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        panelExit.setBackground(new java.awt.Color(255, 255, 255));
        panelExit.setOpaque(false);
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        labelExit.setForeground(new java.awt.Color(255, 255, 255));
        labelExit.setHorizontalAlignment(SwingConstants.CENTER);
        labelExit.setText("X");

        GroupLayout panelExitLayout = new GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
                panelExitLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelExitLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelExit)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelExitLayout.setVerticalGroup(
                panelExitLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelExit, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(859, Short.MAX_VALUE)
                                .addComponent(panelExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }




}
