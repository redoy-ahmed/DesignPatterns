package structural.facade.models;

import structural.facade.interfaces.Restaurant;

public class Xinxian implements Restaurant {

    private final String name;
    private final String rating;
    private final String address;
    private final String foodCategory;

    public Xinxian() {
        this.name = "Xinxian";
        this.rating = "4.0";
        this.address = "Dhanmondi, 27";
        this.foodCategory = "Chinese";
    }

    @Override
    public void order() {
        System.out.println("Order is processing, Restaurant: " + this.name + "\nRating: "
                + this.rating + "\nAddress: " + this.address + "\nCategory: " + this.foodCategory);
    }
}