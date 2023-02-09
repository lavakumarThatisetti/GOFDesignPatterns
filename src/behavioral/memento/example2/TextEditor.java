package behavioral.memento.example2;

// Caretaker
public class TextEditor {


    private TextWindow textWindow;
    private TextWindowMemento savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    // Care Takers (As the Caretaker, it will hold the state of the Originator and ask to restore it when needed)

    public void hitSave() {
        savedTextWindow  = textWindow.saveStateToMemento();
    }

    public void hitUndo() {
        textWindow.restoreStateFromMemento(savedTextWindow);
    }

}
