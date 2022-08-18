package creational.singleton.models;
import creational.Notification;

public class SMSNotification implements Notification {

    //region Eager Initialization

    private static SMSNotification smsNotification = new SMSNotification();

    private SMSNotification() {

    }

    //endregion

    //region Lazy Initialization

    /*private static SMSNotification smsNotification;

    private SMSNotification() {

    }*/

    //endregion

    public static SMSNotification getInstance() {
        if (smsNotification == null)
            return smsNotification = new SMSNotification();
        else
            return smsNotification;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
