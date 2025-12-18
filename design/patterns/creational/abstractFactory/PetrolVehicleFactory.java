package design.patterns.creational.abstractFactory;

import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.bike.CbShine;
import design.patterns.creational.factory.bike.HeroSplendor;
import design.patterns.creational.factory.car.Alto;
import design.patterns.creational.factory.car.Car;
import design.patterns.creational.factory.car.I10;

import static design.patterns.creational.abstractFactory.Constants.*;

public class PetrolVehicleFactory implements VehicleFactory {

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
