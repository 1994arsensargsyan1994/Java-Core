package Yntaciq.practic;

import java.util.Random;

public class ArrayPractic {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void generateiRandonNumber(int limit, int saize) {
        Random random = new Random();
        int[] array = new int[saize];
        for (int i = 0; i < saize; i++) {
            array[i] = random.nextInt(limit);
        }
        print(array);
    }

    public static void sortArrayOddAndEven(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            if (array[i] % 2 == 0 && array[j] % 2 == 0) {
                while (array[j] % 2 == 0 && j < array.length - 1) {
                    j++;
                }
            }
            swap(array, i + 1, j);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            if (array[i] % 2 != 0 && array[j] % 2 != 0) {
                while (array[j] % 2 != 0 && j < array.length - 1) {
                    j++;
                }
            }
            swap(array, i + 1, j);
        }
    }

    public static void generateiRandonNumber(int limit, int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(limit);
        }
    }


}
