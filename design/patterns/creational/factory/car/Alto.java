package design.patterns.creational.factory.car;

public class Alto implements Car {
    @Override
    public void mySpecifications() {
        System.out.println("Hello, I am Alto, I dont have AC, it have manual windows.");
    }
}
