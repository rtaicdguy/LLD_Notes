package design.patterns.structural.decorater.base;

public class Latte extends CoffeeBase {
    private static final Integer BASE_PRICE=80;
    @Override
    public int getPrince() {
        System.out.println("Adding Latte base with price: "+BASE_PRICE);
        return BASE_PRICE;
    }
}
