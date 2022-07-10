package structural.decorator;

public class CarDecorator implements Car {
    // Composition Over Inheritance

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
