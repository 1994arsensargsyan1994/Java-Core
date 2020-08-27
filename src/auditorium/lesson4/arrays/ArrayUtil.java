package auditorium.lesson4.arrays;

import java.util.Random;

/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {


    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the array
     */
    public static void sortByOddAndEven(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (((array[i] + array[i + 1]) % 2) == 0) {
                for (int j = i + 2; j < array.length; j++) {
                    if (((array[i] + array[j]) % 2) == 1) {
                        swap(array, i + 1, j);
                        break;
                    }
                }
            }
        }
    }

    public static int[] generateRandomIntArray(int limit, int length) {
        Random r = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(limit);
        }
        return array;
    }

    /**
     * Get maximum int value from array
     */
    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    /**
     * Get minimum int value from array
     */
    public static int getMinimum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    /**
     * Reverse specified array
     */
    public static int[] reverse(int[] array) {
//        TODO implement
        return null;   // this must be replaced by correct code
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            System.out.print(value + " ");
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
      
