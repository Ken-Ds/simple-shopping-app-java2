/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Server;

import Server.View.Component.Header;
import Server.View.Component.PanelBoard;
import Server.View.EventMenu.EventMenuSelected;
import Server.View.Menu.MainMenu;
import Server.View.PanelMenus.*;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private DashboardPanel dashboard;
    private ViewClientPanel client;
    private AddPanel add;
    private ViewProductPanel view;
    private DeletePanel delete;
    private EditPanel edit;


    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        dashboard = new DashboardPanel();
        client= new ViewClientPanel();
        add = new AddPanel();
        view = new ViewProductPanel();
        delete = new DeletePanel();
        edit = new EditPanel();
        menu.initMoving(Main.this);
        menu.addEventMenuSelectedDashboard(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(dashboard);
                } else if (index == 1) {
                    setForm(dashboard);
                } else if (index == 2) {
                    setForm(client);
                }
            }
        });
        setForm(new DashboardPanel());

        menu.addEventMenuSelectedProduct(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(add);
                } else if (index == 1) {
                    setForm(view);
                }  else if (index == 2) {
                    setForm(delete);
                }  else if (index == 3) {
                    setForm(edit);
                }
            }
        });
    }


    private void setForm(JComponent com) {
        MainPanel.removeAll();
        MainPanel.add(com);
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    private void initComponents() {

        panelBoard = new PanelBoard();
        MainPanel = new JPanel();
        menu = new MainMenu();
        header = new Header();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBoard.setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setOpaque(false);
        MainPanel.setLayout(new java.awt.BorderLayout());

        GroupLayout panelBoardLayout = new GroupLayout(panelBoard);
        panelBoard.setLayout(panelBoardLayout);
        panelBoardLayout.setHorizontalGroup(
                panelBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelBoardLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(menu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                                        .addComponent(header, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBoardLayout.setVerticalGroup(
                panelBoardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBoardLayout.createSequentialGroup()
                                .addComponent(header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(menu, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBoard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBoard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private JPanel MainPanel;
    private Header header;
    private MainMenu menu;
    private PanelBoard panelBoard;
}
