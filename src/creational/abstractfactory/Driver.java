package creational.abstractfactory;

import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.bank.BankType;
import creational.abstractfactory.loan.Loan;
import creational.abstractfactory.loan.LoanType;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory<Bank, BankType> bankTypeAbstractFactory = FactoryProvider.getFactory(ObjectType.BANK);
        Bank bank = bankTypeAbstractFactory.create(BankType.HDFC);
        System.out.println(bank.getBankName());

        AbstractFactory<Loan, LoanType> loanTypeAbstractFactory = FactoryProvider.getFactory(ObjectType.LOAN);
        Loan loan = loanTypeAbstractFactory.create(LoanType.PERSONAL);
        System.out.println(loan.getInterestRate());
        
    }
}
