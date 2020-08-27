package streamAPI.Istochniki;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream.empty().forEach(System.out::print); // empty Stream
        System.out.println("Arrays.asList");

        Arrays.asList(1,2,3).forEach(System.out::print); // the equal --
        System.out.println();
        System.out.println("Stream.of");

        Stream.of(1,2,3).forEach(System.out::print);
        System.out.println();
        System.out.println("ofNullable");


        // ofNullable if the parapet set null the get empty Stream otherwise get Stream in oan element
        String str = Math.random()>0.5?"I m feeling lucky": null;
        Stream.ofNullable(str).forEach(System.out::print);
        System.out.println();
        System.out.println(" generate(Supplier S) ");


        // generate(Supplier S) get Stream endless  sequence element  .. if want then limit write .limit()
        Stream.generate(()->6).limit(6).forEach(System.out::print);
        System.out.println();
        System.out.println("iterate(T send,UnaryOperator f )");


        // iterate(T send,UnaryOperator f ) get endless Stream which get according result the set func
        Stream.iterate(2,(x)-> x+6).limit(7).forEach(System.out::print);
        System.out.println();
        System.out.println("iterate(T send,Predicate hasNext,UnaryOperator f ) ");


        //iterate(T send,Predicate hasNext,UnaryOperator f )  that like for(i = seed;hashNext(i);i = f(i)){}
        //if hasNext get false cikl is end
        Stream.iterate(2,(x)-> x > 25,(x)-> x +6).forEach(System.out::print);
        System.out.println();
        System.out.println("concat");


        //concat unites the first go to A Stream then B Stream
        Stream.concat(Stream.of(1,2,3),Stream.of(4,5,6)).forEach(System.out::print);
        System.out.println();
        System.out.println("builder");


        // builder
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder().add(0).add(1);
        for (int i = 2; i <=8 ; i+=2) {
            streamBuilder.accept(i);
        }
        streamBuilder.add(9).add(10).build().forEach(System.out::print);
        System.out.println();
        System.out.println(" IntStream.range");


        // IntStream.range (int start,int end) also LongStream.range (long start,long end)
        IntStream.range(0,10).forEach(System.out::print);
        System.out.println();
        System.out.println("IntStream.rangeClosed (int start,int end)");




        // IntStream.rangeClosed (int start,int end) also LongStream.rangeClosed (long start,long end)
        IntStream.rangeClosed(0,5).forEach(System.out::print);
        System.out.println(" also LongStream.rangeClosed (long start,long end)");

        LongStream.rangeClosed(-8L,-5L).forEach(System.out::print);
        System.out.println();
        // skip  n element Stream
        System.out.println(" skip ");
        System.out.println();
        Stream.of(120,410,85,32,314,12).skip(2).forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        // sorted() and sorted(Comparator comp)  this is sorted Stream elements if Stream already sorted then not be sorted
        System.out.println("sorted");
        System.out.println();
        Stream.of(120,410,85,32,314,12).sorted().forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        System.out.println("sorted (Comparator com)");
        System.out.println();
        Stream.of(120,410,85,32,314,12).sorted(Comparator.naturalOrder()).forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        // distinc  Replicate Element and get uniq Stream
        System.out.println("distinc uniq element Stream ");
        System.out.println();
        Stream.of(2,1,8,3,2).distinct().forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();

        System.out.println("-----------------------------");
        System.out.println();
        IntStream.concat(IntStream.range(2,5),
                          IntStream.range(0,4)).distinct().forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        // Выполняет действие над каждым элементом стрима и при этом возвращает стрим с элементами исходного стрима.
        // Служит для того, чтобы передать элемент куда-нибудь, не разрывая при этом цепочку операторов
        // (вы же помните, что forEach — терминальный оператор и после него стрим завершается?), либо для отладки.
        System.out.println("peek");
        System.out.println();
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));
// before distinct: 0
// after distinct: 0
// after map: 0
// before distinct: 3
// after distinct: 3
// after map: 9
// before distinct: 1
// after distinct: 1
// after map: 1
// before distinct: 5
// before distinct: 0
// before distinct: 5
// after distinct: 5
// after map: 25
        System.out.println();
        //takeWhile(Predicate pred) since java 9 ...get elements before it is satisfy condition it is like a limit () method
        System.out.println("takeWhile(Predicate pred)");
        System.out.println();
        Stream.of(1,2,3,4,2,5).takeWhile((x)->x < 3).forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        //dropWhile((Predicate pred) since java 9 ... skips elements before it is satisfy condition then get Stream elements
        // it is method like a skip() method
        System.out.println("dropWhile((Predicate pred)");
        System.out.println();
        Stream.of(1,2,3,4,5).dropWhile((n)-> n < 4).forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        // boxed() Converts a primitive stream to an object stream
        System.out.println("boxed() Converts a primitive stream to an object stream");
        System.out.println();
        DoubleStream.of(0.1,Math.PI).boxed().map(Object::getClass).forEach((n)->{
            System.out.print(n+ " ");
        });
        System.out.println();
        System.out.println("forEach_______________________________");
      Stream.of(120,410,85,32,314,12).forEach((x)-> System.out.format("%s,",x));
        System.out.println();
        System.out.println("forEachOrdered");
        System.out.println("whit out forEachOrdered ");
        System.out.println();
        IntStream.range(0,100000).parallel().filter((x)->x % 10000==0).map((x)->x /10000).forEach(System.out::print);
        System.out.println();
        System.out.println("whit  forEachOrdered ");
        System.out.println();
        IntStream.range(0,100000).parallel().filter((x)->x % 10000==0).map((x)->x /10000).forEachOrdered(System.out::print);


    }
}
