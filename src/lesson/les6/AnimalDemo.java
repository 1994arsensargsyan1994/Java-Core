package lesson.les6;

import java.awt.*;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", Color.BLACK,2);
        Animal dog = new Dog("Sharik",Color.white,4,25);
Animal [] animals = new Animal[10];
        for (int i = 0; i <10 ; i++) {
            if ((i & 1) == 1){
                animals[i] =new Cat("Barsik", Color.BLACK,2);
            }else {
             animals[i] = new Dog("Sharik",Color.white,4,25);
            }
        }
        for (Animal animal :animals) {
            animal.makeSound();                    // abstarct method kanchume hamaptasxan Dod i u Cat i makesound methody
//           if (animal  instanceof Dog ){
//               Dog d = (Dog) animal;
//               System.out.println(d.getWeight());
//               d.makeSound();
//           }else  if (animal instanceof Cat){       //  instansof objekti hamatsxanutyan hama true
//               Cat c = (Cat) animal;
//               c.makeSound();
           }
        }
    }

