package hospital;

import java.awt.*;

public class Hospital {
    private  static Pacient [] pacients = new Pacient[10];
    private  static Doctor [] doctors = new Doctor[10];
    private  static MecSister[] mecSisters = new MecSister[10];
    private  static  int sizeOfPacient = 0;
    private  static  int sizeOfDoctor = 0;
    private  static  int sizeOfDMecSistrs= 0;

    private void growPacients(){
        Pacient [] temp = new Pacient[pacients.length * 3/2];
        for (int i = 0; i <sizeOfPacient; i++) {
            temp[i] = pacients[i];
        }
        pacients = temp;
    }
    private void growDoctor(){
        Doctor [] temp = new Doctor[doctors.length * 3/2];
        for (int i = 0; i <sizeOfDoctor ; i++) {
            temp[i] = doctors[i];
        }
        doctors = temp;
    }
    private void growMecSistrs(){
        MecSister [] temp = new MecSister[mecSisters.length*3/2];
        for (int i = 0; i <sizeOfDMecSistrs ; i++) {
            temp[i] = mecSisters[i];
        }
        mecSisters = temp;
    }
    protected  void addDoctor(Doctor type){
        if (sizeOfDoctor == doctors.length){
            growDoctor();
        }
        for (int i = 0; i <sizeOfDoctor ; i++) {
            if (doctors[i].equals(type)){
                return;
            }
        }
        doctors[sizeOfDoctor++] = type;
    }
    protected  void addPacient(Pacient type){
        if (sizeOfPacient == pacients.length){
           growPacients();
        }
        for (int i = 0; i <sizeOfPacient; i++) {
            if (pacients[i].equals(type)) {
                return;
            }
        }
        pacients[sizeOfPacient++] = type;
    }
    protected  void addMecSister(MecSister type){
        if (sizeOfDMecSistrs == mecSisters.length){
            growMecSistrs();
        }
        for (int i = 0; i <sizeOfDMecSistrs ; i++) {
            if (mecSisters[i].equals(type)) {
                return;
            }
        }
        mecSisters[sizeOfDMecSistrs++] = type;
    }

    public static void printDoctors() {
        for (int i = 0; i < sizeOfDoctor; i++) {
            System.out.println(doctors[i].toString());
        }
    }
    public static void printMedsisters() {
        for (int i = 0; i < sizeOfDMecSistrs; i++) {
            System.out.println(mecSisters[i].toString());
        }
    }

    public static void printPacients() {
        for(int i = 0; i < sizeOfPacient; i++) {
            if (pacients[i].getLife() >= 0) {

                        for (int k = i; k < sizeOfPacient-1; k++) {
                            pacients[k] = pacients[k + 1];
                        }
                        sizeOfPacient--;
                        break;


            }
        }
        for (int i = 0; i < sizeOfPacient; i++) {
            System.out.println(pacients[i].toString());
        }
    }
}
