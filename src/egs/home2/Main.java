package egs.home2;

public class Main {
    public static void main(String[] args) {
//        {
//            System.out.println("Feathers");
//        }
        Test t = new Test();
        A a = new Test();
        ClassA cA = new Test();
//        System.out.print("test = ");t.method();
//        System.out.println();
//        System.out.print("A = ");a.method();
//        System.out.println();
//        System.out.print("ClassA = ");cA.method();
        t.methodCA();
        t.method();
        a.method(); // did not methodCA;
        cA.methodCA();// did not method;


    }
//
//    {
//        System.out.println("Snowy");
//    }
}
