package snakeAndLadder;

import snakeAndLadder.constants.MoveContext;
import snakeAndLadder.dice.Dice;
import snakeAndLadder.constants.State;
import snakeAndLadder.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final List<Dice> dices;
    private Strategy strategy;
    private State state;
    private Integer playerNumber;



    Game(Board board,Strategy strategy){
        this.board=board;
        players=new ArrayList<>();
        this.dices=new ArrayList<>();
        this.strategy=strategy;
        this.state=State.PENDING;
        playerNumber=0;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void addDice(Dice dice){
        dices.add(dice);
    }

    public Player play(){

        while (this.state.equals(State.PENDING)){
            MoveContext moveContext=new MoveContext(players,dices,board,playerNumber);
            strategy.validateMove(moveContext);
            Integer finalPos=strategy.playMove(moveContext);
            players.get(playerNumber).setPosition(finalPos);
            if(strategy.isPlayerWon(moveContext)){
                this.state=State.COMPLETED;
                return players.get(playerNumber);
            }
            setNextPlayer();
        }
        return null;

    }

    public void setNextPlayer(){
        playerNumber=(playerNumber+1)%players.size();
    }

}
