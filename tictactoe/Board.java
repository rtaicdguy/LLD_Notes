package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final Character VOID_CHAR='_';
    private Integer numberOfMoves;
    private Integer boardSize;
    List<List<Character>> blocks;

    Board(int boardSize){
        this.boardSize=boardSize;
        blocks=new ArrayList<>();

        numberOfMoves=0;

        for(int i=0;i<this.boardSize;i++){
            List<Character> rowList=new ArrayList<>();
            for(int j=0;j<this.boardSize;j++){
                rowList.add(VOID_CHAR);
            }
            blocks.add(rowList);
        }
    }

    void setBlock(int row,int col,Character symbol){
        numberOfMoves++;
        this.blocks.get(row).set(col,symbol);
    }

    public boolean isBoardFull(){
        return  numberOfMoves.equals(boardSize*boardSize);
    }

    public Integer getBoardSize(){
        return this.boardSize;
    }

    public Character getBlock(int row,int col){
        return blocks.get(row).get(col);
    }

    public void printBoard(){
        for (int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                System.out.print(getBlock(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
