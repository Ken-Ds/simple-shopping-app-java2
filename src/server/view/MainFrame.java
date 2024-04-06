package server.view;

import server.view.Component.Header;
import server.view.Component.PanelBoard;
import server.view.EventMenu.EventMenuSelected;
import server.view.Menu.MainMenu;
import server.view.PanelMenus.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private DashboardPanel dashboard = new DashboardPanel();
    private ViewClientPanel client = new ViewClientPanel();
    private AddPanel add = new AddPanel();
    private ViewProductPanel view = new ViewProductPanel();
    private DeletePanel delete = new DeletePanel();
    private EditPanel edit = new EditPanel();
    private JPanel MainPanel = new JPanel();
    private Header header = new Header();
    private MainMenu menu = new MainMenu();
    private PanelBoard panelBoard = new PanelBoard();

    public MainFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(MainFrame.this);
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
                    add = new AddPanel();
                } else if (index == 1) {
                    setForm(view);
                    view = new ViewProductPanel();
                }  else if (index == 2) {
                    setForm(delete);
                    delete = new DeletePanel();
                }  else if (index == 3) {
                    setForm(edit);
                    edit = new EditPanel();
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


}
