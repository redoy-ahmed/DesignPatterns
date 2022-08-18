package creational.abstractFactory.factoryProvider;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.factory.AndroidMobileFactory;
import creational.abstractFactory.factory.AppleMobileFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isApple) {
        if (isApple) {
            return new AppleMobileFactory();
        } else {
            return new AndroidMobileFactory();
        }
    }
}