package behavioral.command.cartexample;

import behavioral.command.cartexample.data.CartData;
import behavioral.command.cartexample.data.FoodMenuData;
import behavioral.command.cartexample.pattern.AddCartCommandExecutor;
import behavioral.command.cartexample.pattern.CartCommandExecutor;
import behavioral.command.cartexample.pattern.CartCommandType;
import behavioral.command.cartexample.pattern.RemoveCartCommandExecutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        CartData cartData = new CartData();
        FoodMenuService foodMenuService = new FoodMenuService(new FoodMenuData());

        List<CartCommandExecutor> cartCommandExecutorList =  Arrays.asList(new AddCartCommandExecutor(foodMenuService, cartData),
                new RemoveCartCommandExecutor(cartData));

        CartCommandType cartCommandType = CartCommandType.ADD_ITEM;
        for (CartCommandExecutor cartCommandExecutor : cartCommandExecutorList) {

            if (cartCommandExecutor.isApplicable(cartCommandType)) {
                cartCommandExecutor.execute("lava", "Bawaachi", "Biryani");
            }

            if (cartCommandExecutor.isApplicable(CartCommandType.REMOVE_ITEM)) {
                cartCommandExecutor.execute("lava", "Bawaachi", "Biryani");
            }
        }
    }
}
