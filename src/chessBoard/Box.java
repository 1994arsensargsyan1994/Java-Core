package chessBoard;

public class Box  {
      static  int psi;
      @Override
      public String toString() {
            if (getPsi() % 2 == 0)
                  return ColorOfBox.valueOf("WHITE").name();
            else            // even row/odd column or odd row/even column
                  return ColorOfBox.valueOf("BLACK").name();
      }
      public static int getPsi() {
        return psi;
   }
      public static void main(String[] args) {
            Board board = new Board();
            Board.printtt();
      }

      }
