package Yntaciq;

import java.util.Random;

public class Booble {
    public  static  void scanArray(int [] array){
        for (int i = 1; i < array.length; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(100);
            System.out.println();
        }

    }
    public  static  void printArray(int [] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
    public  static  void shortArrayMin(int [] array) {
        int temp = 0;
       for (int j = 0; j <array.length-1 ; j++) {
        for (int i = 1; i < array.length-i-1; i++) {     // array.length-j-1;
           if (array[i] > array[i+1]) {
               temp = array[i];
               array[i] = array[i + 1];
               array[i + 1] = temp;
           }

           }

        }
    }
    public  static  void shortArrayMax(int [] array) {
        int temp = 0;
        for (int j = 0; j <array.length-1 ; j++) {
            for (int i = 1; i < array.length-1; i++) {     // array.length-j-1;
                if (array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        scanArray(array);
        printArray(array);
        System.out.println();
        System.out.println("___________________________________");
        shortArrayMin(array);
        printArray(array);
        System.out.println();
        System.out.println("___________________________________");
        shortArrayMax(array);
        printArray(array);
    }

}
