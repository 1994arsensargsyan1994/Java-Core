package streamAPI.spliterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Allfa");
        list.add("Beta");
        list.add("Gama");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> stream = list.stream();
        Spliterator<String>  spliterator = stream.spliterator();
       while (spliterator.tryAdvance((n)-> System.out.println(n)));
        System.out.println("____________________________________");
       //  spliterator.forEachRemaining((n)-> System.out.println(n));   // equals up
    }
}
