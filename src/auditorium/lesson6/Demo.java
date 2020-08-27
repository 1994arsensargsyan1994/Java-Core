package auditorium.lesson6;

import java.awt.*;

public class Demo {


    public static void main(String[] args) {

//        Animal animal = new Animal("Barsik", Color.BLACK, 2);

        Animal a1 = new Cat("Barsik", Color.BLACK, 2);
        Animal a2 = new Dog("Jeko", Color.white, 3, 50);

//        ((Cat) a1).makeSound();

        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++) {
            if ((i & 1) == 1) {
                animals[i] = new Cat("Barsik_" + i, Color.BLACK, 2);
            } else {
                animals[i] = new Dog("Jeko_" + i, Color.white, 3, 50);
            }
        }

        for (Animal animal : animals) {
            animal.makeSound();
//            if (animal instanceof Dog) {
//                Dog d = (Dog)animal;
//                d.makeSound();
//            } else if (animal instanceof Cat) {
//                Cat c = (Cat) animal;
//                c.makeSound();
//            }
        }


    }

}
