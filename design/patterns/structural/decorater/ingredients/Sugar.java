package design.patterns.structural.decorater.ingredients;

import design.patterns.structural.decorater.base.CoffeeBase;

public class Sugar extends CoffeeDecorator{
    private static final Integer BASE_PRICE=10;
    public Sugar(CoffeeBase coffeeBase){
        this.coffeeBase=coffeeBase;
    }
    @Override
    public int getPrince() {
        System.out.println("Adding Sugar powder with price: "+BASE_PRICE);
        return BASE_PRICE+coffeeBase.getPrince();
    }
}
