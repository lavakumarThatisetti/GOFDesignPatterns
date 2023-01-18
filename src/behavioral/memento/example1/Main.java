package behavioral.memento.example1;

public class Main {
    public static void main(String[] args) {

        AccessTime accessTime = new AccessTime();

        Checkpoint checkpoint = new Checkpoint(accessTime);

        accessTime.setTime("11AM");

        checkpoint.saveCheckpoint();

        accessTime.setTime("12PM");

        System.out.println(accessTime.getTime());

        checkpoint.rollbackToLastCheckPoint();

        System.out.println(accessTime.getTime());
    }
}
