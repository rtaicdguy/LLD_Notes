package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.bike.Bike;
import design.patterns.creational.abstractFactory.car.Car;

/**
 * ABSTRACT FACTORY DESIGN PATTERN
 * 
 * Purpose: Provides an interface for creating families of related or dependent objects
 * without specifying their concrete classes.
 * 
 * Use Cases:
 * - When you need to create families of related products (e.g., EV vehicles, Petrol vehicles)
 * - When you want to ensure that products from the same family are used together
 * - When you want to provide a library of products and reveal only their interfaces
 * 
 * In this example:
 * - VehicleFactory is the Abstract Factory interface
 * - EvVehicleFactory and PetrolVehicleFactory are Concrete Factories
 * - Car and Bike are Abstract Products
 * - Specific cars (Alto, NexonEv) and bikes (HeroSplendor, Ather) are Concrete Products
 * 
 * Benefits:
 * 1. Isolates concrete classes - client code works with interfaces
 * 2. Easy to exchange product families - just switch the factory
 * 3. Promotes consistency among products - ensures related products are used together
 */
public interface VehicleFactory {
    /**
     * Creates a car based on the provided car name.
     * Different factories will return different types of cars.
     */
    public Car getCar(String car);
    
    /**
     * Creates a bike based on the provided bike name.
     * Different factories will return different types of bikes.
     */
    public Bike getBike(String bike);

}
