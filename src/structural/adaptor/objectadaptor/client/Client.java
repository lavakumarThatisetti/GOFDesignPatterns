package structural.adaptor.objectadaptor.client;

public class Client {

    ClientInterface clientInterface;

    public Client(ClientInterface clientInterface){
        this.clientInterface = clientInterface;
    }

    public String apiCallToVendor(){
        JSONObject jsonObject = new JSONObject("123","MetaData");
        String s = clientInterface.serveRequest(jsonObject);
        return s;
    }
}
