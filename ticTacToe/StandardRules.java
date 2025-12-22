package ticTacToe;

public class StandardRules implements Rules{
    @Override
    public boolean isValidMove(Board board, int row, int col) {
        final int boardSize=board.getBoardSize();

        if(row<0 || col<0 || row>=boardSize || col>=boardSize){
            System.out.println("Invalid row or col index");
            return false;
        }
        if(!Board.VOID_CHAR.equals(board.getBlock(row,col))){
            System.out.println(Board.VOID_CHAR);
            System.out.println(board.getBlock(row,col));
            System.out.println("Overwriting already used block");
            return false;
        }

        return true;
    }

    @Override
    public boolean isMatchDrawn(Board board) {
        return board.isBoardFull();
    }

    @Override
    public boolean isWinningMove(Board board,int row,int col) {
        final int boardSize=board.getBoardSize();
        final Character currentSymbol=board.getBlock(row,col);

        boolean isRowDone=true, isColDone=true,isLeftDiagonalDone=true,isRightDiagonalDone=true;

        for(int i=0;i<boardSize;i++){
            if(!board.getBlock(row,i).equals(currentSymbol)){
                isRowDone=false;
            }

            if(!board.getBlock(i,col).equals(currentSymbol)){
                isColDone=false;
            }

            if(!board.getBlock(i,i).equals(currentSymbol)){
                isLeftDiagonalDone=false;
            }

            if(!board.getBlock(i,boardSize-i-1).equals(currentSymbol)){
                isRightDiagonalDone=false;
            }

        }

        return isRowDone || isColDone || isLeftDiagonalDone || isRightDiagonalDone;

    }
}
