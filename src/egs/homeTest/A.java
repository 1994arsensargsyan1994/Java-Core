package egs.homeTest;

public class A {
    public  static void swim(){
        System.out.println("can swim");
    }
    public  void eat(){
        System.out.println("can eat");
    }
    public static void play(){
        swim();
       // eat();
    }
}
class  B{
    public static void main(String[] args) {
        A b = new A();
        A a = null;
        a.play();
        System.out.println(square(120));
    }
    public static long square(int x) {
        long y = x * x;
        x = -1;
        return y;
    }
}
