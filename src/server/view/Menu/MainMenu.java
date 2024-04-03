/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package server.view.Menu;

import server.view.EventMenu.EventMenuSelected;
import server.view.MenuClass.Model_Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author Dell
 */
public class MainMenu extends javax.swing.JPanel {

    private EventMenuSelected eventDashboard;
    private EventMenuSelected eventProduct;
    public void addEventMenuSelectedDashboard(EventMenuSelected eventDashboard) {
        this.eventDashboard = eventDashboard;
        listMenuDashBoard.addEventMenuSelected(eventDashboard);

    }
    public void addEventMenuSelectedProduct(EventMenuSelected eventProduct) {
        this.eventProduct = eventProduct;
        listMenuProduct.addEventMenuSelected(eventProduct);

    }

    public MainMenu() {
        initComponents();
        setOpaque(false);
        listMenuDashBoard.setOpaque(false);
        listMenuProduct.setOpaque(false);
        init();
    }

    private void init() {
        listMenuDashBoard.addItem(new Model_Menu( " ", Model_Menu.MenuType.EMPTY));
        listMenuDashBoard.addItem(new Model_Menu( "Dashboard", Model_Menu.MenuType.MENU));
        listMenuDashBoard.addItem(new Model_Menu( "Client", Model_Menu.MenuType.MENU));
        listMenuDashBoard.addItem(new Model_Menu( " ", Model_Menu.MenuType.EMPTY));
        listMenuProduct.addItem(new Model_Menu( "ADD", Model_Menu.MenuType.MENU));
        listMenuProduct.addItem(new Model_Menu( "VIEW", Model_Menu.MenuType.MENU));
        listMenuProduct.addItem(new Model_Menu( "DELETE", Model_Menu.MenuType.MENU));
        listMenuProduct.addItem(new Model_Menu( "EDIT", Model_Menu.MenuType.MENU));
        listMenuProduct.addItem(new Model_Menu( " ", Model_Menu.MenuType.EMPTY));



    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        labelAdmin = new javax.swing.JLabel();
        listMenuDashBoard = new server.view.MenuClass.ListMenu<>();
        separatorTop = new javax.swing.JSeparator();
        listMenuProduct = new server.view.MenuClass.ListMenu<>();
        separatorBottom = new javax.swing.JSeparator();
        labelProduct = new javax.swing.JLabel();

        panelMoving.setOpaque(false);

        labelAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdmin.setText("ADMIN");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
                panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMovingLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(labelAdmin)
                                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
                panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        listMenuDashBoard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        listMenuProduct.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        labelProduct.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelProduct.setForeground(new java.awt.Color(255, 255, 255));
        labelProduct.setText("Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listMenuDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorTop, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(listMenuProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorBottom)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelProduct)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(separatorTop, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listMenuDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(separatorBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(labelProduct)
                                .addGap(18, 18, 18)
                                .addComponent(listMenuProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g= new GradientPaint(0, 0, Color.decode("#ff9999"), 0, getHeight(), Color.decode("#ff3366"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelProduct;
    private server.view.MenuClass.ListMenu<String> listMenuDashBoard;
    private server.view.MenuClass.ListMenu<String> listMenuProduct;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JSeparator separatorBottom;
    private javax.swing.JSeparator separatorTop;
    // End of variables declaration
}
