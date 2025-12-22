package designPatterns.structural.decorater.ingredients;

import designPatterns.structural.decorater.base.CoffeeBase;

public abstract class CoffeeDecorator extends CoffeeBase {
    protected CoffeeBase coffeeBase;
    public abstract int getPrince();
}
