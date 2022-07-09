package creational.factory.notification;

public class SMSNotification implements Notification {
    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        System.out.println("SMS Send Successfully to - "+notificationAttributes.getTo());
        return true;
    }
}
