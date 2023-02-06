package structural.adaptor.objectadaptor;

import structural.adaptor.objectadaptor.client.Client;
import structural.adaptor.objectadaptor.vendor.XMLVendor;

public class Driver {
    public static void main(String[] args) {
        Client client = new Client(new Adaptor(new XMLVendor()));
        System.out.println(client.apiCallToVendor());
    }
}
