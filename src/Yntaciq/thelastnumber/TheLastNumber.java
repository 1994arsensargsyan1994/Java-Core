package Yntaciq.thelastnumber;

import java.util.Scanner;

public class TheLastNumber {
    public static void main(String[] args) {
        lastNumber(4);
        allLastNumber(2, 4);
        factTheLastNumber(4);
        fibTheLastNumber(6);
        numbers(1248);
        bestArg(1000);
        bestArg1(122488);
        System.out.println();
        printMltiply();
        System.out.println("______________________");
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
    }

    public static void lastNumber(int n) {
        int[] a = new int[]{6, 2, 4, 8};
        System.out.println(a[n % 4]);
    }

    public static void allLastNumber(int a, int n) {
        int[][] array = new int[][]{{0, 0, 0, 0,},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9},
        };
        System.out.println(array[a % 10][n % 4]);
    }

    public static void factTheLastNumber(int n) {
        if (n >= 5) {
            System.out.println("0");

        } else if (n == 3) {
            System.out.println("6");
        } else
            System.out.println(n);
    }

    public static void fibTheLastNumber(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = (a + b) % 10;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    public static void numbers(int number) {
        String m = "";
        while (number != 0) {
            m += number % 10;
            number = number / 10;
        }
        System.out.println(m);
    }

    public static void bestArg(int number) {
        int m = 0;
        int k0 = 0;
        int k1 = 0;
        while (number != 0) {
            m = number % 10;
            if (m == 0) {
                k0++;
            }
            if (m == 1) {
                k1++;
            }
            number = number / 10;
        }
        System.out.println(k0 + " " + k1);
    }

    public static void bestArg1(int number) {
        int m = 0;
        int[] array = new int[10];
        for (int i = 0; i < 9; i++) {
            array[i] = 0;
        }
        while (number != 0) {
            m = number % 10;
            array[m] = array[m] + 1;
            number = number / 10;
        }
        System.out.print("0 1 2 3 4 5 6 7 8 9 ");
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            System.out.print(array[i] + " ");
            if (i == 9) {
                System.out.print(" hat");
            }
        }
    }

    public static void printMltiply() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print( j * i + "\t");
            }
            System.out.println();
        }
    }

}
