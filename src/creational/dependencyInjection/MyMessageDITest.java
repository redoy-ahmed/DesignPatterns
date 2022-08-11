package creational.dependencyInjection;

import creational.dependencyInjection.injector.EmailServiceInjector;
import creational.dependencyInjection.injector.MessageServiceInjector;
import creational.dependencyInjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Redoy";
		String email = "redoy@gmail.com";
		String phone = "01515607169";
		MessageServiceInjector injector;
		Consumer app;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}