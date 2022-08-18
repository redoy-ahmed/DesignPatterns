package creational.prototype.models;

import creational.prototype.Notification;

public class PushNotification extends Notification {

    public PushNotification(String sendTo) {
        this.sendTo = sendTo;
        apiName = "Push";
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification: " + printData());
    }

    public String printData() {
        return " sendTo='" + sendTo + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", baseURL='" + baseURL + '\'' +
                ", apiName='" + apiName + '\'' +
                '}';
    }
}
