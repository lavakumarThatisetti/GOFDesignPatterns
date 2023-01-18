package behavioral.memento.example2;

public class Main {
    public static void main(String[] args) {
        TextWindow textWindow = new TextWindow();

        TextEditor textEditor = new TextEditor(textWindow);

        textWindow.addText("Welcome to My Channel");

        //TextWindowState textWindowState = textWindow.save();

        textEditor.hitSave();

        textWindow.addText(" Please Subscribe");

        System.out.println(textWindow.getCurrentText());

        textEditor.hitUndo();

        System.out.println(textWindow.getCurrentText());



    }
}
