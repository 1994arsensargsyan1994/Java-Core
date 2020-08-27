package egs.home13;

import java.util.ArrayList;
import java.util.List;

public class TestGen {
    public static void main(String[] args) {
        new TestGen().go();
    }

    public void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        takeAnimals(animals);
        ArrayList<Dog> dog = new ArrayList<>();
        dog.add(new Dog());
        dog.add(new Dog());
        //takeAnimals(dog); compl error
    }

    void takeAnimals(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
