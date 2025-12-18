package design.patterns.creational.abstractFactory;

import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.car.Car;

import static design.patterns.creational.abstractFactory.Constants.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory=new PetrolVehicleFactory();
        Car car=factory.getCar(ALTO);
        car.mySpecifications();
        Bike bike=factory.getBike(HERO_SPLENDOR);
        bike.mySpecifications();

        System.out.println();
        System.out.println();

        factory=new EvVehicleFactory();
        car=factory.getCar(MG_HECTOR);
        car.mySpecifications();
        bike=factory.getBike(OLA_ELECTRIC);
        bike.mySpecifications();
    }
}
