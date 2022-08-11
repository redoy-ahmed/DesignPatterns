package structural.facade.models;

import structural.facade.interfaces.Restaurant;

public class PizzaHut implements Restaurant {

    private final String name;
    private final String rating;
    private final String address;
    private final String foodCategory;

    public PizzaHut() {
        this.name = "Pizza Hut";
        this.rating = "4.0";
        this.address = "219/1";
        this.foodCategory = "Pizza";
    }

    @Override
    public void order() {
        System.out.println("Order is processing, Restaurant: " + this.name + "\nRating: "
                + this.rating + "\nAddress: " + this.address + "\nCategory: " + this.foodCategory);
    }
}
