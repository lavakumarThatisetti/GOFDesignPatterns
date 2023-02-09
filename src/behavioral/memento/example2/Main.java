package behavioral.memento.example2;

public class Main {
    public static void main(String[] args) {
        // Originator
        TextWindow textWindow = new TextWindow();

        // Care taker
        TextEditor textEditor = new TextEditor(textWindow);

        textWindow.setState("Welcome to My Channel");

        textEditor.hitSave();

        textWindow.setState(" Please Subscribe");

        System.out.println(textWindow.getState()+" ");

        textEditor.hitUndo();

        System.out.println(textWindow.getState());
    }
}
