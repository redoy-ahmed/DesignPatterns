package structural.composite;

public interface Human {

    String getName();
    String getLastName();

    void addChild(Human child);
    void addParent(Human parent);

    void print();
}