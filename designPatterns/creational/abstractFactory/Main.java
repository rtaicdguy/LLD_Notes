package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.bike.Bike;
import designPatterns.creational.abstractFactory.car.Car;

import static designPatterns.creational.abstractFactory.Constants.*;

/**
 * Demonstration of Abstract Factory Pattern
 * 
 * This example shows how to use different factories to create families of related products.
 * 
 * Key Points:
 * 1. Client code (this Main class) works with abstract interfaces (VehicleFactory, Car, Bike)
 * 2. We can easily switch between product families by changing the factory
 * 3. The factory ensures that products from the same family are used together
 *    (e.g., PetrolVehicleFactory creates only petrol vehicles)
 */
public class Main {
    public static void main(String[] args) {
        // Create a Petrol Vehicle Factory
        // This factory will create petrol-powered cars and bikes
        System.out.println("=== PETROL VEHICLE FAMILY ===");
        VehicleFactory factory=new PetrolVehicleFactory();
        
        // Get a petrol car from the factory
        Car car=factory.getCar(ALTO);
        car.mySpecifications();
        
        // Get a petrol bike from the factory
        Bike bike=factory.getBike(HERO_SPLENDOR);
        bike.mySpecifications();

        System.out.println();
        System.out.println("=== ELECTRIC VEHICLE FAMILY ===");
        
        // Switch to Electric Vehicle Factory
        // Now we get electric vehicles instead - just by changing the factory!
        // This demonstrates the power of Abstract Factory pattern
        factory=new EvVehicleFactory();
        
        // Get an electric car from the factory
        car=factory.getCar(MG_HECTOR);
        car.mySpecifications();
        
        // Get an electric bike from the factory
        bike=factory.getBike(OLA_ELECTRIC);
        bike.mySpecifications();
        
        // Notice: The client code (this main method) doesn't need to know
        // the concrete classes (Alto, MgHector, etc.). It only works with
        // interfaces (VehicleFactory, Car, Bike), making it flexible and maintainable.
    }
}
