package auditorium.lesson6;

import java.awt.Color;

public class Cat extends Animal {

    public static final String VOICE = "Myauuuuuu";

    public Cat(String name, Color color, int age) {
        super(name, color, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " " + VOICE);
    }


}
