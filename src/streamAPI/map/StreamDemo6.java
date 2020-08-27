package streamAPI.map;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(5.1);
        arrayList.add(1.1);
        arrayList.add(3.3);
        arrayList.add(12.5);
        arrayList.add(5.0);
        System.out.println("initial list ");
        arrayList.stream().forEach((a)-> {
            System.out.print(a+" ");
        });
        System.out.println();
        IntStream intStream = arrayList.stream().mapToInt((a)-> (int)Math.ceil(a));
        intStream.forEach((a)->{
            System.out.print(a + " ");
        });
    }
}
