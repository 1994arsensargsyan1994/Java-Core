import java.util.ArrayList;
import java.util.Scanner;

public class SS {
    public static boolean hasTeen(int a, int b, int c) {
        return (a > 13 && a < 19) ||
                (b > 13 && b < 19) ||
                (c > 13 && c < 19) ;

    }
    public  static int [] findElement(int[] array,int []array1) {
        int size = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array[i] == array1[j]) {
                    newArray[size++] = array1[j];
                    break;
                }
            }
        }
        int [] temp = new int[size];
        System.arraycopy(newArray,0,temp,0,size);
        newArray = temp;
        return newArray;
    }
    public  static  void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//      boolean is =   hasTeen(14,15,18);
//        System.out.println(is);
//        int [] array = new int[]{4,8,22,55,68,1,44};
//        int [] array1 = new int []{9,58,47,44,21,22};
//        print(findElement(array,array1));
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.remove("A");
        Scanner scanner = new Scanner(System.in);
        int n, p=1, ans=0;
        int [] d ={0,1};
         n = scanner.nextInt();
        while (n > 0)
        {
            ans += d[n%2] * p;
            p*=10;
            n/=2;
        }
        System.out.println(ans);
    }

    }
    class G{

    }

