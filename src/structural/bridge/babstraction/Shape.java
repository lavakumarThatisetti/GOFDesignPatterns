package structural.bridge.babstraction;

import structural.bridge.binterface.Color;

public abstract class Shape {

    Color color;
    public Shape(Color color){
        this.color = color;
    }

    public abstract void paint();

}
