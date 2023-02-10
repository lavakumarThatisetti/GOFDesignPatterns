package behavioral.visitor;

public class PerimeterVisitor implements ShapeVisitor {
    private double perimeter;

    // 2*pi*r
    @Override
    public void visit(final Circle circle) {
        perimeter = 2 * Math.PI * circle.getRadius();
    }

    // 4*a
    @Override
    public void visit(final Square square) {
        perimeter = 4 * square.getLength();
    }

    // 2*(l+b)
    @Override
    public void visit(final Rectangle rectangle) {
        perimeter = 2 * (rectangle.getLength() + rectangle.getWidth());
    }

    public double get() {
        return this.perimeter;
    }
}

