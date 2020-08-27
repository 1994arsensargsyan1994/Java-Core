package chessBoard.neww;

public class Bishop extends  Figure {
    char aChar = '\u2657';

    @Override
    public boolean canMove(Box box, Box box1) {
        return  true;

    }


    public Bishop(ColorOfBox color, int x, int y) {
        super(color,x,y);
    }
    public Bishop(ColorOfBox color){
        this.colors = color;
    }
    @Override
    public String toString() {
        return ""+aChar+" ";
    }
}
