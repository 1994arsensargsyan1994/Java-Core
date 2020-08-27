package egs.home25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        Stream.of(1,5,4,0,2.1,9,2,5)
                .collect(Collectors.collectingAndThen
                        (Collectors.toCollection(LinkedHashSet::new), ArrayList::new))
                           .forEach(s -> System.out.print(s + " ,"));
        System.out.println("_____________________________________________________________________________");
        final Set<Integer> elements = new HashSet<>();
        Stream.of(1, 2, 3, 1, 9, 2, 5, 3, 4, 8, 2)
                .collect(Collectors.partitioningBy(elements::add))
                .forEach((isUnique, list) -> System.out.format("%s: %s%n", isUnique ? "unique" : "repetitive", list));
    }
}
