package myCollection;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("F");
        treeSet.add("D");
        treeSet.add("O");
        treeSet.add("C");
        treeSet.add("B");
        System.out.println(treeSet);
        System.out.println(treeSet.subSet("A","D"));
        System.out.println(treeSet.tailSet("B"));
        System.out.println(treeSet);
    }
}
