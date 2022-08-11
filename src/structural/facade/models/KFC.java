package structural.facade.models;

import structural.facade.interfaces.Restaurant;

public class KFC implements Restaurant {

    private final String name;
    private final String rating;
    private final String address;
    private final String foodCategory;

    public KFC() {
        this.name = "KFC";
        this.rating = "3.7";
        this.address = "219/1";
        this.foodCategory = "Fast Food";
    }

    @Override
    public void order() {
        System.out.println("Order is processing, Restaurant: " + this.name + "\nRating: "
                + this.rating + "\nAddress: " + this.address + "\nCategory: " + this.foodCategory);
    }
}
