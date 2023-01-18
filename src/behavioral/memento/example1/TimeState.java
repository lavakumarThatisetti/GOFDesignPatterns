package behavioral.memento.example1;

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
