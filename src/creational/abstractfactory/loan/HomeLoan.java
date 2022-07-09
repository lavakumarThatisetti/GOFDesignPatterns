package creational.abstractfactory.loan;

public class HomeLoan implements Loan{

    private static final double interestRate = 7.5;

    @Override
    public double getInterestRate() {
        System.out.println("Home Loan");
        return interestRate;
    }
}
