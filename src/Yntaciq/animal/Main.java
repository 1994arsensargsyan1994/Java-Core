package Yntaciq.animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(4,"Vana",6,"Marsel");
        Cat c2 = new Cat(2,"ship",6,"barsuk");
        System.out.println(c.getAge() + " "+ c.getName() +" "+ c.getWeight()+ " "+c.getBread());
        System.out.println(c2.getAge() + " "+ c2.getName() +" "+ c2.getWeight()+ " "+c2.getBread());
    }
}
