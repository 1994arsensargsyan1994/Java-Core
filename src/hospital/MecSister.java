package hospital;

import java.util.Arrays;

public class MecSister extends  Hospital {
    private  String name;
    private  Pacient[] pacients = new Pacient[15];
    private int size = 0;

    public MecSister(String name) {
        this.name = name;
        addMecSister(this);
    }

    public MecSister(String name, Pacient pacients) {
        this.name = name;
       setPacients(pacients);
       addPacient(pacients);
       if (size > 15){
           return;
       }
        addMecSister(this);
    }

    public String getName() {
        return name;
    }

    public Pacient[] getPacients() {
        return pacients;
    }
    public void setPacients(Pacient p) {
        if (size > 15 ){
            System.out.println("!!!!!!!!!!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (pacients[i].equals(p)){
               return;
            }

        }
        pacients[size++] = p;
        addMecSister(this);
        addPacient(p);
    }

    @Override
    public String toString() {
        String s = "[ ";
        for (int i = 0; i < size; i++) {
            if(pacients[i] != null) {
                s = s + pacients[i].getName() + ", ";
            }
        }
        s = s + " ]";
        return "MecSister{" +
                "name='" + name + '\'' +
                ", pacients=" + s +
                '}';
    }
}
