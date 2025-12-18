package design.patterns.creational.abstractFactory;

import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.bike.CbShine;
import design.patterns.creational.factory.bike.HeroSplendor;
import design.patterns.creational.factory.car.Alto;
import design.patterns.creational.factory.car.Car;
import design.patterns.creational.factory.car.I10;

public class PetrolVehicleFactory implements VehicleFactory {
    @Override
    public Car getCar(String carName) {
        if("Alto".equals(carName)){
            return new Alto();
        }
        if("I10".equals(carName)){
            return new I10();
        }
        return null;
    }

    @Override
    public Bike getBike(String bike) {
        if("HeroSplendor".equals(bike)){
            return new HeroSplendor();
        }
        if("CbShine".equals(bike)){
            return new CbShine();
        }
        return null;
    }
}
