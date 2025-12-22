package snakeAndLadder.strategy;

import snakeAndLadder.Board;
import snakeAndLadder.constants.MoveContext;

public interface Strategy {
    public Integer playMove(MoveContext moveContext);
    public void validateMove(MoveContext moveContext);
    public boolean isPlayerWon(MoveContext moveContext);

}
