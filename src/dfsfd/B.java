package dfsfd;

public class B extends A{
    float f;

    @Override
    void f() {
        System.out.println("B::f()");
        System.out.println(f);
    }
    B(float f) {
        this.f = f;
      f();
    }
    void method(){
        System.out.println("B; mehod");
    }

}
