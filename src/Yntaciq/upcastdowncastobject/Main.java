package Yntaciq.upcastdowncastobject;

public class Main {
    public static void main(String[] args) {
           DerivedClass instans = new DerivedClass();
       instans.fielde1 = 1;
       instans.fielde2 = 2;
       instans.fielde3 = 3;
       instans.fielde4 = 4;
       instans.fielde5= 5;
       BasesClass newinstans = (BasesClass) instans;
        System.out.println(newinstans.fielde1);
        System.out.println(newinstans.fielde2);
        System.out.println(newinstans.fielde3);
        System.out.println("Has- Cod instans : " + instans.hashCode());
        System.out.println("Has- Cod newinstans : " + newinstans.hashCode());


    }
}
