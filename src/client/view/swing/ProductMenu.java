package client.view.swing;

import client.view.modelMenu.ModelMenu;

import javax.swing.*;
import java.awt.*;

public class ProductMenu extends JPanel{
    private JLabel labelName;
    private boolean over;
    private boolean selected;

    public ProductMenu(ModelMenu data){
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

        labelName = new javax.swing.JLabel();

        setOpaque(false);

        labelName.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12));
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("MenuName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelName)
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelName)
                                .addContainerGap(14, Short.MAX_VALUE))
        );
    }

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
