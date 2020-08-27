package Arsen;

import java.util.Random;

public class MatrixArray {
    public  static  void scannArray(int [][] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                Random rand = new Random();
                array[i][j] = rand.nextInt(100);

            }

        }

    }
    public static void printArray(int [][] array)
    {
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");

            }
            System.out.println();

        }

    }



    public static void main(String[] args) {

        int [][] array1 = new int [3][];
        int [][] array3 = new int [3][6];
        int [][] array2 ={{1,2,9},{6,-8,0,1}};
        array1[0] = new int [4];
        array1[1] = new int [2];
        array1[2] = new int [3];
        scannArray(array1);
        printArray(array1);
        System.out.println("_______________________________________________________________");
        printArray(array2);
        System.out.println("_______________________________________________________________");
        scannArray(array3);
        printArray(array3);
    }

}
