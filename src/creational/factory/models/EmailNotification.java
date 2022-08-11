package creational.factory.models;

import creational.common.interfaces.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
