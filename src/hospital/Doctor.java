package hospital;

import java.util.Arrays;

public class Doctor  extends  Hospital{
    private  String name;
    private  int size = 0;
    private Pacient [] pacients = new Pacient[10];

    public Doctor(String name) {
        this.name = name;
        addDoctor(this);
    }

    protected void procedure(int i, Pacient p) {
        p.setLife(i);
        if(p.getLife() >= 0) {
            for (int j = 0; j < size; j++) {
                if(p.equals(pacients[j])) {
                    for (int k = j; k < size; k++) {
                        pacients[k] = pacients[k + 1];
                    }
                    size--;
                    return;
                }
            }
        }
    }

    public Doctor(String name, Pacient pacients) {
        this.name = name;
        if (size > 10) {
            System.out.println(" Doctor can not have so pacients");
            return;
        }
        addDoctor(this);

        addPacient(pacients);
        setPacients(pacients);
    }

    public String getName() {
        return name;
    }

    public Pacient[] getPacients() {
        return pacients;
    }

    public void setPacients(Pacient p) {
        if (size > 10){
            System.out.println(" Doctor can not have so pacients");
            return;
        }
        for (int i = 0; i <size ; i++) {
            if (pacients[i].equals(p)){
                return;
            }
        }
        pacients[size++] = p;
    }

    @Override
    public String toString() {
        String s = "[ ";
        for (int i = 0; i < size; i++) {
            if (pacients[i] != null) {
                s = s + pacients[i].getName() + ", ";
            }
        }
        s = s + " ]";
        return "Doctor{" +
                "name='" + name + '\'' +
                ", pacients=" + s +
                '}';
    }
}
