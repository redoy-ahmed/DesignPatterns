package creational.abstractFactory.factory;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.interfaces.Mobile;
import creational.abstractFactory.models.OnePlus;
import creational.abstractFactory.models.Sony;

public class AndroidMobileFactory extends AbstractFactory {
    @Override
    public Mobile getMobile(String brand) {
        if (brand.equalsIgnoreCase("OnePlus")) {
            return new OnePlus();
        } else if (brand.equalsIgnoreCase("Sony")) {
            return new Sony();
        }
        return null;
    }
}