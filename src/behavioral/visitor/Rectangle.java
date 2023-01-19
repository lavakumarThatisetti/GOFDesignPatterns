package behavioral.visitor;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(final double length, final double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
