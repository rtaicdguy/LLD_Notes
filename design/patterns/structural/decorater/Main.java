package design.patterns.structural.decorater;

import design.patterns.structural.decorater.base.Cappuchino;
import design.patterns.structural.decorater.base.CoffeeBase;
import design.patterns.structural.decorater.ingredients.CocoaPowder;
import design.patterns.structural.decorater.ingredients.MilkPowder;
import design.patterns.structural.decorater.ingredients.Sugar;

public class Main {
    public static void main(String[] args) {
        CoffeeBase c=new Cappuchino();
        CoffeeBase c1=new CocoaPowder(c);
        CoffeeBase c2=new CocoaPowder(c1);
        CoffeeBase c3=new MilkPowder(c2);
        CoffeeBase c4=new Sugar(c3);
        System.out.println("Final price is: "+ c4.getPrince());
    }
}
