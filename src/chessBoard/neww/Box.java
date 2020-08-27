package chessBoard.neww;

import stackutill.StackEmptyException;

public class Box {
    ColorOfBox color;
    protected  Figure figure;
    protected boolean empty;
    protected int x;
    protected int y;
//    static Figure[][] arrayOfFigure = new Figure[8][8];
    static int psi;

    public Box(int x ,int y) {
          this.x = x;
          this.y = y;
    }


    public Box(ColorOfBox color) {
        this.color = color;
    }

    public Box(boolean empty, int x, int y) {
        this(x,y);
        this.empty = empty;

    }

    public Box(Figure figure, boolean empty, int x, int y) {
        this(x,y);
        this.figure = figure;
        this.empty = empty;
    }

    public ColorOfBox getColor() {
        return color;
    }

    public void setColor(ColorOfBox color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
    public void setFigure(Figure figure,int a,int b) {
        this.figure = figure;
    }
    public void setCord(int a,int b){
        setX(a);
        setY(b);
    }

    public boolean isEmpty() {
        return (empty);
    }

    @Override
    public String toString() {
        if (getPsi() % 2 == 0) {
            return ColorOfBox.valueOf("WHITE").name();
        } else            // even row/odd column or odd row/even column
            return ColorOfBox.valueOf("BLACK").name();
    }

    public static int getPsi() {
        return psi;
    }
static void method(Figure figure,int index1,int index2){
      Board.array[index1][index2].setFigure(figure);
  }

}
