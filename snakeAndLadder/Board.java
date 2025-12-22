package snakeAndLadder;

import snakeAndLadder.strategy.Strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Board {
    private Map<Integer,BoardElement> boardElementMap;
    private Integer winningNumber;

    Board(Integer winningNumber){
        this.winningNumber=winningNumber;
        boardElementMap=new HashMap<>();
    }

    public void addBoardElement(BoardElement boardElement) {
        Integer from=boardElement.getFrom();
        Integer to=boardElement.getTo();
        if (boardElementMap.containsKey(from) || boardElementMap.containsKey(to)) {
            throw new RuntimeException("Invalid Board Element Mapping provided, board mapping already exists!");
        }
        boardElementMap.put(from, boardElement);
    }

    public Optional<BoardElement> getBoardElement(Integer position) {
        if(boardElementMap.containsKey(position)){
            return Optional.ofNullable(boardElementMap.get(position));
        }
        return Optional.empty();
    }

    public Integer getWinningNumber(){
        return this.winningNumber;
    }

}
