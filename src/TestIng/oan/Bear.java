package TestIng.oan;

 interface Herbivore {
    public void eatPlants();
}
 interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}
public class Bear {
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    public void eatPlants() {
        System.out.println("Eating plants");

    }
}
