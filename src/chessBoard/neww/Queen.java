package chessBoard.neww;

public class Queen extends  Figure {
    char aChar = '\u2655';

    @Override
    public boolean canMove(Box box, Box box1) {
        return  true;

    }

    public Queen(ColorOfBox color, int x, int y) {
        super(color,x,y);
    }
    public Queen(ColorOfBox color){
        this.colors = color;
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }

}
