package behavioral.memento.example1;

// Originator
public class AccessTime {
    private String time;

    public void setTime(String time) {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    // Originators : methods to create and consume the Memento object, making the AccessTime our Originator
    public TimeState save() {
        System.out.println("Saving time to Memento");
        return new TimeState(time);
    }

    public void restore(TimeState timeState) {
        time = timeState.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
    }

    public String getTime(){
        return time;
    }
}
