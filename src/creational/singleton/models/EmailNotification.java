package creational.singleton.models;
import creational.Notification;

public class EmailNotification implements Notification {

    //region Eager Initialization

    private static EmailNotification emailNotification = new EmailNotification();

    private EmailNotification() {

    }

    //endregion

    //region Lazy Initialization

    /*private static EmailNotification emailNotification;

    private EmailNotification() {

    }*/

    //endregion

    public static EmailNotification getInstance() {
        if (emailNotification == null)
            return emailNotification = new EmailNotification();
        else
            return emailNotification;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
