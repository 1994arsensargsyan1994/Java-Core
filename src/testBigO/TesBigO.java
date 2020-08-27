package testBigO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesBigO {
    public static void main(String[] args) {
        long nano1 = System.nanoTime();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5000000; ++i) {
            arr.add(i);
        }
        System.out.println( (System.nanoTime() - nano1) );

        for(int j : arr) {
            ;
        }
        System.out.println( (System.nanoTime() - nano1) );

        long nano2 = System.nanoTime();

        List<Integer> arrL = new LinkedList<>();
        for(int i = 0; i < 5000000; ++i) {
            arrL.add(i);
        }
        System.out.println( (System.nanoTime() - nano2) );

        for(int j : arrL) {
            ;
        }
        System.out.println(System.nanoTime()-nano2);
    }
}
