package myLamdaVirajena.parapersLambda2;

import myLamdaVirajena.NumericTest;

public class LamdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 numericTest = (n,d) ->(n % d)==0;
        if (numericTest.test(10,2)){
            System.out.println("2 bajanarar e 10 in ");
        }
        if (!numericTest.test(10,3)) {
            System.out.println("3 bajanarar che 10 in ");
        }
        }
}
