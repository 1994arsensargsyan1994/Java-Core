package chessBoard.neww;

public class Rook extends Figure {
    char aChar = '\u2656';

    @Override
    public boolean canMove(Box box, Box box1) {
        return  true;

    }

    public Rook(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public Rook(ColorOfBox color){
        this.colors = color;
    }
    @Override
    public String toString() {
        return ""+aChar + " ";
    }
}
