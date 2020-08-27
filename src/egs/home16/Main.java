package egs.home16;

import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        list.removeOfElement(2);
        System.out.println();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        MyLinkedList<String> listString = new MyLinkedList<>();
        listString.add("A");
        listString.add("B");
        listString.add("C");
        listString.add("E");
        Iterator<String> iterator = listString.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
