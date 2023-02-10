package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Square(10));
        shapes.add(new Rectangle(10, 2));

        final AreaVisitor areaVisitor = new AreaVisitor();
        final PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        for (Shape shape: shapes) {
            shape.accept(areaVisitor);
            final double area = areaVisitor.get();

            System.out.printf(
                    "Area of %s: %.2f%n",
                    shape.getClass().getSimpleName(),
                    area
            );
        }

        System.out.println("---------------------------------");

        for (Shape shape: shapes) {
            shape.accept(perimeterVisitor);
            final double perimeter = perimeterVisitor.get();

            System.out.printf(
                    "Perimeter of %s: %.2f%n",
                    shape.getClass().getSimpleName(),
                    perimeter
            );
        }
    }
}
