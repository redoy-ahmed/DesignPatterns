package creational.singleton;

import creational.singleton.service.NotificationProvider;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        NotificationProvider.sendPushNotification();
    }
}
