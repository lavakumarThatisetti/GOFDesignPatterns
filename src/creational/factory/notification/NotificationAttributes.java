package creational.factory.notification;

public class NotificationAttributes {
    private final String from;
    private final String to;
    private final String message;
    // Can add extra Fields all comes under Metadata

    public NotificationAttributes(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }
}
