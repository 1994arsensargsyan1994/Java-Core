package myLamdaVirajena.lambdassilkainconstructor.ex2;

public class MyClass1 {
    String str;

    public MyClass1(String str) {
        this.str = str;
    }

    MyClass1() {
        str = "";
    }

    public String getStr() {
        return str;
    }

    static <R, T> R myClassFactor(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>, Double> mycons = MyClass<Double>::new;
        MyClass<Double> mc = myClassFactor(mycons, 100.1);
        System.out.println(mc.getVal());
        MyFunc<MyClass1, String> mycl1 = MyClass1::new;
        MyClass1 myClass1 = myClassFactor(mycl1, "Lambda");
        System.out.println(myClass1.getStr());
        String test = "abcd";
        test = test+test;
        System.out.println(test);
    }
}
