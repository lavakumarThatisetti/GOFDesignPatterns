package behavioral.command.cartexample.pattern;

import behavioral.command.cartexample.data.CartData;
import behavioral.command.cartexample.FoodMenuService;
import behavioral.command.cartexample.model.FoodMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AddCartCommandExecutor extends CartCommandExecutor {
    private FoodMenuService foodMenuService;
    private CartData cartData;
    
    public AddCartCommandExecutor(FoodMenuService foodMenuService, CartData cartData) {
        this.foodMenuService = foodMenuService;
        this.cartData = cartData;
    }

    @Override
    public boolean isValid(final String userId, final String restaurantId, final String itemId) {
        FoodMenu foodMenu = foodMenuService.getMenuByRestaurantId(restaurantId);
        return foodMenu.getMenuItemList().stream()
                .anyMatch(menuItem -> menuItem.getId().equals(itemId));
    }

    @Override
    public void executeCommand(final String userId, final String restaurantId, final String itemId) {
        Map<String, List<String>> restaurantIdToMenuItemIds =
                cartData.getUserToRestaurantIdToMenuItemIds().getOrDefault(userId, new HashMap<>());
        List<String> menuItemIds = restaurantIdToMenuItemIds.getOrDefault(restaurantId, new ArrayList<>());
        menuItemIds.add(itemId);
        restaurantIdToMenuItemIds.put(restaurantId, menuItemIds);
        cartData.getUserToRestaurantIdToMenuItemIds().put(userId, restaurantIdToMenuItemIds);
    }

    @Override
    public boolean isApplicable(CartCommandType cartCommandType) {
        return cartCommandType == CartCommandType.ADD_ITEM;
    }
}
