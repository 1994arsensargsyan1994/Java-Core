package animal;

public abstract class Animal {
    protected String food;
    protected int hunger;
    protected  String boundaries;
    protected  double location;
   abstract void makeNoise();
   abstract void eat();
    void roam(){

   }
   void sleep(){
       System.out.println("The same");
   }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", hunger=" + hunger +
                ", boundaries='" + boundaries + '\'' +
                ", location=" + location +
                '}';
    }
}
