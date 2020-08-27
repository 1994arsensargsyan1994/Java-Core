package egs.less2;

public class Calculator {
    public static double add(double num, double num1) {
        if (num1 == 0) {
            return num;
        }
        return num + num1;
    }

    public static double div(double num, double num1) {
        if (num1 < 0) {
            return Integer.MIN_VALUE;
        }
        return num / num1;
    }

    public static double sub(double num, double num1) {
        if (num1 == 0) {
            return num;
        }
        return num - num1;
    }

    public static double mul(double num, double num1) {
        if (num1 == 0) {
            return 0;
        }
        return num * num1;
    }

    public static void main(String[] args) {
        System.out.println(" num + num1 = " + add(5, 5));
        System.out.println(" num / num1 = " + div(10, 3));
        System.out.println(" num - num1 = " + sub(10, 0));
        System.out.println(" num * num1 = " + mul(5, 8));
        System.out.println("_____________________________");
        int[] array = new int[]{5, 8, 6, 22, 56, 89, 87};
        System.out.println("sum array = " + sumOfArray(array));
        System.out.println("_____________________________");
        int array1[][] = new int[][]{
                {1, 2, 6},
                {2, 6, 9},
                {9, 5, 2}
        };
        System.out.println("sum Of Array Diaganal = " + sumOfArrDia(array1));
    }

    public static int sumOfArray(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int sumOfArrDia(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
