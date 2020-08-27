package chessBoard.neww;

public class PawnBlack extends Pawn {
    char aChar = '\u265F';
    public PawnBlack(ColorOfBox colors, int x, int y) {
        super(colors, x, y);
    }

    public PawnBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar+" ";
    }
}
