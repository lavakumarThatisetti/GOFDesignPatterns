package behavioral.command.cartexample.data;

import behavioral.command.cartexample.model.FoodMenu;
import behavioral.command.cartexample.model.MenuItem;

import java.util.HashMap;
import java.util.Map;

public class FoodMenuData {
    private Map<String, FoodMenu> foodMenuById = new HashMap<>();
    private Map<String, String> foodMenuIdByRestaurantId = new HashMap<>();
    private Map<String, MenuItem> menuItemById = new HashMap<>();


    public Map<String, FoodMenu> getFoodMenuById() {
        return foodMenuById;
    }

    public Map<String, String> getFoodMenuIdByRestaurantId() {
        return foodMenuIdByRestaurantId;
    }

    public Map<String, MenuItem> getMenuItemById() {
        return menuItemById;
    }
}
