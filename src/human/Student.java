package human;

public class Student extends Man {
    private  int toshak;

    public Student(String firstName, String lastName, int age, String profesion, int toshak) {
        super(firstName, lastName, age, profesion);
        this.toshak = toshak;
    }

    public int getToshak() {
        return toshak;
    }

    @Override
    void method() {
        System.out.println(" Student");
    }
}
