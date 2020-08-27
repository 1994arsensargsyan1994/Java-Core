package chessBoard.neww;

public class BishopBlack  extends Bishop {
    char aChar = '\u265D';
    public BishopBlack(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public BishopBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }
}
