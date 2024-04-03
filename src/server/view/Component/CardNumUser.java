/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package server.view.Component;

import server.view.MenuClass.Model_Card;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dell
 */
public class CardNumUser extends JPanel {
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    private Color color1;
    private Color color2;

    public CardNumUser() {
        initComponents();
        setOpaque(false);
        color1 = Color.ORANGE;
        color2 = Color.WHITE;
    }
    public void setData(Model_Card data) {

        labelUser.setText(data.getTitle());
        labelValue.setText(data.getValues());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelUser = new javax.swing.JLabel();
        labelValue = new javax.swing.JLabel();

        labelUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("Value");

        labelValue.setBackground(new java.awt.Color(255, 255, 255));
        labelValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelValue.setForeground(new java.awt.Color(255, 255, 255));
        labelValue.setText("Users");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelValue)
                                        .addComponent(labelUser))
                                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addComponent(labelValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelUser)
                                .addGap(60, 60, 60))
        );
    }// </editor-fold>
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify
    private JLabel labelUser;
    private JLabel labelValue;
    // End of variables declaration
}
