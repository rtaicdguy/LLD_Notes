package snakeAndLadder.strategy;

import snakeAndLadder.Board;
import snakeAndLadder.BoardElement;
import snakeAndLadder.Player;
import snakeAndLadder.constants.MoveContext;
import snakeAndLadder.dice.Dice;

import java.util.List;
import java.util.Optional;

public class SimpleStrategy implements Strategy{
    @Override
    public Integer playMove(MoveContext moveContext) {
        Player player=moveContext.getPlayers().get(moveContext.getPlayerNumber());
        Board board=moveContext.getBoard();

        System.out.println("Player: "+player.getName()+" has position: "+player.getPosition());
        Integer currentPos=player.getPosition();
        Integer diceSum=getDiceSum(moveContext.getDices());
        System.out.println("Dice sum: "+diceSum);
        Integer finalPos=currentPos+diceSum;

        if(finalPos>board.getWinningNumber()){
            System.out.println("Final Pos: "+currentPos);
            return currentPos;
        }
        System.out.println("Final Pos: "+finalPos);


        Optional<BoardElement> boardElement=board.getBoardElement(finalPos);
        if(boardElement.isEmpty()){
            return finalPos;
        }

        Integer movesPos=boardElement.get().getTo();
        System.out.println("Found a :"+boardElement.get().getElementType().name()+
                " moving to: "+movesPos);

        return movesPos;
    }

    private static Integer getDiceSum(List<Dice> dices) {
        Integer diceSum=0;
        for(Dice dice : dices){
            diceSum+=dice.play();
        }
        return diceSum;
    }

    @Override
    public void validateMove(MoveContext moveContext) {

        if(moveContext.getPlayers().get(moveContext.getPlayerNumber()).getPosition()> moveContext.getBoard().getWinningNumber()){
            throw new RuntimeException("Invalid Player Position");
        }

        if(moveContext.getPlayers().size()<2){
            throw new RuntimeException("Atlease 2 players should play");
        }

        if(moveContext.getDices().size()<1){
            throw new RuntimeException("Atlease 1 Dice should be added in game");
        }
    }

    @Override
    public boolean isPlayerWon(MoveContext moveContext) {
        return moveContext.getPlayers().get(moveContext.getPlayerNumber()).getPosition().equals(moveContext.getBoard().getWinningNumber());
    }

}
