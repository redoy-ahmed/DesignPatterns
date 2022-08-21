package creational.singleton.models;
import creational.Notification;

public class PushNotification implements Notification {

    //region Eager Initialization
/*
    private static PushNotification pushNotification = new PushNotification();

    private PushNotification() {

    }

    public static PushNotification getInstance() {
        return pushNotification;
    }*/

    //endregion

    //region Lazy Initialization
    private static PushNotification pushNotification;

    private PushNotification() {

    }

    public static PushNotification getInstance() {
        if (pushNotification == null) {
            synchronized (PushNotification.class) {
                return pushNotification = new PushNotification();
            }
        }

        return pushNotification;
    }

    //endregion

    @Override
    public void notifyUser() {
        System.out.println("Sending an push notification");
    }
}
