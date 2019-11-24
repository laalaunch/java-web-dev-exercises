package studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdateDate;

    private ArrayList<MenuItem> menuItems;

    public Menu(Date lastUpdateDate, ArrayList<MenuItem> menuItems) {
        this.lastUpdateDate = lastUpdateDate;
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                menuItems +
                '}';
    }
}
