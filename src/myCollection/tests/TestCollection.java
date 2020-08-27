package myCollection.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestCollection<T> {
    public  static <T>Collection<T> symmetric(Collection<T>a,Collection<T> b){
        Collection<T> ins = new ArrayList<>(a);
        ins.retainAll(b); // erkus megel ka 3,4,5
        Collection<T> result = new ArrayList<>(a);
        result.addAll(b);//
        result.removeAll(ins); // jnjel ins mej exac elemetnery 3,4,5
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
        List<String> list1 = new ArrayList<>(Arrays.asList("3","4","5","6","7"));
        Collection<String> c = symmetric(list,list1);
        System.out.println("Coll list = "+Arrays.toString(list.toArray()));
        System.out.println("Coll list1 = "+Arrays.toString(list1.toArray()));
        System.out.println("Coll c = "+Arrays.toString(c.toArray()));
    }
}
