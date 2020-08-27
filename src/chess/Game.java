package chess;

import java.io.IOException;

public class Game {
    void chessGame() throws IOException {
        byte coordinate [] = new byte[5];
        Player player1 = new Player(EnumColor.valueOf("WHITE"));
        Player player2 = new Player(EnumColor.valueOf("BLACK"));
        while(true) {
            Board.getBoard().showBoard();
            do {
                System.out.println("\nPLAYER ONE please input coordinates(first number, first letter, second number, second letter)!");

                System.in.read(coordinate);
            }  while(!player1.move(coordinate[0], coordinate[1], coordinate[2], coordinate[3]));

            Board.getBoard().showBoard();

            do {
                System.out.println("\nPLAYER TWO please input coordinates(first number, first letter, second number, second letter)!");

                System.in.read(coordinate);
            } while (!player2.move(coordinate[0], coordinate[1], coordinate[2], coordinate[3]));
        }
    }
}
