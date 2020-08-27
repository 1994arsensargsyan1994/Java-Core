import java.util.Scanner;
// tnayin 10
public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("greq skizby");
        int a = sc.nextInt();
        System.out.println("greq verjy");
        int b = sc.nextInt();
        for (int i = a+1; i <  b; i++) {
            System.out.println("i = " + i +" , ");
            sum = sum + i ;
            count ++;
        }
        int result = sum / count;
        System.out.println("a ic b yngac tveri gumary = " + sum);
        System.out.println("mijin tvabanakany = " + sum +"/" +count + "= " + result ) ;


        System.out.println();
        System.out.println();
        System.out.println("____________________________________________");
        System.out.println();
        int sumI=0;
        for (int i = 1; i <=100 ; i++) {
            if (i % 9 == 0)
            {
                continue;
            }
            else
            {
                sumI = sumI + i;
            }
            System.out.printf(sumI + " ");

        }

    }
}