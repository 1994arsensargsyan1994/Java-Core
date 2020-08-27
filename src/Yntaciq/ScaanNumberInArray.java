package Yntaciq;

import java.util.Scanner;

public class ScaanNumberInArray {
    public  static  void numberinArray(int [] array){
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]= sca.nextInt();
          //  System.out.print(array[i]+" ");


        }
    }
    public  static  void printArray(int [] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ " ");

        }
    }
    public static void main(String[] args) {
        int array [] = new int [5];
        numberinArray(array);
        printArray(array);


    }
}
