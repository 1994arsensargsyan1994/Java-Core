package Yntaciq.upcastdowncastobject.tow;

public class Main {
    public static void main(String[] args) {
        DeivedClass instans = new DeivedClass();
        instans.metohd();
        instans.methoddaivd();
        BasesClass instansup = instans;
        instansup.metohd();
        DeivedClass instansDown = (DeivedClass) instansup;
        instansDown.metohd();
        instansDown.methoddaivd();
        System.out.println("Ha - cod instans: "+ instans.hashCode());
        System.out.println("Ha - cod instansup: "+ instansup.hashCode());
        System.out.println("Ha - cod instansdown: "+ instansDown.hashCode());
    }
}
