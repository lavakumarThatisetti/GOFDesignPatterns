package behavioral.command.remoteexample;

public class GarageDoorClosedCommand implements Command {

    Garage garage;

    public GarageDoorClosedCommand(Garage garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.closed();
    }
}
