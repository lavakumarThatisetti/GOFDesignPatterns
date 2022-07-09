package creational.singleton;


public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;

    private DoubleLockSingleton() {

    }

    /*
    When two threads T1 and T2 comes to create instance and execute ?instance==null?,
    both threads have identified instance variable to null thus assume they must create an instance.
    They sequentially go to synchronized block and create the instances.
    At the end, we have two instances in our application.
     */
    public static DoubleLockSingleton getInstanceSingleCheck() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                instance = new DoubleLockSingleton();
            }
        }
        return instance;
    }

    /* The above Issue can be resolved by Double Lock */
    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

//    @Override
//    public int hashCode() {
//        return unique;
//    }
}
