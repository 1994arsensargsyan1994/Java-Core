package egs.home4;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumberNew {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            armstrong(i);
        }
    }

    public static void armstrong(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        if (number <= 9) {
            System.out.println(number);
        }
        Integer sum = 0;
        List<Integer> array = new ArrayList<>();
        int numTemp, numTemp2;
        numTemp = numTemp2 = number;
        while (numTemp != 0) {
            numTemp2 = numTemp % 10;
            array.add(numTemp2);
            numTemp2 = 0;
            numTemp /= 10;
        }
        List<Integer> newArray = new ArrayList<>(array);
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                array.set(i, array.get(i) * newArray.get(i));
            }
        }
        sum = array.stream().reduce(0, Integer::sum);
        if (sum == number) {
            System.out.println("Amstrong number is : " + number);
        }


    }
}
