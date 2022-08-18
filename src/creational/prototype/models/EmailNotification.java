package creational.prototype.models;

import creational.prototype.Notification;

public class EmailNotification extends Notification {

    public EmailNotification(String sendTo) {
        this.sendTo = sendTo;
        apiName = "Email";
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification: " + printData());
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
