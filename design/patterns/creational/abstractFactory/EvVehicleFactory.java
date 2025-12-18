package design.patterns.creational.abstractFactory;

import design.patterns.creational.factory.bike.Ather;
import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.bike.OlaElectric;
import design.patterns.creational.factory.car.Car;
import design.patterns.creational.factory.car.MgHector;
import design.patterns.creational.factory.car.NexonEv;
import static design.patterns.creational.abstractFactory.Constants.*;


public class EvVehicleFactory implements VehicleFactory {

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
