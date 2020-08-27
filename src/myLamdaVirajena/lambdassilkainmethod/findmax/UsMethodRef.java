package myLamdaVirajena.lambdassilkainmethod.findmax;

import java.util.ArrayList;
import java.util.Collections;

public class UsMethodRef {
    static  int compareMc(MyClass a, MyClass b){
        return a.getVal()-b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass>al= new ArrayList<>();
       al.add(new MyClass(1));
       al.add(new MyClass(2));
       al.add(new MyClass(5));
       al.add(new MyClass(4));
       al.add(new MyClass(3));
       al.add(new MyClass(7));
        MyClass varMax = Collections.max(al,UsMethodRef::compareMc);
        System.out.println("Max val equal "+varMax.getVal());
    }
}
