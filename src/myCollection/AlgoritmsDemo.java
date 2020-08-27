package myCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgoritmsDemo {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        aList.add(-8);
        aList.add(20);
        aList.add(8);
        aList.add(-20);
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(aList,comparator);
        for (int a: aList) {
            System.out.print(a+" ");
        }
        System.out.println();
        Collections.shuffle(aList);
        for (int a: aList) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("max"+ Collections.max(aList));
        System.out.println("min"+ Collections.min(aList));
    }
}
