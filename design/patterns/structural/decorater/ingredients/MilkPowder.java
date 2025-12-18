package design.patterns.structural.decorater.ingredients;

import design.patterns.structural.decorater.base.CoffeeBase;

public class MilkPowder extends CoffeeDecorator{
    private static final Integer BASE_PRICE=30;
    public MilkPowder(CoffeeBase coffeeBase){
        this.coffeeBase=coffeeBase;
    }
    @Override
    public int getPrince() {
        System.out.println("Adding Milk Powder decoration with price: "+BASE_PRICE);
        return BASE_PRICE+coffeeBase.getPrince();
    }
}
