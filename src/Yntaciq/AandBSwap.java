package Yntaciq;

import java.util.Scanner;

public class AandBSwap {
    public static void main(String[] args) {
        int b = 5;
        int a = 3;
        a = a + b;
        b = a - b;
        a = a -b;
        System.out.print(a + " "+ b +"\n");
        int max = 0;
        int  c = 1;
        max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println(max);
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        System.out.println(numberofdilay(a));





    }
    public  static  int numberofdilay(int n){
        int k = 0;
        while (n > 0){
            n = n / 10;
            k ++;
        }

        return  k;
    }

}
