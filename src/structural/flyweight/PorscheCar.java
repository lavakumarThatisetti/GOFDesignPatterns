package structural.flyweight;

public class PorscheCar extends Car{
    public static int numOfInstances = 0;
    public PorscheCar(String name, int speed, int horsePower) {
        super(name, speed, horsePower);
        numOfInstances++;
    }

    @Override
    void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("Current location of "+this.name+" is X"+currentX + " - Y"+currentY);
        System.out.println("New location of "+this.name+" is X"+newX + " - Y"+newY);
    }
}
