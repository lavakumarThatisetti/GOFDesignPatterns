package structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Random random = new Random();
        List<CarType> carTypes = Arrays.asList(CarType.McLearn, CarType.McLearn, CarType.PORSCHE, CarType.PORSCHE);
        List<Car> cars = new ArrayList<>();
        for(CarType type:carTypes){
            cars.add(CarFactory.getRaceCar(type));
        }

        for(Car car:cars){
            int currentX = random.nextInt(100);
            int currentY = random.nextInt(100);
            int nextX = random.nextInt(100);
            int nextY = random.nextInt(100);
            car.moveCar(currentX,currentY,nextX,nextY);
        }
        System.out.println("Instances Created by McLearn Car "+McLearnCar.numOfInstances);
        System.out.println("Instances Created by Porsche Car "+PorscheCar.numOfInstances);
    }
}
