package creational.abstractFactory;

import creational.abstractFactory.factoryProvider.FactoryProducer;
import creational.abstractFactory.interfaces.Mobile;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory mobileFactory1 = FactoryProducer.getFactory(false);
        Mobile onePlus = mobileFactory1.getMobile("OnePlus");
        onePlus.brandName();

        Mobile sony = mobileFactory1.getMobile("Sony");
        sony.brandName();

        AbstractFactory mobileFactory2 = FactoryProducer.getFactory(true);
        Mobile iphone = mobileFactory2.getMobile("iphone");
        iphone.brandName();
    }
}