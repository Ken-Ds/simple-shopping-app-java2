package server.view.Component;

import server.view.MenuClass.ModelCard;

import java.awt.*;
import javax.swing.*;

public class CardOrder extends JPanel {
    private JLabel labelOrder;
    private JLabel labelValue;

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


    public CardOrder() {
        initComponents();
        setOpaque(false);
        color1 = Color.ORANGE;
        color2 = Color.WHITE;
    }
    public void setData(ModelCard data) {

        labelOrder.setText(data.getTitle());
        labelValue.setText(data.getValues());

    }

    private void initComponents() {

        labelOrder = new JLabel();
        labelValue = new JLabel();

        labelOrder.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        labelOrder.setForeground(new java.awt.Color(255, 255, 255));
        labelOrder.setText("Order");

        labelValue.setBackground(new java.awt.Color(255, 255, 255));
        labelValue.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        labelValue.setForeground(new java.awt.Color(255, 255, 255));
        labelValue.setText("Values");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(labelValue)
                                        .addComponent(labelOrder))
                                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(labelOrder)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelValue)
                                .addContainerGap(60, Short.MAX_VALUE))
        );
    }
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
}
