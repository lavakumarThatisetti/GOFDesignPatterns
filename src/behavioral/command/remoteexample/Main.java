package behavioral.command.remoteexample;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();


        remoteControl.setCommand(0,new LightOnCommand(new Light()),SlotType.ON);
        remoteControl.setCommand(0,new LightOffCommand(new Light()),SlotType.OFF);
        remoteControl.setCommand(1, new GarageDoorOpenCommand(new Garage()), SlotType.ON);
        remoteControl.setCommand(1, new GarageDoorClosedCommand(new Garage()), SlotType.OFF);


        remoteControl.buttonPressed(0, SlotType.ON);
        remoteControl.buttonPressed(1, SlotType.ON);

        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);
    }
}
