package Yntaciq.practic;

public class ArrayPracticMain {
    public static void main(String[] args) {
        ArrayPractic.generateiRandonNumber(100,10);
        System.out.println("_______________________________");
        int array [] = new int [15];
        ArrayPractic.generateiRandonNumber(100,array);
        ArrayPractic.print(array);
        ArrayPractic.sortArrayOddAndEven(array);
        System.out.println("__________________________________");
        ArrayPractic.print(array);
        ArrayPractic pract = new ArrayPractic();



    }
}
