package jobnew;

public class Main {
    public static void main(String[] args) {

   Person [] people = Job.getPersons();
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("_____________________________");

       people= Person.method(people,"VNS");
        for (Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println("_____________________________");

        // TODO - u es persons-y petqa vorpes argument poxances funkcianerit

        // TODO - aysinqn Person class-i mej en addPerson() u et array pahely hanelu es eli

        // TODO - es nuyn bany Book-um

    }
}
