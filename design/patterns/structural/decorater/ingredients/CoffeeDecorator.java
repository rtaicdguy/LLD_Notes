package design.patterns.structural.decorater.ingredients;

import design.patterns.structural.decorater.base.CoffeeBase;

public abstract class CoffeeDecorator extends CoffeeBase {
    protected CoffeeBase coffeeBase;
    public abstract int getPrince();
}
