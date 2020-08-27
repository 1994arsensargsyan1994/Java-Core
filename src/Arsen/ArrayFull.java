package Arsen;


import java.util.Random;

public class ArrayFull {

    public static void printArray(int [] array )
    {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i <array.length ; i++) {
            str.append(array[i]);
            if (i != array.length-1)
            {
                str.append(",");
            }



        }
        str.append(" ]");
        System.out.print(str);
    }
    public  static  void scannArray(int [] array)
    {
        for (int i = 0; i < array.length; i++) {
            Random  rand = new Random();
            array[i] = rand.nextInt(100);
            System.out.println();


        }

    }

    public static void main(String[] args) {
        int []array1 = new int [10];
        int []array2 = new int [10];
        scannArray(array1);
        scannArray(array2);
        printArray(array1);
        System.out.println();
        printArray(array2);


    }
}
