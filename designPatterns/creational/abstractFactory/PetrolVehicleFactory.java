package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.bike.Bike;
import designPatterns.creational.abstractFactory.bike.CbShine;
import designPatterns.creational.abstractFactory.bike.HeroSplendor;
import designPatterns.creational.abstractFactory.car.Alto;
import designPatterns.creational.abstractFactory.car.Car;
import designPatterns.creational.abstractFactory.car.I10;

import static designPatterns.creational.abstractFactory.Constants.*;

/**
 * Concrete Factory for Petrol Vehicles.
 * 
 * This factory creates petrol-powered vehicles (both cars and bikes).
 * It implements the VehicleFactory interface and returns specific
 * petrol vehicle implementations.
 * 
 * Products created by this factory:
 * - Petrol Cars: Alto, I10
 * - Petrol Bikes: HeroSplendor, CbShine
 */
public class PetrolVehicleFactory implements VehicleFactory {

    /**
     * Creates and returns a petrol car based on the car name.
     * 
     * @param carName the name of the car to create
     * @return a concrete petrol Car instance, or null if not found
     */
    @Override
    public Car getCar(String carName) {
        if(ALTO.equals(carName)){
            return new Alto();
        }
        if(I_10.equals(carName)){
            return new I10();
        }
        return null;
    }

    /**
     * Creates and returns a petrol bike based on the bike name.
     * 
     * @param bike the name of the bike to create
     * @return a concrete petrol Bike instance, or null if not found
     */
    @Override
    public Bike getBike(String bike) {
        if(HERO_SPLENDOR.equals(bike)){
            return new HeroSplendor();
        }
        if(CB_SHINE.equals(bike)){
            return new CbShine();
        }
        return null;
    }
}
