package behavioral.visitor;

// Object - element
public interface Shape {
    void accept(ShapeVisitor visitor);
}
