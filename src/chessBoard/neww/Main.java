package chessBoard.neww;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Game.initialize();
        board.printtt();
        Game.unInitialize();
        System.out.println("___________________________________");
       Box.method(new Pawn(ColorOfBox.WHITE),3,0);
       board.printtt();


    }
}
