package behavioral.command.cartexample.data;


import behavioral.command.cartexample.FoodDeliveryException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CartData {
    private Map<String, Map<String, List<String>>> userToRestaurantIdToMenuItemIds = new HashMap<>();

    public List<String> getMenuItemIds(final String userId, final String restaurantId) {
        Map<String, List<String>> restaurantIdToMenuItemIds = getRestaurantIdToMenuItemIds(userId);
        if (!restaurantIdToMenuItemIds.containsKey(restaurantId)) {
            throw new FoodDeliveryException("Cart is empty for this restaurant");
        }
        return restaurantIdToMenuItemIds.get(restaurantId);
    }

    public Map<String, List<String>> getRestaurantIdToMenuItemIds(final String userId) {
        return userToRestaurantIdToMenuItemIds.getOrDefault(userId, new HashMap<>());
    }

    public Map<String, Map<String, List<String>>> getUserToRestaurantIdToMenuItemIds() {
        return userToRestaurantIdToMenuItemIds;
    }
}
