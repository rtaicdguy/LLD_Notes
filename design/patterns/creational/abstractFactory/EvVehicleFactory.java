package design.patterns.creational.abstractFactory;

import design.patterns.creational.factory.bike.Ather;
import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.bike.OlaElectric;
import design.patterns.creational.factory.car.Car;
import design.patterns.creational.factory.car.MgHector;
import design.patterns.creational.factory.car.NexonEv;

public class EvVehicleFactory implements VehicleFactory {
    @Override
    public Car getCar(String carName) {
        if("MgHector".equals(carName)){
            return new MgHector();
        }
        if("NexonEv".equals(carName)){
            return new NexonEv();
        }
        return null;
    }

    @Override
    public Bike getBike(String bike) {
        if("OlaElectric".equals(bike)){
            return new OlaElectric();
        }
        if("Ather".equals(bike)){
            return new Ather();
        }
        return null;
    }
}
