package auditorium.lesson6;

public class SingletonDemo {


    public static void main(String[] args) {
        Singleton.test();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
    }

}
