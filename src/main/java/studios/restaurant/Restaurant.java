package studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Menu(new Date(), new ArrayList<MenuItem>());

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "French Onion Soup", "Cup of Classic Onion Soup", 3.99, "Starters", new Date());
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Beef & Philly", "Hot sandwich onions, green peppers, mushrooms, on Crusty French Bread", 10.99, "Sandwiches", new Date());
        menuItems.add(menuItem2);

        menu.setMenuItems(menuItems);

        System.out.println(menu);
    }
}

