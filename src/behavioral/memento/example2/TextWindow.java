package behavioral.memento.example2;

// Originator
public class TextWindow {
    private StringBuilder state;

    public TextWindow() {
        this.state = new StringBuilder();
    }

    public void setState(String text) {
        state.append(text);
    }

    public TextWindowMemento saveStateToMemento() {
        return new TextWindowMemento(state.toString());
    }

    public void restoreStateFromMemento(TextWindowMemento save) {
        state = new StringBuilder(save.getState());
    }

    public StringBuilder getState() {
        return state;
    }
}
