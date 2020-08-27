package arsen_sargsyan.arrayUtil;
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
    public  static void sortByOddAndEven(int[] arr) {
        // use the swap method to swap  two elements with i and j indexes  of the specified  Array.
        //int j = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                while (arr[j] % 2 == 0 && j < arr.length - 1) {
                    j++;
                }
                swap(arr, j, i + 1);
            } else if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                while (arr[j] % 2 != 0 && j < arr.length - 1) {
                    j++;
                }
                swap(arr, j, i + 1);
            }
        }
    }

    /**
     * Get maximum int value from array
     */
    public static int getMaximum(int[] array) {
//        TODO   implement
        int max =array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
            {
                max = array[i];

            }

        }
        return max;   // this must be replaced by correct code
    }

    /**
     * Get minimum int value from array
     */
    public static int getMinimum(int[] array) {
//        TODO implement
        int min =array[0];

        for (int i = 0; i < array.length; i++) {
            if (min  > array[i])
            {
                min = array[i];

            }

        }
        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of
     * <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];

        }
//        TODO implement
        return sum;   // this must be replaced by correct code
    }

    /**
     * Reverse specified array
     */
    public static int[] reverse(int[] array) {
//        TODO implement
        for(int i=0; i<array.length-1; i++){
            for (int j = 0; j <array.length-i-1 ; j++) {
                swap(array, j, j+ 1);
            }
        }

            return array;   // this must be replaced by correct code
        }


    private static void swap(int[] array, int i,int j) {
      //  TODO implement
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
        // todo implement
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }
}

