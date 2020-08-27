package animal;

public class Lion extends  Feline {
    @Override
    void makeNoise() {
        System.out.println("grrrrrrrrrrrr");
    }

    @Override
    void eat() {
        System.out.println("met and man");
    }
}
