package inerAndNestClass.ananimniClass;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p1 = new Phone();
        Computer c = new Computer();
        Computer c1 = new Computer();
        Mobile m = new Mobile();
        Mobile m1 = new Mobile();
        Computer[] computer = {c,c1,m};
        Phone[] phones = {p,p1,m1.createPhone()};
        for (Computer temp: computer) {
            temp.process();
        }
        System.out.println("_____________________________________________________");
        for (Phone temp: phones) {
            temp.process();
        }
    }
}
