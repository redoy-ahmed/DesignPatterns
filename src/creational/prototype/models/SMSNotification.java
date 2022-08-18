package creational.prototype.models;

import creational.prototype.Notification;

public class SMSNotification extends Notification {

    public SMSNotification(String sendTo) {
        this.sendTo = sendTo;
        apiName = "SMS";
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification: " + printData());
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
