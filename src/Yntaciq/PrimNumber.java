package Yntaciq;

import java.util.Scanner;

public class PrimNumber {


    public static void main(String[] args) {
        int tmp = 0;
        int array [] = new int []{14, 7, 9, 11, 23,13,19};


        for (int i = 0; i < array.length ; i++) {
            array[i] = array[i] % 2 - (array[i]+1) % 2;
            System.out.print(array[i]+ " ");
            tmp += array[i];


        }
        System.out.println();
        System.out.println(tmp);
        System.out.println();
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Mijev cikly");
        int a = sc.nextInt();
        do {
             a = sc.nextInt();
        }while (a != 0);





        }
    }

