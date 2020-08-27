package chessBoard.neww;

public class KnightBlack extends Knight {
    char aChar = '\u265E';
    public KnightBlack(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public KnightBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar+" ";
    }
}
