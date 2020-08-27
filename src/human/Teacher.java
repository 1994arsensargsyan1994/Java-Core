package human;

public class Teacher  extends Man{
     private  int sel;

    public Teacher(String firstName, String lastName, int age, String profesion, int sel) {
        super(firstName, lastName, age, profesion);
        this.sel = sel;
    }

    public int getSel() {
        return sel;
    }

    @Override
    void method() {
        System.out.println(" Teacher");
    }
}
