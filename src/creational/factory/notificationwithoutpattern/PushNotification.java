package creational.factory.notificationwithoutpattern;

public class PushNotification implements Notification {
    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        // Here From his Which Server is Sent and to is our device UDID
        System.out.println("App Notification Sent Successfully to :"+notificationAttributes.getTo());
        return true;
    }
}
