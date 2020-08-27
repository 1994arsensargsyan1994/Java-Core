package lesson.les6;

import java.awt.*;

public class Cat extends  Animal {
    public static final   String VOICE= "myuuu";

    public Cat(String name, Color color, int age) {
        super(name, color, age);
    }

    public void makeSound(){
        System.out.println(this.name + " "+VOICE);
    }


}
