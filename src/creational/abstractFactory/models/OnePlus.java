package creational.abstractFactory.models;

import creational.abstractFactory.interfaces.Mobile;

public class OnePlus implements Mobile {
    @Override
    public void brandName() {
        System.out.println("OnePlus");

    }
}