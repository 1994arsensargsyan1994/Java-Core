package streamAPI.Istochniki;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,2,3).collect(Collectors.toList());
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        String s = Stream.of(1,2,3).map(String::valueOf).collect(Collectors.joining("-","<",">"));
        System.out.println(s);
        System.out.println("_________________________");
        int product = IntStream.range(0,10).filter((x)-> x++ % 4 ==0).reduce((a,b)-> a* b).getAsInt();
        System.out.println("product "+product);
        System.out.println();
        // findFirst it is get the first element in the Stream  for the parallel stream almost work findAny
        int first = IntStream.range(4,4598).findFirst().getAsInt();
        System.out.println("findFirst "+first);
        int firstParallel = IntStream.range(4,4598).findFirst().getAsInt();
        System.out.println("findFirst Parallel "+firstParallel);
        int any = IntStream.range(4,4598).findAny().getAsInt();
        System.out.println("findAny "+any);
        int anyParallel = IntStream.range(4,4598).parallel().findAny().getAsInt();
        System.out.println("parallel findAny "+anyParallel);

        System.out.println();
        // boolean allMatch(Predicate predicate)  this method get true if all elements satisfy condition predicate
        // if meet any element which predicate func. will be false then operator will stop browse  element and get false
        boolean result = Stream.of(1,2,3,4,5).allMatch((x)-> x <= 7);
        System.out.println("result  allMatch:" +result);
        System.out.println();
        boolean result1 = Stream.of(1,2,3,4,5).allMatch((x)-> x <= 3);
        System.out.println("result  allMatch: "+result1);
        System.out.println();
        // anyMatch(Predicate predicate) this is method get true if at least(gone) oan element satisfy condition  predicate if such element
        // the are in Stream it makes no sense to continue  so the result is immediately returned.
        boolean resultAnyMatch = Stream.of(1,2,3,4,5).anyMatch((x)-> x == 3);
        System.out.println("resultAnyMatch: "+resultAnyMatch);
        System.out.println();
        boolean resultAnyMatch1 = Stream.of(1,2,3,4,5).anyMatch((x)-> x == 8);
        System.out.println("resultAnyMatch: "+resultAnyMatch1);
        System.out.println();
        // noneMatch(Predicate predicate) tis method  having passed all  elements in Stream , no oan satisfy condition  predicate
        // get true... otherwise if any element predicate true the method get false.
        boolean resultNonMatch = Stream.of(1,2,3,4,5).noneMatch((x)-> x == 8);
        System.out.println("resultNonMatch: "+resultNonMatch);
        System.out.println();
        boolean resultNonMatch1 = Stream.of(1,2,3,4,5).noneMatch((x)-> x == 3);
        System.out.println("resultNonMatch: "+resultNonMatch1);
        System.out.println();
        // sum for IntStream result will be int ,for DoubleStream result will be double and for Long Stream result will be long
        long resultSum = LongStream.range(2,16).sum();
        System.out.println("sum the Stream elements : "+resultSum);
        // the are also  average () арифметическое всех элементов.
        System.out.println();
       /* IntSummaryStatistics summaryStatistics()
        Полезный метод примитивных стримов. Позволяет собрать статистику о числовой последовательности стрима, а именно:
         количество элементов, их сумму, среднее арифметическое, минимальный и максимальный элемент.
        */
        LongSummaryStatistics stats = LongStream.range(2, 16)
                .summaryStatistics();
        System.out.println("________________");
        System.out.println(stats);
        System.out.println("_____________________________________________________");
        System.out.format("  count: %d%n", stats.getCount());
        System.out.format("    sum: %d%n", stats.getSum());
        System.out.format("average: %.1f%n", stats.getAverage());
        System.out.format("    min: %d%n", stats.getMin());
        System.out.format("    max: %d%n", stats.getMax());
        System.out.println(" toString: "+stats.toString());
//   count: 14
//     sum: 119
// average: 8,5
//     min: 2
//     max: 15


    }
}
