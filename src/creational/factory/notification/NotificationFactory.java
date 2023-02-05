package creational.factory.notification;

import java.util.HashMap;

public class NotificationFactory {

    private static final HashMap<NotificationType, Notification> factoryMap = new HashMap<>();

    static {
        // Will Take More about Creating Objects While we talk about Singleton Pattern
        factoryMap.put(NotificationType.APP, new PushNotification());
        factoryMap.put(NotificationType.EMAIL, new EmailNotification());
        factoryMap.put(NotificationType.SMS, new SMSNotification());
    }

    public static Notification getInstance(NotificationType notificationType){

        return factoryMap.get(notificationType);
    }
}
