package Yntaciq.interfacekayword.inter2;

public class Main {
    public static void main(String[] args) {
        SomeClass instans =new SomeClass();
        instans.method1();
        instans.method2();
        instans.method3();
        System.out.println("______________________________");
        SomeInterface1 instansup1 = instans;
        instansup1.method1();  //  method2();method3(); hasaneli chen :
        SomeInterface2 instansup2 = instans;
        System.out.println("______________________________");
        instansup2.method2();
        System.out.println("______________________________");
        SomeInterface3 instansup3 = instans;
        instansup3.method3();
        System.out.println("______________________________");
        SomeInterface2 instansdown =(SomeClass) instansup1;
        instansup1.method1();
        ((SomeClass) instansup1).method2();
        ((SomeClass) instansup1).method3();
        instansup1.method1();
    }
}
