package behavioral.chainofresponsibility.atmexample;

public abstract class DollarDispenser {
    public DollarDispenser dollarDispenser;

    public DollarDispenser(DollarDispenser dollarDispenser) {
        this.dollarDispenser = dollarDispenser;
    }

    public abstract void dispense(Currency cur);
}
