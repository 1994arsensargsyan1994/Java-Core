package generic.ex1;

public class MyClass<T> {
    T field;
    public  void method(){
        System.out.println(field.getClass());
    }
}
class  Main{
    public static void main(String[] args) {
        MyClass<String> inst = new MyClass<>();
        inst.field = "Hello";
        inst.method();
        MyClass<Integer> inst1 = new MyClass<>();
        inst1.field = 1234;
        inst1.method();
    }
}
