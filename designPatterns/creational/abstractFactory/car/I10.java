package designPatterns.creational.abstractFactory.car;

/**
 * Concrete Product: I10 - A petrol car.
 * Implements the Car interface.
 */
public class I10 implements Car {
    @Override
    public void mySpecifications() {
        System.out.println("Hello, I am I10, I  have AC, it have powered windows.");
    }
}
