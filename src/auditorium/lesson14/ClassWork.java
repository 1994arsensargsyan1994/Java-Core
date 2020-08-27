package auditorium.lesson14;

import java.util.Random;
import java.util.UUID;

public class ClassWork {

    public static void main(String[] args) {

        Person person = new Person(new Random().nextLong(),
                "Vladislav Pyisnikov",
                "vladpyos@mail.ru");

        // standard syntax
        Converter<Person, String> c1 = p -> p.getEmail();
        // method reference syntax
        Converter<Person, String> c2 = Person::toString;
        // static method reference syntax
        Converter<Person, String> c3 = ClassWork::staticReferenceExample;

        System.out.println(c1.convert(person));
        System.out.println(c2.convert(person));
        System.out.println(c3.convert(person));

    }

    public static String staticReferenceExample(Person person) {
        return person.getFullName();
    }

}

@FunctionalInterface
interface Converter<I, O> {
    O convert(I i);
}

class Person {
    private Long id;
    private String fullName;
    private String email;

    public Person() {
    }

    public Person(Long id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("id=").append(id);
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


