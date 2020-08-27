package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("4");
        set.add("7");
        set.add("0");
        set.add("56");
        set.add("16");
        System.out.println(set.add("45"));
        System.out.println(set.add("45"));
        System.out.println(set.size());
        for (String s:set) {
            System.out.println(s);
         }
        Iterator<String> iterator = set.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
