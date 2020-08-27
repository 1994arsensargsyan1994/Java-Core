package chessBoard.neww;

import chessBoardnew.Color;

public class Board {
    private static Board board = null;
   ColorOfBox color;
    public ColorOfBox getColor() {
        return color;
    }

   static Box[][] array = new Box[8][8];

    Board() {
     int   temp = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (temp % 2 == 0) {
                    array[i][j]= new Box(ColorOfBox.WHITE);
                }  else {
                    array[i][j] = new Box(ColorOfBox.BLACK);
                }
                temp++;

            }
            temp++;
        }
    }
    Board(boolean istrue){

    }

    void printtt() {
        int index = 1;
        System.out.println("\tA\tB\tC\tD\tE\tF\tG\tH");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(index++ +"    ");
            for (int j = 0; j < 8; j++) {
                  if (array[i][j].getFigure() == null && array[i][j].getColor().name().equals("BLACK")) {
                      System.out.print(ConsoleColors.BLACK + array[i][j].getColor().toString().substring(0, 1) + "\t");
                  }
                     else if (array[i][j].getFigure()  == null && array[i][j].getColor().name().equals("WHITE")){
                          System.out.print(ConsoleColors.WHITE+array[i][j].getColor().toString().substring(0,1)+"\t");
                      }
                  else {
                      System.out.print(array[i][j].getFigure().toString()+ "  ");
                  }
            }
            System.out.println();
            System.out.println();
        }
    }
}




