package creational.builder.withoutpriorityfields;

/*
   Fields
   ------
   - noOfSeats
   - color
   - enginePower
 */
public class Car {
    private final Integer noOfSeats;
    private final String enginePower;
    private final String color;

    public Car(CarBuilder carBuilder) {
        this.noOfSeats = carBuilder.noOfSeats;
        this.enginePower = carBuilder.enginePower;
        this.color = carBuilder.color;
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

    public static class CarBuilder {
        private Integer noOfSeats;
        private String enginePower;
        private String color;

        public CarBuilder setNoOfSeats(Integer noOfSeats){
            this.noOfSeats = noOfSeats;
            return this;
        }
        public CarBuilder setEnginePower(String enginePower){
            this.enginePower = enginePower;
            return this;
        }
        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public Car build(){
            return new Car(this);
        }

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
