package auditorium.lesson2;

public class Variables {

    public static void main(String[] args) {
        byte varA = 64;
        byte varB = 8;
        int a = 23;
        int b = 10;


        int c = a + b;

        long z = 2226;

        int i = (int) (z - b);

        long j = i;

//        System.out.println("varA + varB = " + (varA + varB));
//        System.out.println("varA - varB = " + (varA - varB));
//        System.out.println("varA * varB = " + (varA * varB));
//        System.out.println("varA / varB = " + (varA / varB));
//
//        System.out.println("a / b = " + a / b);
//        System.out.println("a % b = " + a % b);

        char vazgen = 'A';
        boolean isTrue = true; // false
        double doubleA = 1.5;
        float floatA;
        floatA = 1.7F;
//        System.out.println(floatA);


        int valueOne = 5;
        int valueTwo = ~valueOne;

//        System.out.println("ValueOne : " + valueOne);
//        System.out.println("ValueTwo : " + valueTwo);
//
//        System.out.println("isTrue : " + isTrue);
//        System.out.println("isFalse : " + !isTrue);


        a = 5;
        b = 6;

        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));

        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("-a >>> 2 = " + (-5 >>> 2));

    }

}
