package structural.bridge.babstraction;

import structural.bridge.binterface.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Triangle Painted: "+color.getColor());
    }
}
