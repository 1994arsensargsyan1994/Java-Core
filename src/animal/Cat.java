package animal;

public class Cat extends  Feline implements  Pet{
    public  int age;
    String name;
    protected String voise;
    private  double countOfLay;

    @Override
    void makeNoise() {
        System.out.println("miauuu");
    }

    @Override
    void eat() {
        System.out.println("milk");
    }

    @Override
    public void beFriendly() {
        System.out.println("mi qich ");
    }

    @Override
    public void play() {
        System.out.println("Shat");
    }
}
