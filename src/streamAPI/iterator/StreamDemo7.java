package streamAPI.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Allfa");
        list.add("Beta");
        list.add("Gama");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> stream = list.stream();
        Iterator<String> iterator = stream.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
