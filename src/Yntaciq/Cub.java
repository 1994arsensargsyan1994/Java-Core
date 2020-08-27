package Yntaciq;

import java.util.Random;

public class Cub {

    public static void main(String[] args) {
        int[] array = new int[100];
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        String temp = "";
        String temp2 = "";
        String temp3 = "";
        int value = 1;
        for (int i = 0; i < 100; i++) {
           array1[i] = i * i;
            temp += array1[i];
            temp += ", ";


        }
        System.out.println(temp);
        System.out.println();
        System.out.println();

        for (int i = 0; i < 100; i++) {
            array2[i] = i * (i + 1) / 2;
            temp2 += array2[i];
            temp2 += ",";
        }
       System.out.println(temp2);
        System.out.println();
        System.out.println();
        for (int i = array1[0]; i <array1.length ; i++) {
            for (int j = array2[0]; j <array2.length ; j++) {
                if (array1[i] == array2[j]){
                    array[i] = array1[i];
                    temp3 += array[i];
                    temp3 += ",";
                }

            }

        }
        System.out.println(temp3);
    }
}
