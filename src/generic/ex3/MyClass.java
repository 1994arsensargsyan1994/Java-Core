package generic.ex3;

public class MyClass {
    public <T> void method(T argument){
        T var= argument;
        System.out.println(argument);
    }
}
class Main {
    public static void main(String[] args) {
  MyClass inst = new MyClass();
  inst.method("Hello World");
    }
}
