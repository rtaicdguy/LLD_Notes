package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Player p1=new Player('X',"Rishabh");
        Player p2=new Player('O',"Laudo");


        Board board=new Board(3);
        Rules rules=new StandardRules();
        Game game=new Game(board,rules);
        game.addPlayer(p1);
        game.addPlayer(p2);

        int idx=0;
        List<Pair> moves=getMoves();
        while (true){
            int row=moves.get(idx).row;
            int col=moves.get(idx).col;

            State state=game.playMove(row,col);

            board.printBoard();

            if(State.WINNER.equals(state)){
                Player winner=game.getCurrentPlayer();
                System.out.println("Player: "+winner.getName()+" won the match!");
                break;
            }

            if(State.DRAWN.equals(state)){
                System.out.println("Match is Drawn :(");
                break;
            }

            idx++;

        }


    }

    private static class Pair{
        public int row;
        public int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }

    private static List<Pair> getMoves(){
        List<Pair> p=new ArrayList<>();
        p.add(new Pair(0,0));
        p.add(new Pair(1,1));
        p.add(new Pair(2,2));
        p.add(new Pair(1,0));
        p.add(new Pair(1,2));
        p.add(new Pair(0,2));
        p.add(new Pair(2,0));
        p.add(new Pair(2,1));
        p.add(new Pair(0,1));
        return p;
    }
}
