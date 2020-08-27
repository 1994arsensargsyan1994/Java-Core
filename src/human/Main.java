package human;

public class Main {
    public static void main(String[] args) {
        Man man = new Student("Arsen","Sargsyan",25,"Future programer",20);
        Man man1 = new Teacher("Meruzhan","Unanyan",25,"Future programer",200);

        System.out.println( man.toString());
        System.out.println( man1.toString());
        man.method();
        System.out.println();
        man = man1;
        man.method();
        System.out.println(man.hashCode());
    }
}
