package myLamdaVirajena.lambdassilkainconstructor;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myFunc = MyClass::new;
        MyClass myClass = myFunc.func(100);
        System.out.println(myClass.getX());
    }
}
