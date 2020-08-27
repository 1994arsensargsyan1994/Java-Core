package Yntaciq.calme;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.calme();
        r = b;
        r.calme();
        r = c;
        r.calme();
    }
}