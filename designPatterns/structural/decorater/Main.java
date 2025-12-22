package designPatterns.structural.decorater;

import designPatterns.structural.decorater.base.Cappuchino;
import designPatterns.structural.decorater.base.CoffeeBase;
import designPatterns.structural.decorater.ingredients.CocoaPowder;
import designPatterns.structural.decorater.ingredients.MilkPowder;
import designPatterns.structural.decorater.ingredients.Sugar;

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
