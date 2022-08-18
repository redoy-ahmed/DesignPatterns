package creational.abstractFactory;

import creational.abstractFactory.interfaces.Mobile;

public abstract class AbstractFactory {
    public abstract Mobile getMobile(String model);
}