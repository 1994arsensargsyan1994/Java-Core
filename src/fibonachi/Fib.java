package fibonachi;

public class Fib {
    public static int finNumber(int n){
        if (n <=  1 ){
            return n;
        }
        return finNumber(n-1) + finNumber(n-2);
    }

    public static void main(String[] args) {
        System.out.println("......");
        int a = finNumber(9);
        System.out.println(a);
    }
}
