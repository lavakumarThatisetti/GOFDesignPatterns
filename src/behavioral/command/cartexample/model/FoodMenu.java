package behavioral.command.cartexample.model;


import java.util.List;


public class FoodMenu {
    private String id;
    private List<String> restaurantIds;
    private List<MenuItem> menuItemList;

    public String getId() {
        return id;
    }

    public List<String> getRestaurantIds() {
        return restaurantIds;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}
