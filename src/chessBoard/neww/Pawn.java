package chessBoard.neww;


public  class Pawn extends Figure {
    char aChar = '\u2659';

    @Override
    public boolean canMove(Box box, Box box1) {
        return  true;
    }

    public Pawn(ColorOfBox colors, int x, int y) {
        super(colors, x, y);
    }

    public Pawn(ColorOfBox color){
        this.colors = color;
    }

    @Override
    public String toString() {
        return ""+aChar+" ";
    }


}
