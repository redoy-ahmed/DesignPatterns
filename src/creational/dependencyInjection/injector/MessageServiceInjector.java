package creational.dependencyInjection.injector;

import creational.dependencyInjection.Consumer;

public interface MessageServiceInjector {
	Consumer getConsumer();
}