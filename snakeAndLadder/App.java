package snakeAndLadder;


import snakeAndLadder.dice.Dice;
import snakeAndLadder.dice.RandomDice;
import snakeAndLadder.constants.ElementType;
import snakeAndLadder.strategy.SimpleStrategy;
import snakeAndLadder.strategy.Strategy;

public class App {
    public static void main(String[] args) {
        Board board = getBoard();
        Dice dice1=new RandomDice(6);
        Dice dice2=new RandomDice(6);
        Game game=new Game(board,new SimpleStrategy());

        game.addDice(dice1);
        game.addDice(dice2);

        Player p1=new Player("Rishabh");
        Player p2=new Player("Honey");

        game.addPlayer(p1);
        game.addPlayer(p2);

        Player winner=game.play();

        System.out.println("Winner: "+winner.getName());
    }

    private static Board getBoard() {

        BoardElement snake1=new BoardElement(ElementType.SNAKE,90,80);
        BoardElement snake2=new BoardElement(ElementType.SNAKE,70,60);
        BoardElement snake3=new BoardElement(ElementType.SNAKE,50,40);
        BoardElement snake4=new BoardElement(ElementType.SNAKE,30,20);
        BoardElement snake5=new BoardElement(ElementType.SNAKE,10,5);


        BoardElement ladder1=new BoardElement(ElementType.LADDER,6,11);
        BoardElement ladder2=new BoardElement(ElementType.LADDER,16,21);
        BoardElement ladder3=new BoardElement(ElementType.LADDER,26,31);
        BoardElement ladder4=new BoardElement(ElementType.LADDER,36,51);
        BoardElement ladder5=new BoardElement(ElementType.LADDER,46,71);

        Board board=new Board(100);

        board.addBoardElement(snake1);
        board.addBoardElement(snake2);
        board.addBoardElement(snake3);
        board.addBoardElement(snake4);
        board.addBoardElement(snake5);
        board.addBoardElement(ladder1);
        board.addBoardElement(ladder2);
        board.addBoardElement(ladder3);
        board.addBoardElement(ladder4);
        board.addBoardElement(ladder5);
        return board;
    }
}
