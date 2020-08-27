package animal;

public class Dog extends  Canine implements Pet{
    @Override
    void makeNoise() {
        System.out.println("Haf-Haf");
    }

    @Override
    void eat() {
        System.out.println("eat met and other thing");
    }

    @Override
    public void beFriendly() {
        System.out.println("Havatarim ");
    }

    @Override
    public void play() {
        System.out.println("qich");
    }
}
