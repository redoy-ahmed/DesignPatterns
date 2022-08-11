package creational.dependencyInjection.injector;

import creational.dependencyInjection.Consumer;
import creational.dependencyInjection.EmailServiceImpl;
import creational.dependencyInjection.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}