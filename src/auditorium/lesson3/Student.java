package auditorium.lesson3;

public class Student {

    int age;
    String firstName;
    String lastName;
    String address;
    float mog;

    public Student(String firstName,
                   String lastName,
                   int a) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = a;
    }


    public String toString() {
        return "Student{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mog=" + mog +
                '}';
    }
}
