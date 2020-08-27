package human;

abstract  class Man {
    protected String firstName;
   protected String lastName;
    protected int age;
    private String profesion;

     Man(String firstName, String lastName, int age, String profesion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profesion = profesion;
    }

    public Man() {
    }

    @Override
    public String toString() {
        return "Man{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profesion='" + profesion + '\'' +
                '}';
    }
    abstract void method();


}
