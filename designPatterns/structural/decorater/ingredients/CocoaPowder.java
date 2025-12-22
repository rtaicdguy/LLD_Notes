package designPatterns.structural.decorater.ingredients;

import designPatterns.structural.decorater.base.CoffeeBase;

public class CocoaPowder extends CoffeeDecorator{
    private static final Integer BASE_PRICE=20;
    public CocoaPowder(CoffeeBase coffeeBase){
        this.coffeeBase=coffeeBase;
    }
    @Override
    public int getPrince() {
        System.out.println("Adding Cocoa Powder decoration with price: "+BASE_PRICE);
        return BASE_PRICE+coffeeBase.getPrince();
    }
}
