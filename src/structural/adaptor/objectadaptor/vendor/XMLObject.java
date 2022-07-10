package structural.adaptor.objectadaptor.vendor;

public class XMLObject {
    private String requestId;
    private String metadata;

    public XMLObject(String requestId, String metadata) {
        this.requestId = requestId;
        this.metadata = metadata;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getMetadata() {
        return metadata;
    }
}
