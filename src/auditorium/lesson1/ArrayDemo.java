package auditorium.lesson1;

public class ArrayDemo {

    public static void main(String[] args) {
        //0  1  2  3
//        int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {-1, -2, -3, -4456};
//        int[] array3 = {456, 5852, 982, 124547, -454};
//        int[] array4 = {456, 5852, 982, 124547, -454, -4121};
//        int[] array5 = {456, 5852, 982, 124547, -454, -4121, 87};
//
//
//        printArray(array1);
//        printArray(array2);
//        printArray(array3);
//        printArray(array4);
//        printArray(array5);
//
//        int[] array1 = new int[]{1, 2, 3, 4};
//        int[] array2 = new int[10];
//
//        int a = 45;
//
//        System.out.println("array length is equal " + array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("array[" + i + "] - " + array[i]);
//        }
//        printArray(array2);
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = i * 2;
//        }
//        printArray(array2);
//
//        long l = factorial(5);
//        long ll = factorial(10);
//        long fact = factorial(15);
//
//        System.out.println("factorial 5 is equal " + l);
//        System.out.println("factorial 10 is equal " + ll);
//        System.out.println("factorial 15 is equal " + fact);
//
//        long p = pow(5, 2);
//
//        System.out.println("x pow y : " + p);

        int[][] array = {{-1}, {1, 2, 5}, {45, 78, 963, 456}};

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print("arr[" + i + "][" + j + "] : " + array[i][j] + ", ");
//            }
//            System.out.println();
//        }

        int [][] arr = new int[3][4];

        java.util.Random random = new java.util.Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print("arr[" + i + "][" + j + "] : " + arr[i][j] + ", ");
            }
            System.out.println();
        }

    }

    public static long pow(int x, int y) {
        long sum = 1;
        for (int i = 0; i < y; i++) {
            sum *= x; // <==> sum = sum * x
        }
        return sum;
    }

    public static long factorial(int value) {
        long sum = 1;
        for (int i = value; i >= 1; i--) {
            sum = sum * i;
//            if (i == 12) {
//                return 12;
//            }
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
