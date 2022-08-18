package creational.abstractFactory.models;

import creational.abstractFactory.interfaces.Mobile;

public class Iphone implements Mobile {

    @Override
    public void brandName() {
        System.out.println("Iphone");
    }
}