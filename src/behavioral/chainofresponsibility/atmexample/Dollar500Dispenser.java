package behavioral.chainofresponsibility.atmexample;

public class Dollar500Dispenser extends DollarDispenser {

    public Dollar500Dispenser(DollarDispenser dollarDispenser) {
        super(dollarDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=500){
            int num = cur.getAmount()/500;
            int remainder = cur.getAmount() % 500;
            System.out.println("Dispensing "+num+" 500$ note");
            if(remainder !=0) dollarDispenser.dispense(new Currency(remainder));
        }
    }
}
