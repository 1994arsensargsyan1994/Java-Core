package myCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedList =new LinkedList<>();
        list.add("Oan");
        list.add("Tow");
        list.add("Tree");
        list.add("For");
        linkedList.add("Oan");
        linkedList.add("Tow");
        linkedList.add("Tree");
        linkedList.add("For");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element =  iterator.next();
            System.out.print(element+ " ");
        }
        System.out.println();
        ListIterator <String>listIterator =linkedList.listIterator();
        while (listIterator.hasPrevious()){
           String element = listIterator.previous();
            System.out.print(element+ " ");
        }
    }
}
