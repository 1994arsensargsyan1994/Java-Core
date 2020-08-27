package egs.less1;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age=9;
        method(h1);
        System.out.println(h1.age);
    }
    static  void method(Human h1){
        h1.age = 30;
        h1 = null;
    }
}
