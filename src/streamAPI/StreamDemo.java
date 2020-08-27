package streamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(77);
        mylist.add(62);
        mylist.add(5);
        mylist.add(17);
        mylist.add(25);
        mylist.add(42);
        System.out.println("initial list :"+mylist);
        Stream<Integer> myStream= mylist.stream();
        Optional<Integer> myMin = myStream.min(Integer::compare);
        if (myMin.isPresent()){
            System.out.println("Min: "+myMin.get());
        }
        myStream = mylist.stream();
        Optional<Integer> myMax = myStream.max(Integer::compare);
        if (myMax.isPresent()) System.out.println("Max: "+myMax.get());
        Stream<Integer> sortedStream = mylist.stream().sorted();
        System.out.print("sorted Stream: ");
        sortedStream.forEach((n)-> System.out.print(n + " "));
        System.out.println();
        Stream<Integer> oddVal = mylist.stream().filter((n)->(n % 2)==1);
        System.out.print("odd Val stream: ");
        oddVal.forEach((n)-> System.out.print((n)+" "));
        System.out.println();
        oddVal=mylist.stream().filter((n)->(n % 2)==1).filter((n)->n > 5);
        System.out.print("Odd and max 5 stream: ");
        oddVal.forEach((n)-> System.out.print(n+ " "));
        System.out.println();
    }

}
