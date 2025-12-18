package design.patterns.creational.factory;

import design.patterns.creational.factory.bike.Bike;
import design.patterns.creational.factory.car.Car;

public interface VehicleFactory {
    public Car getCar(String car);
    public Bike getBike(String bike);

}
