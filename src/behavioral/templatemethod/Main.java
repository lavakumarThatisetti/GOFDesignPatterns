package behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        PizzaMaker vegPizzaMaker = new VegPizzaMaker();
        vegPizzaMaker.makePizza();

        System.out.println("------------------------------");
        PizzaMaker nvPizzaMaker = new NonVegPizzaMaker();
        nvPizzaMaker.makePizza();

    }
}
