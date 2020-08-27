package Yntaciq.interfacekayword;

public class Main {
    public static void main(String[] args) {
        SomeClass instans = new SomeClass();
        instans.method();
        System.out.println(instans.publicFailed);
        SomeInterface insstansup = instans;
        insstansup.method();
        SomeClass insstanasDawn =(SomeClass)insstansup;
        insstanasDawn.method();
        System.out.println(instans.publicFailed);
    }
}
