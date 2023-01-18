package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.setState(new OrderedState());
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
    }
}
