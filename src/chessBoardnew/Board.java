package chessBoardnew;

public class Board {
    protected static Tile[][] tiles = new Tile[8][8];

    static {
        System.out.println("Board initialization");
        tiles[0][0] = new Tile(true,0,0);
        tiles[0][1] = new Tile(true,0,1);
        tiles[0][2] = new Tile(false, new Pawn(Color.BLACK,0,2),0,2);
        tiles[0][3] = new Tile(false, new Pawn(Color.BLACK,0,3), 0,3);
        tiles[0][4] = new Tile(false, new Pawn(Color.WHITE,0,4), 0, 4);
        tiles[0][5] = new Tile(false, new Rook(Color.WHITE,0,5), 0, 5);
        tiles[0][6] = new Tile(true,0,6);
        tiles[0][7] = new Tile(false,new Rook(Color.BLACK,0,7),0,7);

        tiles[1][0] = new Tile(false, new Pawn(Color.WHITE,1,0), 1, 0);
        tiles[1][1] = new Tile(false, new Pawn(Color.WHITE,1,1), 1, 1);
        tiles[1][2] = new Tile(true,1,2);
        tiles[1][3] = new Tile(false, new Pawn(Color.WHITE,1,3), 1, 3);
        tiles[1][4] = new Tile(true,1,4);
        tiles[1][5] = new Tile(false, new Rook(Color.WHITE,1,5), 1, 5);
        tiles[1][6] = new Tile(true,1,6);
        tiles[1][7] = new Tile(true,1,7);

        tiles[2][0] = new Tile(false, new Pawn(Color.WHITE,2,0), 2, 0);
        tiles[2][1] = new Tile(false, new Rook(Color.WHITE,2,1), 2, 1);
        tiles[2][2] = new Tile(true,2,2);
        tiles[2][3] = new Tile(false, new Pawn(Color.WHITE,2,3), 2, 3);
        tiles[2][4] = new Tile(false, new Pawn(Color.WHITE,2,4), 2, 4);
        tiles[2][5] = new Tile(false, new Rook(Color.WHITE,2,5), 2, 5);
        tiles[2][6] = new Tile(true,2,6);
        tiles[2][7] = new Tile(true,2,7);

        tiles[3][0] = new Tile(false, new Pawn(Color.WHITE,3,0), 3, 0);
        tiles[3][1] = new Tile(false, new Rook(Color.WHITE,3,1), 3, 1);
        tiles[3][2] = new Tile(true,3,2);
        tiles[3][3] = new Tile(false, new Pawn(Color.BLACK,3,3), 3, 3);
        tiles[3][4] = new Tile(false, new Pawn(Color.WHITE,3,4), 3, 4);
        tiles[3][5] = new Tile(false, new Rook(Color.WHITE,3,5), 3, 5);
        tiles[3][6] = new Tile(true,3,6);
        tiles[3][7] = new Tile(true,3,7);

        tiles[4][0] = new Tile(false, new Pawn(Color.WHITE,4,1), 4, 0);
        tiles[4][1] = new Tile(false, new Rook(Color.WHITE,4,1), 4, 1);
        tiles[4][2] = new Tile(true,4,2);
        tiles[4][3] = new Tile(false, new Pawn(Color.BLACK,4,3), 4, 3);
        tiles[4][4] = new Tile(false, new Pawn(Color.WHITE,4,4), 4, 4);
        tiles[4][5] = new Tile(false, new Rook(Color.WHITE,4,5), 4, 5);
        tiles[4][6] = new Tile(true,4,6);
        tiles[4][7] = new Tile(true,4,7);

        tiles[5][0] = new Tile(false, new Pawn(Color.WHITE,5,0), 5, 0);
        tiles[5][1] = new Tile(true,5,1);
        tiles[5][2] = new Tile(true,5,2);
        tiles[5][3] = new Tile(false, new Pawn(Color.BLACK,5,3), 5, 3);
        tiles[5][4] = new Tile(false, new Pawn(Color.WHITE,5,4), 5, 4);
        tiles[5][5] = new Tile(false, new Rook(Color.WHITE,5,5), 5, 5);
        tiles[5][6] = new Tile(true,5,6);
        tiles[5][7] = new Tile(true,5,7);

        tiles[6][0] = new Tile(false,new Rook(Color.WHITE,6,0), 6, 0);
        tiles[6][1] = new Tile(false, new Rook(Color.WHITE,6,1), 6, 1);
        tiles[6][2] = new Tile(true,6,2);
        tiles[6][3] = new Tile(false, new Pawn(Color.BLACK,6,3), 6, 3);
        tiles[6][4] = new Tile(false, new Pawn(Color.WHITE,6,4), 6, 4);
        tiles[6][5] = new Tile(false, new Rook(Color.WHITE,6,5), 6, 5);
        tiles[6][6] = new Tile(true,6,6);
        tiles[6][7] = new Tile(true,6,7);

        tiles[7][0] = new Tile(false, new Pawn(Color.WHITE,7,0), 7, 0);
        tiles[7][1] = new Tile(false, new Pawn(Color.WHITE,7,1), 7, 1);
        tiles[7][2] = new Tile(true,7,2);
        tiles[7][3] = new Tile(false, new Pawn(Color.BLACK,7,3), 7, 3);
        tiles[7][4] = new Tile(false, new Pawn(Color.WHITE,7,4), 7, 4);
        tiles[7][5] = new Tile(false, new Rook(Color.WHITE,7,5), 7, 5);
        tiles[7][6] = new Tile(true,7,6);
        tiles[7][7] = new Tile(true,7,7);
    }
    public static void printBoard(){
        String message = "";
        for (int i = 0; i < Board.tiles.length; i++) {
            for (int j = 0; j < Board.tiles[i].length; j++) {
                if (Board.tiles[i][j].empty) {
                    message = "empty";
                } else if (Board.tiles[i][j].getPiece().getColor().equals(Color.BLACK)) {
                    message = "Black";
                } else {
                    message = "White";
                }
                if (Board.tiles[i][j].getPiece() instanceof Pawn) {
                    message = message +" "+ "Pawns";
                } else if (Board.tiles[i][j].getPiece() instanceof Rook) {
                    message = message +" "+ "Rook";
                }
                System.out.print( "[" + i + "][" + j + "]="+ message + "  ");
            }
            System.out.println();
        }
    }
}
