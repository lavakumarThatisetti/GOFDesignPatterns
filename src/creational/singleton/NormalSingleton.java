package creational.singleton;

public class NormalSingleton {
    private static NormalSingleton obj;
    private NormalSingleton() {}

    // It will not guarantee single instance created
    public static NormalSingleton getInstance()
    {
        if (obj==null)
            obj = new NormalSingleton();
        return obj;
    }

    /* using synchronized every time while creating the singleton
    object is expensive and may decrease the performance of your program */
    // public static synchronized NormalSingleton getInstance()
    // {
    //     if (obj==null)
    //         obj = new NormalSingleton();
    //     return obj;
    // }
}
