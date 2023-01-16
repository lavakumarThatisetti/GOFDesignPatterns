package behavioral.chainofresponsibility.atmexample;

public class ValidateDollarDispenser extends DollarDispenser{

    public ValidateDollarDispenser(DollarDispenser dollarDispenser) {
        super(dollarDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()%100==0){
            dollarDispenser.dispense(cur);
        } else {
            System.out.println("Please Enter Amount in 2000,500,100 denominations");
        }
    }
}
