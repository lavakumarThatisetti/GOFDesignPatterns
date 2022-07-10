package structural.adaptor.objectadaptor;

import structural.adaptor.objectadaptor.client.ClientInterface;
import structural.adaptor.objectadaptor.client.JSONObject;
import structural.adaptor.objectadaptor.vendor.XMLVendor;
import structural.adaptor.objectadaptor.vendor.XMLObject;

// Adaptor Has Adaptee ( Incompatible with client Interface )
public class Adaptor  implements ClientInterface {

    XMLVendor vendor;

    public Adaptor(XMLVendor vendor){
        this.vendor = vendor;
    }

    @Override
    public String serveRequest(JSONObject request) {
        // Convert JSONObject to XMLObject ( vendor accepts)
        XMLObject xmlObject = new XMLObject(request.getRequestId(), request.getMetadata());
        System.out.println("Vendor call made");
        return vendor.serveRequest(xmlObject);
    }
}
