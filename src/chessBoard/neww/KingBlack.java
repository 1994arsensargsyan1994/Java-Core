package chessBoard.neww;

public class KingBlack  extends King{
    char aChar = '\u265A';
    public KingBlack(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public KingBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }
}
