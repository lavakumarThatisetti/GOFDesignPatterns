package creational.abstractfactory;


import creational.abstractfactory.exception.ObjectCreationException;
import creational.abstractfactory.loan.EducationalLoan;
import creational.abstractfactory.loan.HomeLoan;
import creational.abstractfactory.loan.Loan;
import creational.abstractfactory.loan.LoanType;
import creational.abstractfactory.loan.PersonalLoan;

public class LoanFactory implements AbstractFactory<Loan, LoanType>{
    @Override
    public Loan create(LoanType type) {
        switch (type){
            case PERSONAL: return new PersonalLoan();
            case HOME: return new HomeLoan();
            case EDUCATIONAL: return new EducationalLoan();
            default: throw new ObjectCreationException(type.toString());
        }
    }
}
