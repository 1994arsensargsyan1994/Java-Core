package chessBoard.neww;

public class Knight extends  Figure {
    char aChar = '\u2658';

    @Override
    public boolean canMove(Box box, Box box1) {
        return  true;

    }

    public Knight(ColorOfBox color, int x, int y) {
        super(color, x, y);
    }

    public Knight(ColorOfBox color){
        this.colors = color;
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }

}
