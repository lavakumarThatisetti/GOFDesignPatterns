package creational.abstractfactory;

import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.bank.BankType;
import creational.abstractfactory.bank.HDFC;
import creational.abstractfactory.bank.ICICI;
import creational.abstractfactory.bank.SBI;
import creational.abstractfactory.exception.ObjectCreationException;

public class BankFactory implements AbstractFactory<Bank, BankType> {

    @Override
    public Bank create(BankType type) {
        switch (type){
            case SBI: return new SBI();
            case HDFC: return new HDFC();
            case ICICI: return new ICICI();
            default: throw new ObjectCreationException(type.toString());
        }
    }
}
