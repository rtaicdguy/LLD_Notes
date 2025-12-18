package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.bike.Ather;
import design.patterns.creational.abstractFactory.bike.Bike;
import design.patterns.creational.abstractFactory.bike.OlaElectric;
import design.patterns.creational.abstractFactory.car.Car;
import design.patterns.creational.abstractFactory.car.MgHector;
import design.patterns.creational.abstractFactory.car.NexonEv;
import static design.patterns.creational.abstractFactory.Constants.*;

/**
 * Concrete Factory for Electric Vehicles (EV).
 * 
 * This factory creates electric-powered vehicles (both cars and bikes).
 * It implements the VehicleFactory interface and returns specific
 * EV vehicle implementations.
 * 
 * Products created by this factory:
 * - Electric Cars: MgHector, NexonEv
 * - Electric Bikes: OlaElectric, Ather
 */
public class EvVehicleFactory implements VehicleFactory {

    /**
     * Creates and returns an electric car based on the car name.
     * 
     * @param carName the name of the car to create
     * @return a concrete electric Car instance, or null if not found
     */
    @Override
    public Car getCar(String carName) {
        if(MG_HECTOR.equals(carName)){
            return new MgHector();
        }
        if(NEXON_EV.equals(carName)){
            return new NexonEv();
        }
        return null;
    }

    /**
     * Creates and returns an electric bike based on the bike name.
     * 
     * @param bike the name of the bike to create
     * @return a concrete electric Bike instance, or null if not found
     */
    @Override
    public Bike getBike(String bike) {
        if(OLA_ELECTRIC.equals(bike)){
            return new OlaElectric();
        }
        if(ATHER.equals(bike)){
            return new Ather();
        }
        return null;
    }
}
