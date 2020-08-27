package chessBoard.neww;

public class RookBlack extends Rook {
    char aChar = '\u265C';
    public RookBlack(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public RookBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar +" ";
    }
}
