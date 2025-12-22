package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    Rules rules;
    List<Player> players;
    Integer currentPlayerIndex;

    void addPlayer(Player player){
        players.add(player);
    }

    Game(Board board,Rules rules){
        this.board=board;
        this.rules=rules;
        players=new ArrayList<>();
        currentPlayerIndex=0;
    }


    State playMove(int row,int col){
        if(!rules.isValidMove(board,row,col)){
            throw new RuntimeException("Invalid Move by the player");
        }

        Player currentPlayer=getCurrentPlayer();
        Character currentSymbol=currentPlayer.getSymbol();
        System.out.println("Player: "+currentPlayer.getName()+
                "["+currentPlayer.getSymbol()+"]"+
                " played move in row:"+row+" and col:"+col);

        board.setBlock(row,col,currentSymbol);

        if(rules.isMatchDrawn(board)){
            return State.DRAWN;
        }

        if(rules.isWinningMove(board,row,col)){
            return State.WINNER;
        }
        changePlayer();
        return State.PENDING;
    }

    private void changePlayer(){
        currentPlayerIndex=(currentPlayerIndex+1)%players.size();
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }


}
