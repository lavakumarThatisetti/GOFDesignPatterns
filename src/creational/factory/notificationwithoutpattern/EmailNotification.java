package creational.factory.notificationwithoutpattern;

public class EmailNotification implements Notification {
    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        System.out.println("Email Send Successfully to :"+notificationAttributes.getTo());
        return true;
    }
}
