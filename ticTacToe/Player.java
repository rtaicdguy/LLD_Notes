package ticTacToe;

public class Player {
    private final Character symbol;
    private final String name;
    Player(Character symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public char getSymbol(){
        return this.symbol;
    }

}
