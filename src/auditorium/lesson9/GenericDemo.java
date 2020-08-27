package auditorium.lesson9;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<C> listC = new ArrayList<>();
        C c = listC.get(1);

//        printElements(listA); compile time error
        printElements(listB);
        printElements(listC);
//        printElements(new ArrayList<D>());

        insertElements(new ArrayList<Object>());
        insertElements(listA);
        insertElements(listB);
//        insertElements(listC); compile time error

    }

    private static void printElements(List<? extends B> list) {
//        list.add(new A());
        for (A a : list) {
            System.out.println(a);
        }
    }

    private static void insertElements(List<? super B> list) {
//        list.add(new A());  compile time error
        list.add(new B());
        list.add(new C());
        Object object = list.get(1);
    }

    private static void inheritMethodDemo(A a) {

    }
    // leksikografik kerpov
    public static <T extends Number> T test(T val1, T val2) {
        return val1.longValue() > val2.longValue() ? val1 : val2;
    }

}

class A {
}

class B extends A {
}

class C extends B {
}

class D {
}