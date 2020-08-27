package streamAPI.parallelStream;

import java.util.ArrayList;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.5);
        list.add(8.5);
        list.add(44.5);
        double cor = list.parallelStream().reduce(1.0,(a,b)->a * Math.sqrt(b),
                                                        (a,b)->a*b);
        System.out.println(cor);

    }
}
