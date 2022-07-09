package creational.singleton;

/*
until we need an instance, the LazyHolder class will not be initialized until required,
and you can still use other static members of BillPughSingleton class
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }
    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
