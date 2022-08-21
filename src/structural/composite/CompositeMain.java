package structural.composite;

public class CompositeMain {

    /*
        Definition of Composite pattern
            In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

        Where to use the Composite pattern?
            When we want to implement the same interface on leaves and composites so that they are handled in the same way.

    */


    public static void main(String[] args) {

        Child mathys = new Child("Mathys", "Le Tutor");
        Parent erwan = new Parent("Erwan", "Le Tutor");
        Parent amelie = new Parent("Amelie", "Le Tutor");

        mathys.addParent(erwan);
        mathys.addParent(amelie);

        erwan.addChild(mathys);
        amelie.addChild(mathys);

        GrandParent philippe = new GrandParent("Philippe", "Le Tutor");

        philippe.addChild(erwan);
        erwan.addParent(philippe);

        philippe.print();
        erwan.print();
        mathys.print();
    }
}