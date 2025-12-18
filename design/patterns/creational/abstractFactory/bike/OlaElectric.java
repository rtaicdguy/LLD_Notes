package design.patterns.creational.abstractFactory.bike;

/**
 * Concrete Product: OlaElectric - An electric bike.
 * Implements the Bike interface.
 */
public class OlaElectric implements Bike {
    @Override
    public void mySpecifications() {
        System.out.println("Hello I am OLA Electric,I am EV King !");
    }
}
