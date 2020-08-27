package chessBoard.neww;
  public abstract class  Figure  implements MoveFigure {
     protected ColorOfBox colors;
     protected int x;
     protected int y;

     public Figure() {
     }
//      void move(Box box,Box box1){
//         box = Board.array[1][1];
//         box1.getFigure().move(box,Board.array[1][3]);
//      }
public abstract boolean canMove(Box box,Box box1);

     public Figure(ColorOfBox colors, int x, int y) {
         this.colors = colors;
         this.x = x;
         this.y = y;
     }

     public ColorOfBox getColors() {
         return colors;
     }

     public void setColors(ColorOfBox colors) {
         this.colors = colors;
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

      @Override
      public String toString() {
          return null;
      }
     //abstract void move(byte firstNumber, byte firstLetter, byte secondNumber, byte secondLetter);
  }
