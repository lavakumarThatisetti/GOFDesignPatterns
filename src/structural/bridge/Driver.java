package structural.bridge;


import structural.bridge.babstraction.Circle;
import structural.bridge.babstraction.Rectangle;
import structural.bridge.babstraction.Shape;
import structural.bridge.babstraction.Triangle;
import structural.bridge.binterface.BlackColor;
import structural.bridge.binterface.RedColor;
import structural.bridge.binterface.WhiteColor;

public class Driver {
    public static void main(String[] args) {
        // Shape has Color -> according to bridge Definition
        Shape rectangleShape = new Rectangle(new BlackColor());
        rectangleShape.paint();

        Shape circleShape = new Circle(new RedColor());
        circleShape.paint();

        Shape circleWhitShape = new Circle(new WhiteColor());
        circleWhitShape.paint();

        Shape triangleShape = new Triangle(new BlackColor());
        triangleShape.paint();
    }
}
