package behavioral.memento.example1;

// Caretaker - responsible for saving and restoring the state of the Originator.
public class Checkpoint {
    AccessTime accessTime;
    TimeState timeState;

    public Checkpoint(AccessTime accessTime){
        this.accessTime = accessTime;
    }

    // Care Takers
    public void saveCheckpoint() {
        timeState = accessTime.save();
    }

    public void rollbackToLastCheckPoint() {
        accessTime.restore(timeState);
    }
}
