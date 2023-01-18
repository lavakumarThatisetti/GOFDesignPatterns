package behavioral.memento.example2;

public class TextEditor {

    private final TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    // Care Takers (As the Caretaker, it will hold the state of the Originator and ask to restore it when needed)

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

}
