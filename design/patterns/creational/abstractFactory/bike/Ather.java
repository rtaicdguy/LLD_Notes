package design.patterns.creational.abstractFactory.bike;

/**
 * Concrete Product: Ather - An electric bike.
 * Implements the Bike interface.
 */
public class Ather implements Bike {
    @Override
    public void mySpecifications() {
        System.out.println("Hello I am Ather,I am the reliable EV King!");
    }
}
