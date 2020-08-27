package lesson.les6;

import java.awt.*;

public class Dog extends Animal {
    public static final String VOICE = "Huf = huf";
       private int weight;

    public Dog(String name, Color color, int age, int weight) {
        super(name,color,age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void makeSound(){
        System.out.println(this.name + " "+VOICE);
    }
}
