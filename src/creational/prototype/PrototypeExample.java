package creational.prototype;

class PrototypeExample {

    public static void main(String[] args) {
        Notification smsNotification = NotificationStore.getNotification("sms", "01515607169");
        smsNotification.sendNotification();

        Notification emailNotification = NotificationStore.getNotification("email", "redoy@gmail.com");
        emailNotification.sendNotification();

        Notification smsNotificationClone = NotificationStore.getNotification("sms", "0171711111");
        smsNotificationClone.sendNotification();
    }
}