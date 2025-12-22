package designPatterns.structural.decorater.base;

public class Americano extends CoffeeBase {
    private static final Integer BASE_PRICE=100;
    @Override
    public int getPrince() {
        System.out.println("Adding Americano base with price: "+BASE_PRICE);
        return BASE_PRICE;
    }
}
