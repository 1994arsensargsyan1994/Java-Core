package myCollection.Mmcomarator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
MyComp mc = new MyComp();
  TreeSet<String> treeSet = new TreeSet<>(new MyComp()); // dzev 1
 //  TreeSet<String> treeSet = new TreeSet<>(mc.reversed());// dzev 2
      // TreeSet<String> treeSet = new TreeSet<>((aStr,bStr) -> bStr.compareTo(aStr) );// dzev 3
        treeSet.add("E");
        treeSet.add("C");
        treeSet.add("F");
        treeSet.add("A");
        treeSet.add("J");
        treeSet.add("D");
        treeSet.add("B");
        for (String temp :treeSet) {
            System.out.print(temp+ " ");
        }
        System.out.println();
    }
}
