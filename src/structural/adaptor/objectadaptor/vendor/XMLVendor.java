package structural.adaptor.objectadaptor.vendor;

public class XMLVendor {

    public String serveRequest(XMLObject xmlObject){
        return (xmlObject.getRequestId() + " " + xmlObject.getMetadata() + " Success");
    }
}
