package behavioral.visitor;

public class AreaVisitor implements ShapeVisitor {
    private double area;

    @Override
    public void visit(final Circle circle) {
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(final Square square) {
        area = 2 * square.getLength();
    }

    @Override
    public void visit(final Rectangle rectangle) {
        area = rectangle.getLength() * rectangle.getWidth();
    }

    public double get() {
        return this.area;
    }
}
