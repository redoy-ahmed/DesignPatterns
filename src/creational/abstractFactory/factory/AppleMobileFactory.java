package creational.abstractFactory.factory;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.models.Iphone;
import creational.abstractFactory.interfaces.Mobile;

public class AppleMobileFactory extends AbstractFactory {
    @Override
    public Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("iphone")) {
            return new Iphone();
        }
        return null;
    }
}