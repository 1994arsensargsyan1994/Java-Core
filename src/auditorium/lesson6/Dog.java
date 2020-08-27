package auditorium.lesson6;

import java.awt.Color;

public class Dog extends Animal {

    public static final String VOICE = "Huf-huf";

    private int weight;

    public Dog(String name, Color color, int age, int weight) {
        super(name, color, age);
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " " + VOICE);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
