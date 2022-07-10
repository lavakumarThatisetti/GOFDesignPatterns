package structural.adaptor.objectadaptor.client;

public class JSONObject {
    private String requestId;
    private String metadata;

    public JSONObject(String requestId, String metadata) {
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
