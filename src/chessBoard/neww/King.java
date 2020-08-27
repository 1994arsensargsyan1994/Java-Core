package chessBoard.neww;

public class King extends Figure {
    char aChar = '\u265C';

    @Override
  public boolean canMove(Box box, Box box1) {
        if (box.getFigure() != null && box1.getFigure().getColors().equals(ColorOfBox.BLACK)){

        }
        return true;
    }

    public King(ColorOfBox color, int x, int y) {
           super(color,x,y);
    }
    public King(ColorOfBox color){
    this.colors = color;
    }
    @Override
    public String toString() {
        return ""+aChar+ " ";
    }


}
