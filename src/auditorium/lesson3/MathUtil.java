package auditorium.lesson3;

public class MathUtil {

    public static void printIntAsBinary(int value) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(value >> i & 1);
            if (i % 8 == 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int reverse (int number) {
        int res = 0;
        while (number != 0) {
            res = res * 10 + number % 10;
            number = number / 10;
        }
        return res;
    }

}
