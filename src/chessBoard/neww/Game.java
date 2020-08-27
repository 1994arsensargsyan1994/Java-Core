package chessBoard.neww;

public class Game {
    public static void initialize() {
       Board.array[0][0].setFigure(new Rook(ColorOfBox.WHITE),0,0);
        Board.array[0][1].setFigure(new Knight(ColorOfBox.WHITE),0,1);
        Board.array[0][2].setFigure(new Bishop(ColorOfBox.WHITE),0,2);
        Board.array[0][3].setFigure(new Queen(ColorOfBox.WHITE),0,3);
        Board.array[0][4].setFigure(new King(ColorOfBox.WHITE),0,4);
        Board.array[0][7].setFigure(new Rook(ColorOfBox.WHITE),0,7);
        Board.array[0][6].setFigure(new Knight(ColorOfBox.WHITE),0,6);
        Board.array[0][5].setFigure(new Bishop(ColorOfBox.WHITE),0,5);
        for (int i = 0; i <8 ; i++) {
            Board.array[1][i].setFigure(new Pawn(ColorOfBox.WHITE),1,i);
        }
        Board.array[7][0].setFigure(new RookBlack(ColorOfBox.BLACK),7,0);
        Board.array[7][1].setFigure(new KnightBlack(ColorOfBox.BLACK),7,1);
        Board.array[7][2].setFigure(new BishopBlack(ColorOfBox.BLACK),7,2);
        Board.array[7][4].setFigure(new QueenBlack(ColorOfBox.BLACK),7,4);
        Board.array[7][3].setFigure(new KingBlack(ColorOfBox.BLACK),7,3);
        Board.array[7][7].setFigure(new RookBlack(ColorOfBox.BLACK),7,7);
        Board.array[7][6].setFigure(new KnightBlack(ColorOfBox.BLACK),7,6);
        Board.array[7][5].setFigure(new BishopBlack(ColorOfBox.BLACK),7,5);
        for (int i = 0; i <8 ; i++) {
            Board.array[6][i].setFigure(new PawnBlack(ColorOfBox.BLACK),6,i);
        }
        for (int i = 2; i <6 ; i++) {
            for (int j = 0; j <8 ; j++) {
                Board.array[i][j].setCord(i,j);
            }
        }



    }
    public static void unInitialize() {
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                Board.array[i][j].setFigure(null);
            }
        }
    }

}