package behavioral.chainofresponsibility.atmexample;

public class Main {
    public static void main(String[] args) {
        DollarDispenser dollarDispenser = new ValidateDollarDispenser(
                new Dollar2000Dispenser(new Dollar500Dispenser(new Dollar100Dispenser(null)))
        );

        dollarDispenser.dispense(new Currency(5600));

        dollarDispenser.dispense(new Currency(5620));
    }
}
