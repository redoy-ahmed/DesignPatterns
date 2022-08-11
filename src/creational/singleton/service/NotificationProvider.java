package creational.singleton.service;

import creational.singleton.models.EmailNotification;
import creational.singleton.models.PushNotification;
import creational.singleton.models.SMSNotification;

public class NotificationProvider {

    public static void sendPushNotification() {
        PushNotification pushNotification = PushNotification.getInstance();
        pushNotification.notifyUser();
    }

    public static void sendEmailNotification() {
        EmailNotification emailNotification = EmailNotification.getInstance();
        emailNotification.notifyUser();
    }

    public static void sendSMSNotification() {
        SMSNotification smsNotification = SMSNotification.getInstance();
        smsNotification.notifyUser();
    }
}
