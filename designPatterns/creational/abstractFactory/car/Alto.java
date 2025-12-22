package designPatterns.creational.abstractFactory.car;

/**
 * Concrete Product: Alto - A petrol car.
 * Implements the Car interface.
 */
public class Alto implements Car {
    @Override
    public void mySpecifications() {
        System.out.println("Hello, I am Alto, I dont have AC, it have manual windows.");
    }
}
