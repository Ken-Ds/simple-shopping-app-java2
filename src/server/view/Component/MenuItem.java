package server.view.Component;
import server.view.MenuClass.ModelMenu;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;

public class MenuItem extends JPanel {
    private JLabel labelName;
    private boolean selected;
    private boolean over;
    public MenuItem(ModelMenu data) {
        initComponents();
        initComponents();
        setOpaque(false);

        if (data.getType() == ModelMenu.MenuType.MENU) {
            labelName.setText(data.getName());
        } else if (data.getType() == ModelMenu.MenuType.TITLE) {

            labelName.setVisible(false);
        } else {
            labelName.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    private void initComponents() {

        labelName = new JLabel();

        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Menu Name");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelName)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelName, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
    }// </editor-fold>

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }



}
