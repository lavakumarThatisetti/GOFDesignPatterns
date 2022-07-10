package structural.bridge.babstraction;

import structural.bridge.binterface.Color;

public class Circle  extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Circle Painted: "+color.getColor());
    }
}
