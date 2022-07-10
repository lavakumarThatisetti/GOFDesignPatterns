package structural.proxy.protection;

public class ProxyInternet implements Internet {

    Internet internet;
    public ProxyInternet(Internet internet){
        this.internet = internet;
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        // get properties
        if(Properties.bannedSites.contains(serverHost)){
            throw new Exception("Access Denied to "+serverHost);
        }
        internet.connectTo(serverHost);
    }
}
