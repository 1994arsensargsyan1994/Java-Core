package Arsen;

public class DegreFunkc {
    public static int degre(int x,int y)
    {
        int tmp = 1;
        for (int i = 0; i < y ; i++) {
            tmp *= x;

        }
        System.out.println(tmp);
        return  tmp;
    }
    public static long fact(int value)

    {
        int a = 1;
        for (int i = value; i > 1 ; i--) {
       a *= i;

        }
        value = a;
        System.out.println(value);
        return  value;
    }
    public  static  void main(String args[]){
       int deg = degre(8,3);
        System.out.println();
     long log =  fact(16);
    }
}
