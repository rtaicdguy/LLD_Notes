package tictactoe;

public interface Rules {
    boolean isValidMove(Board board,int row,int col);
    boolean isMatchDrawn(Board board);
    boolean isWinningMove(Board board,int row,int col);
}
