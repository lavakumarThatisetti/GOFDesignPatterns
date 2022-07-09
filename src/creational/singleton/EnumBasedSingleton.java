package creational.singleton;
/*
Enum provide implicit support for thread safety and only one instance is guaranteed
 */
public enum EnumBasedSingleton {
    INSTANCE;
    public void someMethod(String param) {
        // some class member
    }

}
