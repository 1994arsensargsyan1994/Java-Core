package arsen_sargsyan.homework1;

public class MathUtil {
    public static void main(String[] args) {
        System.out.println("Pow = " + pow(8, 2));
        System.out.println("gcd = " + gcd(10, 1362));
        System.out.println("faktoryal = " + factorial(5));
        System.out.println("absalut  = " + abs(8));
        System.out.println("Revers = "+ reverse(1243));

        System.out.println("Binar = "+ printIntAsBinary(55));

    }

    public static int pow(int a, int n) {
        int value = 1;
        for (int i = 0; i < n; i++) {
            value *= a;

        }
        System.out.println(value);

        return value;
    }

    public static int gcd(int x, int y) {
        while (y > 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(x);
        return x;

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;

        }
        System.out.println(fact);

        return fact;
    }

    public static int abs(int number) {
        if (number > 0)
            return number;
        else
            number *= -1;


        return number;
    }

    public static int reverse(int number) {
        int res = 0;
     while (number != 0)
     {
         //temp = number % 10;
         res = res * 10+ number % 10;
         number /= 10;

        }
        System.out.println(res);
        return res;
    }
    public static String printIntAsBinary(int n) {


            String s = "";
            while (n > 0)
            {
                s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
                n = n / 2;
            }
        System.out.println(s);
            return s;
        }

    }


