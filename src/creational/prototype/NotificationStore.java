package creational.prototype;

import creational.prototype.models.EmailNotification;
import creational.prototype.models.PushNotification;
import creational.prototype.models.SMSNotification;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class NotificationStore {

    private static final Map<String, Notification> notificationMap = new HashMap<>();

    static {
        notificationMap.put("sms", new SMSNotification("01515607169"));
        notificationMap.put("email", new EmailNotification("redoy@gmail.com"));
        notificationMap.put("push", new PushNotification("aa12gg"));
    }

    public static Notification getNotification(String notificationType, String sendTo) {
        Notification notification = (Notification) notificationMap.get(notificationType).clone();
        notification.sendTo = sendTo;

        return notification;
    }
}