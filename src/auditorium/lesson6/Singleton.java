package auditorium.lesson6;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton constructor called.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void test() {
        System.out.println("Test method called");
    }
}
