package structural.flyweight;

import structural.flyweight.exception.ObjectCreationException;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<CarType, Car> flyweights = new HashMap<>();

    public static Car getRaceCar(CarType type) {
        if(flyweights.containsKey(type)){
            return flyweights.get(type);
        }
        Car car;
        switch (type){
            case McLearn: car = new McLearnCar("McLearn", 150,1000);
                          flyweights.put(type,car);
                          break;
            case PORSCHE: car = new PorscheCar("PORSCHE", 250,1500);
                          flyweights.put(type,car);
                          break;
            default: throw new ObjectCreationException("Object Creation Failed");
        }
        return car;
    }
}
