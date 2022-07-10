package structural.decorator;

public class Driver {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car.assemble();
        System.out.println();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        System.out.println();

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
