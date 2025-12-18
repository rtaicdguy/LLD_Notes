package design.patterns.structural.decorater.base;

public class Cappuchino extends CoffeeBase {
    private static final Integer BASE_PRICE=50;
    @Override
    public int getPrince() {
        System.out.println("Adding Cappuchino base with price: "+BASE_PRICE);
        return BASE_PRICE;
    }
}
