package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("StreamApi");
        list.add("St");
        list.add("StA");
        IntStream.of(120,410,85,32,314,12).filter((x)->x <300)
                                           .map((x)->x+11)
                                            .limit(3)
                                             .forEach((x)-> System.out.print(x+" "));
        System.out.println();
        Stream<String> stream= list.stream();
        stream.forEach(System.out::println);
        stream.filter((s)->s.contains("StreamApi"));
        stream.forEach(System.out::println);
    }
}
