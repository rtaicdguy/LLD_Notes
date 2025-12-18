package design.patterns.creational.abstractFactory.bike;

/**
 * Concrete Product: HeroSplendor - A petrol bike.
 * Implements the Bike interface.
 */
public class HeroSplendor implements Bike {
    @Override
    public void mySpecifications() {
        System.out.println("Hello I am Hero Splendor, I am the king of rural india");
    }
}
