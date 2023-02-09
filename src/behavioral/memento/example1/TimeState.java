package behavioral.memento.example1;

// Memento - which is a special object that contains the state of the Originator.
public class TimeState {
    private final String lastTimeSaved;

    public TimeState(String timeToSave)
    {
        lastTimeSaved = timeToSave;
    }

    public String getSavedTime()
    {
        return lastTimeSaved;
    }
}
