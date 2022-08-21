package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Human {

    private final String name;
    private final String lastName;
    private final List<Human> children = new ArrayList<>();
    private final List<Human> grandParents = new ArrayList<>();

    public Parent(String name, String lastName) {
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
        children.add(child);
    }

    @Override
    public void addParent(Human parent) {
        grandParents.add(parent);
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Parents :");
        for (Human parent : grandParents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("children :");
        for (Human child : children) {
            System.out.println("  - Name : " + child.getName());
        }
        System.out.println("==============================");
    }
}