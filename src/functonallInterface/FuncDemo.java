package functonallInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncDemo {
    public static void main(String[] args) {
        Function<Integer, String> intToString = Objects::toString;
        Function<String, String> quote = s -> "" + s + "";
           Function<Integer,String> quotIntToString = quote.compose(intToString);
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);
        Set<Integer> set = new HashSet<>(salaries.values());
        for (Integer s : set) {
            System.out.println(s);
        }
       Predicate<Integer> predicate =  a -> a > 10;
        System.out.println(predicate.test(5));
        int[]fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int fib3 = fibs[0]+ fibs[1];
            fibs[0]= fibs[1];
            fibs[1]= fib3;
            return result;
        });
        System.out.println(fibonacci.findAny());
        List<String> names =Arrays.asList("Johe","Smit","Barkli","Messi");
        names.forEach(name -> System.out.println(name + " Hello "));
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
        List<String> stringList = Arrays.asList("Mark","James","Diego","Mario","Ronald","Alive");
        List<String> namesWhitA = stringList.stream().filter(name  -> name.startsWith("A")).collect(Collectors.toList());
        for (String s : namesWhitA) {
            System.out.println(s);
        }
        List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);

        int sum = values.stream()
                .reduce(0, (i1, i2) -> i1 + i2);
        System.out.println(sum);



    }
}
