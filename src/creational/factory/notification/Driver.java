package creational.factory.notification;

public class Driver {

    public static void main(String[] args) {

        NotificationAttributes attributes = new NotificationAttributes(
                "9890098900","878787013","Your Mobile OTP : 35654 valid for 10 minus"
        );

        Notification notification = NotificationFactory.getInstance(NotificationType.SMS);

        notification.sendNotification(attributes);


    }
}
