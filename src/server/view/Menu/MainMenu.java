package server.view.Menu;

import server.view.EventMenu.EventMenuSelected;
import server.view.MenuClass.ModelMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainMenu extends JPanel {
    private JLabel labelAdmin = new JLabel();
    private JLabel labelProduct = new JLabel();
    private server.view.MenuClass.ListMenu<String> listMenuDashBoard = new server.view.MenuClass.ListMenu<>();
    private server.view.MenuClass.ListMenu<String> listMenuProduct = new server.view.MenuClass.ListMenu<>();
    private JPanel panelMoving = new JPanel();
    private JSeparator separatorBottom = new JSeparator();
    private JSeparator separatorTop = new JSeparator();
    private EventMenuSelected eventDashboard;
    private EventMenuSelected eventProduct;
    private int x;
    private int y;
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
        listMenuDashBoard.addItem(new ModelMenu( " ", ModelMenu.MenuType.EMPTY));
        listMenuDashBoard.addItem(new ModelMenu( "Dashboard", ModelMenu.MenuType.MENU));
        listMenuDashBoard.addItem(new ModelMenu( "Client", ModelMenu.MenuType.MENU));
        listMenuDashBoard.addItem(new ModelMenu( " ", ModelMenu.MenuType.EMPTY));
        listMenuProduct.addItem(new ModelMenu( "ADD", ModelMenu.MenuType.MENU));
        listMenuProduct.addItem(new ModelMenu( "VIEW", ModelMenu.MenuType.MENU));
        listMenuProduct.addItem(new ModelMenu( "DELETE", ModelMenu.MenuType.MENU));
        listMenuProduct.addItem(new ModelMenu( "EDIT", ModelMenu.MenuType.MENU));
        listMenuProduct.addItem(new ModelMenu( " ", ModelMenu.MenuType.EMPTY));

    }

    private void initComponents() {

        panelMoving.setOpaque(false);

        labelAdmin.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 24));
        labelAdmin.setHorizontalAlignment(SwingConstants.CENTER);
        labelAdmin.setText("ADMIN");

        GroupLayout panelMovingLayout = new GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
                panelMovingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelMovingLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(labelAdmin)
                                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
                panelMovingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAdmin, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        listMenuDashBoard.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 24));

        listMenuProduct.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 24));

        labelProduct.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 15));
        labelProduct.setForeground(new java.awt.Color(255, 255, 255));
        labelProduct.setText("Product");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelMoving, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listMenuDashBoard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorTop, GroupLayout.Alignment.TRAILING)
                        .addComponent(listMenuProduct, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorBottom)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelProduct)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(panelMoving, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(separatorTop, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listMenuDashBoard, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(separatorBottom, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(labelProduct)
                                .addGap(18, 18, 18)
                                .addComponent(listMenuProduct, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(97, Short.MAX_VALUE))
        );
    }
    @Override
    protected void paintChildren(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g= new GradientPaint(0, 0, Color.decode("#ff9999"), 0, getHeight(), Color.decode("#ff3366"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(graphics);
    }


    public void initMoving(JFrame frame) {
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
                frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }
}
