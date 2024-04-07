package server.view.Component;

import common.SetJTable;
import server.view.MenuClass.ModelCard;

import java.awt.*;
import javax.swing.*;

import static common.SetJTable.countUniqueProducts;

public class CardProfit extends JPanel {
    private JLabel labelProfit = new JLabel();
    public JLabel labelValue = new JLabel();

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

    public CardProfit() {
        initComponents();
        labelValue.setText(String.valueOf(countUniqueProducts()));
        setOpaque(false);
        color1 = Color.ORANGE;
        color2 = Color.WHITE;
    }
    public void setData(ModelCard data) {
        labelProfit.setText(data.getTitle());
        labelValue.setText(data.getValues());
    }

    private void initComponents() {

        setBackground(new Color(204, 204, 204));

        labelValue.setBackground(new Color(255, 255, 255));
        labelValue.setFont(new Font("Segoe UI", Font.BOLD, 14));
        labelValue.setForeground(new Color(255, 255, 255));


        labelProfit.setFont(new Font("Segoe UI", Font.BOLD, 14));
        labelProfit.setForeground(new Color(255, 255, 255));
        labelProfit.setText("Products");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(labelValue)
                                        .addComponent(labelProfit))
                                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addComponent(labelProfit)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelValue)
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
