package creational.dependencyInjection.injector;

import creational.dependencyInjection.Consumer;
import creational.dependencyInjection.MyDIApplication;
import creational.dependencyInjection.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}