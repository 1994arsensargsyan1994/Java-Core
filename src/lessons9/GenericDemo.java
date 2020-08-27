package lessons9;

import Yntaciq.lesoons7.User;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<C> listC = new ArrayList<>();
        printElements(listA);
        printElements(listB);
        printElements(listC);
        // printElements(new ArrayList<D>());
        insertElementsNew(listA);
        insertElementsNew(listB);
       // insertElementsNew(listC);// karoxes avelacnel miayn B ev ir sumery
    }

    public static void printElements(List<? extends A> list) {    // ? sra ev extendi depqum           // get anelu hamar
        //    list.add(5);         chenq karox avelacner vorohetev chi karox haskanal inch tip avelacnel


    }

    public static void insertElementsNew(List<? super B> list) { // superov karoxes avelacnel
        //list.add(new A()); sxal
        list.add(new B());
        list.add(new C());
        //list.add(5);
        // avelacneluc karoxes amen inch avelacnel  vor kara lini B ev cadzr
        // get aneluc Object tipie berum
        Object object = list.get(1);
    }
}
class A{

}
class  B extends A{

}
class C extends B{

}
class D{}
