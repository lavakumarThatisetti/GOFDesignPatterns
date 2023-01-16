package behavioral.chainofresponsibility.atmexample;

public class Dollar100Dispenser extends DollarDispenser {

    public Dollar100Dispenser(DollarDispenser dollarDispenser) {
        super(dollarDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=100){
            int num = cur.getAmount()/100;
            int remainder = cur.getAmount() % 100;
            System.out.println("Dispensing "+num+" 100$ note");
            if(remainder !=0) dollarDispenser.dispense(new Currency(remainder));
        }
    }
}
