package auditorium;

public class A {

    int a = 45;

    protected final int c;

    public A() {
        m3();
        this.c = 123;
    }

    protected void m1() {
        System.out.println("A#m1");
    }

    public void m2() {
        System.out.println("A#m2");
    }

    void m3() {
        System.out.println(a);
        System.out.println("A#m3");
    }

    private void m4() {
        System.out.println("A#m4");
    }

}

class B extends A {
    int a = 12;
    int b = 12;

    public B() {
        super();
    }

    void testPrivateField() {
        System.out.println(this.a);
        System.out.println(super.a);
    }

    @Override
    public void m1() {
        System.out.println("B#m1");
    }

    @Override
    public void m2() {
        System.out.println("B#m2");
    }

    @Override
    public void m3() {
        System.out.println(a);
        System.out.println("B#m3");
    }

    private void m4() {
        System.out.println("B#m4");
    }

    public void m5() {
        System.out.println("B#m5");
    }
}

class Main {
    public static void main(String[] args) {

        A a = new A();
        if (a instanceof B) {
            B v = (B) a;
            v.m5();
        }
//        a.m3();
//        a.m2();
        A b = new B();
//        b.m3();
//        b.m2();
       if (b instanceof B) {
           ((B)b).m5();
           B c = (B) b;
           c.m5();
       }
        //B c = new A(); // can not do like this


    }
}