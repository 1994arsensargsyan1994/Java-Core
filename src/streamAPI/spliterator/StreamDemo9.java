package streamAPI.spliterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Allfa");
        list.add("Beta");
        list.add("Gama");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");
        Stream<String> stream = list.stream();
        Spliterator<String> spliterator = stream.spliterator();
        Spliterator<String>spliterator2 = spliterator.trySplit();
        if (spliterator2 != null){
            System.out.println("Peзyль тaт , выводимый итератором splititr2 : ");
            spliterator2.forEachRemaining((n)-> System.out.println(n));
        }
        System.out.println("Peзyль тaт , выводимый итератором splititr: ");
        spliterator.forEachRemaining((n)-> System.out.println(n));

    }
}
