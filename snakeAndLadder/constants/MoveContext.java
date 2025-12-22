package snakeAndLadder.constants;

import snakeAndLadder.Board;
import snakeAndLadder.Player;
import snakeAndLadder.dice.Dice;

import java.util.List;

public class MoveContext {
    private final List<Player> players;
    private final List<Dice> dices;
    private final Board board;
    private final Integer playerNumber;

    public List<Player> getPlayers() {
        return players;
    }

    public List<Dice> getDices() {
        return dices;
    }

    public Board getBoard() {
        return board;
    }


    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public MoveContext(List<Player> players, List<Dice> dices, Board board, Integer playerNumber){
        this.players=players;
        this.dices=dices;
        this.board=board;
        this.playerNumber=playerNumber;
    }
}
