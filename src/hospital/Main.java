package hospital;

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("Karpich");
        Doctor d1 = new Doctor("Meujan");
        Hospital.printDoctors();
        Pacient p = new Pacient("Arsen",d);
        Pacient p3 = new Pacient("Armen",d);
        Pacient p4 = new Pacient("Vardan",d);
        Pacient p1 = new Pacient("Karine",d1);
        Pacient p2 = new Pacient("Marine",d1);
        d1.setPacients(p2);
        d.setPacients(p3);
        d.setPacients(p4);
        Hospital.printPacients();
        Hospital.printDoctors();
        MecSister m = new MecSister("Lilitik");
        m.setPacients(p);
        m.setPacients(p1);
        m.setPacients(p2);
        Hospital.printMedsisters();
        Hospital.printPacients();
        System.out.println("___________________________________");
        d.procedure(120,p);
        Hospital.printDoctors();
        Hospital.printPacients();
    }

}
