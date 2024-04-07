package server.view.Component;

import server.view.MenuClass.ModelCard;

import javax.swing.*;
import java.awt.*;

public class CardNumUser extends JPanel {
    private JLabel labelUser = new JLabel();
    private JLabel labelValue = new JLabel();

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
    private Color color1 = Color.ORANGE;
    private Color color2 = Color.WHITE;

    public CardNumUser() {
        initComponents();
        setOpaque(false);
    }
    public void setData(ModelCard data) {

        labelUser.setText(data.getTitle());
        labelValue.setText(data.getValues());

    }

    private void initComponents() {

        labelUser.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("Value");

        labelValue.setBackground(new java.awt.Color(255, 255, 255));
        labelValue.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        labelValue.setForeground(new java.awt.Color(255, 255, 255));
        labelValue.setText("Users");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelValue)
                                        .addComponent(labelUser))
                                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addComponent(labelValue)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelUser)
                                .addGap(60, 60, 60))
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
