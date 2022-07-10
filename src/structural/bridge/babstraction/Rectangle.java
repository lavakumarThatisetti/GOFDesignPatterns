package structural.bridge.babstraction;

import structural.bridge.binterface.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Rectangle Painted: "+color.getColor());
    }
}
