package design.patterns.behavioral.chainOfResponsibility;

import design.patterns.behavioral.chainOfResponsibility.denominations.Denomination;

public class Main {
    public static void main(String[] args) {
        Denomination fiveHundred=new Denomination(500,5);
        Denomination twoHundred=new Denomination(200,3);
        Denomination hundred=new Denomination(100,2);
        Denomination fifty=new Denomination(50,5);
        fiveHundred.setNextDenomination(twoHundred);
        twoHundred.setNextDenomination(hundred);
        hundred.setNextDenomination(fifty);

        fiveHundred.process(1055);

    }
}
