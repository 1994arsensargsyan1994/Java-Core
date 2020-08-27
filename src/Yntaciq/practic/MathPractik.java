package Yntaciq.practic;

public class MathPractik {
    public static int pow(int a,int n){
        int value = 1;
        for (int i = 0; i <n; i++) {
            value *= a;

        }
        System.out.println(value);
        return  value;
    }
    public  static  long factorial(int f){
        int fact = 1;
        for (int i = f; i >1 ; i--) {
           fact *= i;

        }
        System.out.println(fact);
        return fact;
    }
    public  static  long rekurcfactorial(int number){
     if (number ==1){
         return number;
     }
     return number * rekurcfactorial(number-1);

    }
    public  static int gcd(int number){
        if (number > 0)
            return number;
        else number *= -1;
        System.out.println(number);
        return number;
    }
        public static int revers(int number){
        int res = 0;
       while (number != 0){
         res = res * 10 + number % 10;
         number /= 10;
       }
            System.out.println(res);
       return res;
        }
    public static void printIntAsBinary(int value) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(value >> i & 1 );
            if (i % 8 == 0){
                System.out.print("\t");
            }

        }
        System.out.println();
    }
}
