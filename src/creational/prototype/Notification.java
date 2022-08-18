package creational.prototype;

public abstract class Notification implements Cloneable {

    protected String title = "This is Title";
    protected String message = "This is Message";
    protected String baseURL= "http://172.22.22.100/";
    protected String apiName;
    protected String sendTo;

    public abstract void sendNotification();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
