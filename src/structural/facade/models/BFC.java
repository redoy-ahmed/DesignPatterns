package structural.facade.models;

import structural.facade.interfaces.Restaurant;

public class BFC implements Restaurant {

    private final String name;
    private final String rating;
    private final String address;
    private final String foodCategory;

    public BFC() {
        this.name = "BFC";
        this.rating = "3.5";
        this.address = "119/1";
        this.foodCategory = "Fast Food";
    }

    @Override
    public void order() {
        System.out.println("Order is processing, Restaurant: " + this.name + "\nRating: "
                + this.rating + "\nAddress: " + this.address + "\nCategory: " + this.foodCategory);
    }
}
