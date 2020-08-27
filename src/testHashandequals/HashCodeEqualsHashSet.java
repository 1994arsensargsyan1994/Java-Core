package testHashandequals;

import java.util.*;

public class HashCodeEqualsHashSet {
    public static void main(String[] args) {

        Set<M> s = new HashSet<M>();
        s.add(new M("a"));
        s.add(new M("v"));
        Map<M,Integer> mIntegerMap = new HashMap<>();
        System.out.println("---------------------");
        mIntegerMap.put(new M("a1"), 3);
        mIntegerMap.put(new M("a2"), 2);
        for (M m : s) {
            System.out.println(m);
        }
        System.out.println("_______________________________________________");
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o, Object t1) {

                return 0;
            }
        };
        Set<M> setTree = new TreeSet<>();
        setTree.add(new M("a1"));
        setTree.add(new M("b1"));
        for (M m : setTree) {
            System.out.println(m);
        }
    }

}

class M implements  Comparable{
    String a;
    M(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (o==this) {
            System.out.println(this.a + " equals");
            return true;
        }
        M m = (M) o;
        if (Objects.equals(this.a,m.a))  {
            System.out.println(this.a + " equals");
            return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        System.out.println(this.a + " hashCode");
        return 1256;
    }

    @Override
    public String toString() {
        return "M{" +
                "a='" + a + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
