package behavioral.visitor;

public class Square implements Shape {
    private final double length;

    public Square(final double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
