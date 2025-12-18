package design.patterns.creational.abstractFactory.car;

/**
 * Concrete Product: MgHector - An electric car.
 * Implements the Car interface.
 */
public class MgHector implements Car {
    @Override
    public void mySpecifications() {
        System.out.println("Hello I am MG Hector, I am EV Car, I have automated features");
    }
}
