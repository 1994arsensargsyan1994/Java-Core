package myLamdaVirajena.lambdazaxvatperemeni;

public interface MyFunc {
    int func(int n);
}
class VapCapture{
   static int b = 5;
    public static void main(String[] args) {
        int num = 10;
        MyFunc myFunc = (n) -> {
            int v= num+n;
            int l=b +n;
           //num++;//Variable used in lambda expression should be final or effectively final
            b++;
           return  v+l;
        };
        //num=9;  // error  petqe lambda uum lini verjnakn vichaky
        b = 9;
        System.out.println(myFunc.func(5));
    }

}

