package chessBoard.neww;

public class QueenBlack extends Queen {
    char aChar ='\u265B';
    public QueenBlack(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public QueenBlack(ColorOfBox color) {
        super(color);
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }
}
