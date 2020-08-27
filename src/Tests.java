public class Tests {
    public static void main(String[] args)
            throws java.io.IOException {
        char choise;
        int prabel = 0;
        System.out.println("greq << . >>tochka durs galiu hamar");

        do {
            choise=(char)System.in.read();
            if (choise == ' ')
            {
                prabel++;
            }
        }while (choise != '.');
        System.out.println("probelneri  qanaky"+prabel);
//        int arrayA[][] = new int[4][5];
//        int k = 0;
//        for (int i = 0; i < 4; i++) {
//
//            for (int j = 0; j < 5; j++) {
//              //  arrayA[i][j] = (int) (Math.random() * 15);  // sluchayni chislo
//                  arrayA[i][j]  = k; //0 mijev 19
//                 k ++;
//
//            }
//
//
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.printf(arrayA[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("_____________________________________________________");
//        System.out.println();
//        int b = 0;
//        int array2[][] = new int[4][];
//        array2[0] = new int[1];
//        array2[1] = new int[2];
//        array2[2] = new int[3];
//        array2[3] = new int[4];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <i +1; j++) {
//                array2[i][j] = b;
//                b++;
//
//            }
//
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.printf(arrayA[i][j] + " ");
//
//            }
//            System.out.println();
//        }
        }
    }

