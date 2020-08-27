package myCollection;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet <String>hashSet = new HashSet<>();
        System.out.println(hashSet.size());
        hashSet.add("Oan");
        hashSet.add("tow");
        hashSet.add("tree");
        hashSet.add("for");
        hashSet.add("five");
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Oan"));
        hashSet.remove("Oan");
        System.out.println(hashSet.contains("Oan"));
        System.out.println(hashSet);
    }
}
