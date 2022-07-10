package structural.proxy.protection;

public class Driver {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet(new RealInternet());

        try {
            internet.connectTo("google.com");
            internet.connectTo("xyz.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
