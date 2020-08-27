package generic.bird;

public class Bird {
    int weight;

   Bird(int weight) {
        this.weight = weight;
    }
    void move(){}
}
class Strauss extends  Bird{
    Strauss(int weight) {
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Run");
    }
}
class Penguin extends  Bird{
    Penguin(int weight){
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Svim");
    }
}
class  Logic<T extends Bird>{
    T[] array;

    public Logic(T[] array) {
        this.array = array;
    }
    void display(){
        for (T temp:array) {
            temp.move();
            System.out.println(temp.weight);
        }
    }
    int weightCot(){
        int sum = 0;
        for (T temp: array) {
            sum += temp.weight;
        }
        return  sum;
    }
    static  void weightComp(Logic<?> c1,Logic<?>c2)
    {
        System.out.println(c1.weightCot() - c2.weightCot());
    }
}
class Main{
    public static void main(String[] args) {
        Strauss[] s ={new Strauss(55),new Strauss(44)};
        Penguin [] p = {new Penguin(15),new Penguin(25),new Penguin(20)};
        Logic<Strauss> l = new Logic<>(s);
        l.weightCot();
      //  l.display();
        Logic<Penguin> l1 = new Logic<>(p);
        l1.weightCot();
      //  l1.display();
        Logic.weightComp(l,l1);
    }
}
