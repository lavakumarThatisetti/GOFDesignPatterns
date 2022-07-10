package structural.proxy.protection;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connected to "+serverHost);
    }
}
