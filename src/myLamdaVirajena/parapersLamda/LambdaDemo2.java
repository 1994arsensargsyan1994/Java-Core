package myLamdaVirajena.parapersLamda;

import myLamdaVirajena.NumericTest;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest num = (n) ->(n % 2) ==0;    // ete mi argumena (n) karoxes pakagcrum chgres da nuypes kashxati n -> .....
        if (num.test(10)) System.out.println("number 10 even");
        if (!num.test(9)) System.out.println("number 9 old");
        NumericTest neg = (n) -> n >= 0;
        if (neg.test(1)) System.out.println("number 1 atrecaclni");
        if (!neg.test(-1)) System.out.println("number -1 atrecaclni");
    }
}
