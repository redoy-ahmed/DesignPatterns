package creational.builder;

import creational.builder.model.Person;

public class BuilderExample {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .nid(123)
                .firstName("Redoy")
                .lastName("Ahmed")
                .accountNumber("01800")
                .build();

        System.out.println(person.toString());
    }
}
