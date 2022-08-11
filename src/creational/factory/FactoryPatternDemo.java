package creational.factory;

import creational.common.interfaces.Notification;
import creational.factory.factoryprovider.NotificationFactory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
