package streamAPI.reduce;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(77);
        mylist.add(62);
        mylist.add(5);
        mylist.add(17);
        mylist.add(25);
        mylist.add(42);
        System.out.println("initial list :"+mylist);
        Optional<Integer> sum = mylist.stream().reduce((a,b)->(a * b));
        if (sum.isPresent()) System.out.println("sum "+sum.get());
        int res = mylist.stream().reduce(1,(a,b)->(a * b));
        System.out.println("sum "+res);
        int evven = mylist.stream().reduce(1,(a,b)->{
            if (b%2==1)return a*b;
            else return  a;

             });
        System.out.println("evven "+evven);
    }
}
