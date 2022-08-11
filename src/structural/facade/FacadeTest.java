package structural.facade;

public class FacadeTest {

    /*The facade pattern is appropriate when you have a complex system that you want to expose to clients in a simplified way,
    or you want to make an external communication layer over an existing system which is incompatible with the system.
    Facade deals with interfaces, not implementation. Its purpose is to hide internal complexity behind a single interface
    that appears simple on the outside.*/

    public static void main(String[] args) {
        FoodDelivery foodDelivery = new FoodDelivery();
        foodDelivery.orderBFCFood();
    }
}
