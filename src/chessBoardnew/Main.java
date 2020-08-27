package chessBoardnew;

public class Main {
    public static void main(String[] args) {
        Board.printBoard();
        Tile tile=Board.tiles[1][1];
        if (tile != null && !tile.isEmpty()){
            tile.getPiece().move(tile,Board.tiles[1][3]);
        }
        System.out.println("================================");
        Board.printBoard();

        Tile tile1=Board.tiles[1][5];
        if (tile1 != null && !tile1.isEmpty()){
            tile1.getPiece().move(tile1,Board.tiles[1][7]);
        }
        System.out.println("================================");
        Board.printBoard();
    }
}

