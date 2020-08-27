package animal;

public class Wolf extends  Canine {
    @Override
    void makeNoise() {
        System.out.println("Auuuuuuuuuuu");
    }

    @Override
    void eat() {
        System.out.println("eat met ");
    }
}
