package behavioral.command.cartexample.pattern;


import behavioral.command.cartexample.data.CartData;

import java.util.List;


public class RemoveCartCommandExecutor extends CartCommandExecutor {
    private CartData cartData;

    public RemoveCartCommandExecutor(CartData cartData) {
        this.cartData = cartData;
    }

    @Override
    public boolean isValid(final String userId, final String restaurantId, final String itemId) {
        return cartData.getMenuItemIds(userId, restaurantId).contains(itemId);
    }

    @Override
    public void executeCommand(final String userId, final String restaurantId, final String itemId) {
        List<String> menuItemIds = cartData.getMenuItemIds(userId, restaurantId);
        menuItemIds.remove(itemId);
    }

    @Override
    public boolean isApplicable(CartCommandType cartCommandType) {
        return cartCommandType == CartCommandType.REMOVE_ITEM;
    }
}
