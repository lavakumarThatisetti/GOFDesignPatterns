package behavioral.command.remoteexample;

public class RemoteControl {
    Command[] onSlots;
    Command[] offSlots;
    public RemoteControl(){
        onSlots = new Command[2];
        offSlots = new Command[2];
    }

    public void setCommand(int slot, Command command, SlotType slotType){
        if(slotType.equals(SlotType.ON))this.onSlots[slot] = command;
        else if(slotType.equals(SlotType.OFF)) this.offSlots[slot] = command;
    }
    public void buttonPressed(int slot, SlotType slotType){
        if(slotType.equals(SlotType.ON))this.onSlots[slot].execute();
        else if(slotType.equals(SlotType.OFF)) this.offSlots[slot].execute();
    }

    public void onButtonPressed(int slot){
        this.onSlots[slot].execute();
    }

    public void offButtonPressed(int slot){
        this.offSlots[slot].execute();
    }

}
