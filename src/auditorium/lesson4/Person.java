package auditorium.lesson4;

public class Person {

    public final static String nationality;

    static {
        nationality = "Armenian";
        System.out.println("In Person static block. " + nationality);
    }

    private String firstName;
    private String lastName;
    private final String email = "example@mail.ru";
    private int age;
    private String bloodOrder;

//    {
//        age = 45;
//        System.out.println("In Person non static block. > " + this);
//    }

    public Person() {
        this.age = 45;
        System.out.println("In person constructor. > " + this);
    }

    //    public Person(String firstName,
//                  String lastName,
//                  String email) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
//            TODO change with correct code
            System.out.println("The age can not be negative!!!!");
            return;
        }
        this.age = age;
    }

    public String getBloodOrder() {
        return bloodOrder;
    }

    public void setBloodOrder(String bloodOrder) {
        this.bloodOrder = bloodOrder;
    }
}
