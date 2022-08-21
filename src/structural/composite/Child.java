package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Child implements Human {

    private final String name;
    private final String lastName;
    private final List<Human> parents = new ArrayList<>();

    public Child(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void addChild(Human child) {

    }

    @Override
    public void addParent(Human parent) {
        parents.add(parent);
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Parents :");
        for (Human parent : parents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("==============================");
    }
}