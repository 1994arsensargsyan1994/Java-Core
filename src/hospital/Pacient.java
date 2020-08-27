package hospital;

public class Pacient  extends  Hospital{
    private String name;
    private Doctor doctor;
    private int life = -100;

    protected void setLife(int l) {
        life = life + l;
    }

    protected int getLife() {
        return life;
    }

    public Pacient(String name) {
        this.name = name;
        addPacient(this);
    }

    public Pacient(String name, Doctor doctor) {
        addDoctor(doctor);
        doctor.setPacients(this);
        addPacient(this);
        this.name = name;
        this.doctor = doctor;
    }
    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {

        this.doctor = doctor;
        addDoctor(doctor);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", doctor=" + doctor.getName() +
                '}';
    }
}
