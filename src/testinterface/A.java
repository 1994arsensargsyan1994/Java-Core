package testinterface;

public interface A {
     int A = 5;
    void method();
    default void method1(){
        System.out.println("default method1");
    }
}
