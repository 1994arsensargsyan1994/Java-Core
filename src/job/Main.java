package job;

public class Main {
    public static void main(String[] args) {
      Job j = new Job();
        Person[] array;
        array = Person.getPersonsWhere("VNS");
        Person.printPersons(array);
        System.out.println("__________________________________");
        array = Person.getMaxAndMinAgePerson();
        Person.printPersons(array);
        System.out.println("_______________________________________name ");
      Person.getArrayOfName();
        System.out.println("___________________________________________");
      Person.getArrayOfage();
        System.out.println("________________________________________________");
        array = Person.getTheSamePerson();
        Person.printPersons(array);

    }
}
