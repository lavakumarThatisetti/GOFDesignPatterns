package creational.builder.withpriorityfields;

public class CarBuilder implements Color, EnginePower, SeatCapacity {
    private Integer noOfSeats;
    private String enginePower;
    private String color;

    public static SeatCapacity getInstance(){
        return new CarBuilder();
    }

    @Override
    public EnginePower seatCapacity(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
        return this;
    }

    @Override
    public Color enginePower(String enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(this.noOfSeats, this.enginePower, this.color);
    }
}

