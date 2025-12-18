package design.patterns.creational.factory;

import design.patterns.creational.factory.bike.*;
import design.patterns.creational.factory.car.*;

public class EvVehicleFactory implements VehicleFactory{
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
