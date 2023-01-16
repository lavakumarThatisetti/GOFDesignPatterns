package behavioral.chainofresponsibility.atmexample;

public class Dollar2000Dispenser extends DollarDispenser {

    public Dollar2000Dispenser(DollarDispenser dollarDispenser) {
        super(dollarDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=2000){
            int num = cur.getAmount()/2000;
            int remainder = cur.getAmount() % 2000;
            System.out.println("Dispensing "+num+" 2000$ note");
            if(remainder !=0) dollarDispenser.dispense(new Currency(remainder));
        }
    }
}
