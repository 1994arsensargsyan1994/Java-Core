package myLamdaVirajena.lambdassilkainconstructor.ex2;

public class MyClass<T> {
private T val;

    public MyClass(T val) {
        this.val = val;
    }
    MyClass(){
        val = null;
    }
    T getVal(){
        return val;
    }
}
