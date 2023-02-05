package creational.builder.withpriorityfields;

/*
   Fields
   ------
   - noOfSeats
   - color
   - enginePower

   Without Setting color We cannot set Engine Power
   Without Setting Engine Power We cannot Set No Of Seats
   Hierarchy set No Of Seats - Engine Power - Color

   Hierarchy set No Of Seats (Engine Power)  - Engine Power ( Color)  - Color (Car Builder)

   Program to Interfaces
 */

public class Car {
    private final Integer noOfSeats;
    private final String enginePower;
    private final String color;

    public Car(Integer noOfSeats, String enginePower, String color) {
        this.noOfSeats = noOfSeats;
        this.enginePower = enginePower;
        this.color = color;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public String getColor() {
        return color;
    }




    @Override
    public String toString() {
        return "Car{" +
                "noOfSeats=" + noOfSeats +
                ", enginePower='" + enginePower + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
