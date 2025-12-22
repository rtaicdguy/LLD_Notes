package snakeAndLadder;

public class Player {
    private final String name;
    private Integer position;

    Player(String name){
        this.name=name;
        position=0;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPosition(){
        return this.position;
    }

    public Integer setPosition(Integer position){
        return this.position=position;
    }
}
