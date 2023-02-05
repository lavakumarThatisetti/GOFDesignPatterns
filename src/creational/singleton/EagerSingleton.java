package creational.singleton;

/*
This technique is used where an instance of a class is created much before it is actually required.
Mostly it is done on system start up.
In singleton pattern, it refers to create the singleton instance irrespective of whether any other class actually
asked for its instance or not
Drawback:
Instance is created irrespective of it is required in runtime or not.
If this instance is not big object, and you can live with it being unused, this is best approach.
 */
public class EagerSingleton {
    private static final EagerSingleton obj = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance()
    {
        return obj;
    }
}
