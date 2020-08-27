package Yntaciq.welist.westeck.refstack;

public class RefStackTest {
    public static void main(String[] args) {
        RefSteck refSteck = new RefSteck();
        for (int i = 1; i <10 ; i++) {
            refSteck.push(i);
        }
          //  refSteck.print();
        System.out.println();
        System.out.println(refSteck.pop());
        System.out.println(refSteck.pop());
        System.out.println(refSteck.pop());
        System.out.println(refSteck.pop());
        System.out.println(refSteck.pop());
        }
    }
