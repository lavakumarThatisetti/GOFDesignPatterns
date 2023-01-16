package behavioral.command.cartexample.model;


public class MenuItem {
    private String id;
    private String itemName;
    private MealType mealType;
    private double price;

    public String getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public MealType getMealType() {
        return mealType;
    }

    public double getPrice() {
        return price;
    }
}
