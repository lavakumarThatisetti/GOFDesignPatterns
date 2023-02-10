package behavioral.visitor;

public class AreaVisitor implements ShapeVisitor {
    private double area;

    // Pi*r2
    @Override
    public void visit(final Circle circle) {
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    // 2*l
    @Override
    public void visit(final Square square) {
        area = 2 * square.getLength();
    }

    // l*b
    @Override
    public void visit(final Rectangle rectangle) {
        area = rectangle.getLength() * rectangle.getWidth();
    }

    public double get() {
        return this.area;
    }
}
