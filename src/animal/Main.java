package animal;

public class Main {
    public static void main(String[] args) {
       Animal []animal = new Animal[6];
       animal[0] = new Dog();
       animal[1] = new Cat();
       animal[2] = new Wolf();
       animal[3] = new Lion();
       animal[4] = new Hippo();
       animal[5] = new Tiger();
        for (Animal a:animal) {
            a.makeNoise();
            if (a instanceof  Dog){
                Dog dog = (Dog) a;
                dog.beFriendly();
            }
            if (a instanceof Cat){
                Cat cat = (Cat) a;
                cat.beFriendly();
            }
        }
        System.out.println("___________________________");
        Vet v = new Vet();
        v.giveShot(animal[0]);
        Cat cat = new Cat();
        v.giveShot(cat);

    }
}
