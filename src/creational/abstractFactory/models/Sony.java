package creational.abstractFactory.models;

import creational.abstractFactory.interfaces.Mobile;

public class Sony implements Mobile {
    @Override
    public void brandName() {
        System.out.println("Sony");

    }
}