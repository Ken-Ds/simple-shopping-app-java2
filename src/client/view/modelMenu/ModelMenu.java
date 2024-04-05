package client.view.modelMenu;

public class ModelMenu {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public ModelMenu(String name, MenuType type) {
        this.name = name;
        this.type = type;
    }

    public ModelMenu() {
    }
    private String name;
    private MenuType type;


    public static enum MenuType {
        TITLE,MENU,EMPTY
    }
}
