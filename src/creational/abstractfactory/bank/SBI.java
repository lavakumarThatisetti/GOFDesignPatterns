package creational.abstractfactory.bank;

public class SBI implements Bank{

    String name;

    public SBI(){
        this.name = "SBI";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
