package design.patterns.creational.abstractFactory.car;

/**
 * Concrete Product: NexonEv - An electric car.
 * Implements the Car interface.
 */
public class NexonEv implements Car {
    @Override
    public void mySpecifications() {
        System.out.println("Hello I am Nexon EV, I am a mini SUV EV Car");
    }
}
