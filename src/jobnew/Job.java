package jobnew;

public class Job {

    private static Person[] persons = new Person[4];

    static {
        Person person = new Person(19,"Google","James");
        Person person1 = new Person(25,"Google","Xuaneta");
        Person person2 = new Person(25,"VNS","James");
        Person person3 = new Person(18,"VNS","Enrye");

        persons[0] = person;
        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;

    }

    public static Person[] getPersons() {
        return persons;
    }
}
