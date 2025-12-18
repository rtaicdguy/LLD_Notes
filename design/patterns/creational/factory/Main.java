package design.patterns.creational.factory;

import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.car.Car;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory=new PetrolVehicleFactory();
        Car car=factory.getCar("Alto");
        car.mySpecifications();
        Bike bike=factory.getBike("HeroSplendor");
        bike.mySpecifications();

        System.out.println();
        System.out.println();

        factory=new EvVehicleFactory();
        car=factory.getCar("MgHector");
        car.mySpecifications();
        bike=factory.getBike("OlaElectric");
        bike.mySpecifications();
    }
}
