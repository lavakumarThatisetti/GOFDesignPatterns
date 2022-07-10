package structural.flyweight;

public abstract class Car {
    /*Intrinsic state  stored and shared in the Flyweight object*/
    String name;
    int speed;
    int horsePower;

    public Car(String name, int speed, int horsePower) {
        this.name = name;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    /* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    abstract void moveCar(int currentX, int currentY, int newX ,int newY);


}
