package creational.builder;

import creational.builder.withoutpriorityfields.Car;
import creational.builder.withpriorityfields.CarBuilder;

public class Driver {
    public static void main(String[] args) {

        // User Builder - With Mandatory and Optional Fields
        User user = new User.UserBuilder("LavaKumar","T").build();
        System.out.println(user);

        user = new User.UserBuilder("LavaKumar","T").setAge(24).setPhone("9890098900").build();
        System.out.println(user);

        // Car Builder -
        Car car = new Car.CarBuilder().setColor("Red").setEnginePower("200cc").setNoOfSeats(7).build();
        System.out.println(car);

        // Car Builder With Priority
        creational.builder.withpriorityfields.Car priorityCar =
                CarBuilder.getInstance().seatCapacity(10).enginePower("150cc").color("Red").build();

        System.out.println(priorityCar);
    }
}
