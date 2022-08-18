package creational.factory.models;

import creational.Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
