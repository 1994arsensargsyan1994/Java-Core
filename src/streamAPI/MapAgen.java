package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAgen {
    public static void main(String[] args) {
     List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
     collection1.stream().map((s)-> s + "-1").collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("_________________________");
     //
        collection1.stream().mapToInt((s)->Integer.parseInt(s.substring(1))).forEach((s)->{
            System.out.print(s+ " ");
        });
        System.out.println("_______________________________");
        List<String> collection2 = Arrays.asList("1,2,0", "4,5");
        collection2.stream().flatMap((p)->Arrays.asList(p.split(",")).stream()).forEach(System.out::println);
        System.out.println("________________________");
       int sum = collection2.stream().flatMapToInt((p)->Arrays.asList(p.split(",")).
               stream().mapToInt(Integer::parseInt)).sum();
        System.out.println(sum);

    }
}
