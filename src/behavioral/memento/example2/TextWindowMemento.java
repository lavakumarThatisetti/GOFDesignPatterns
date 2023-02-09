package behavioral.memento.example2;

// Memento
public class TextWindowMemento {
    private final String state;

    public TextWindowMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
