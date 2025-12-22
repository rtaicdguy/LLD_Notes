package snakeAndLadder.dice;

public class RandomDice implements Dice {
    private final Integer maxVal;
    public RandomDice(Integer maxVal){
        this.maxVal=maxVal;
    }

    @Override
    public Integer play(){
        Integer val=(int)(Math.random()* maxVal)+1;
        System.out.println("Dice gives value: "+val);
        return val;
    }
}
