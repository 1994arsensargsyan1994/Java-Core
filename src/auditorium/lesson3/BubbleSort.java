package auditorium.lesson3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 53, 48, 31, 12};
        printArray(array);
        sort(array);
        printArray(array);

        int number = 5;
        testReference(number);
        System.out.println(number);
    }

    public static void testReference(int value) {
        System.out.println(value);
        value = value * 10;
        System.out.println(value);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
