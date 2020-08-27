package chessBoard;

public class Board {
    Box box;
//    static  int psi;
    static Box[][] array = new Box[8][8];

    Board(Box box) {
        this.box = box;
    }

    Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = new Box();
            }
        }
    }

//    public static int getPsi() {
//        return psi;
//    }

    static void printtt() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Box.psi++;
                System.out.print(array[i][j] + "\t");
            }
            Box.psi ++;
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

//    @Override
//    public String toString() {
//                if (getPsi() % 2 == 0)
//                    return "White";
//                else            // even row/odd column or odd row/even column
//                    return "Black";
//    }
}



