package generic.whithGen;

public class MyClass {
    public static void main(String[] args) {
        WhitGen<String> w1= new WhitGen<>("Test");
        WhitGen<Integer> w2= new WhitGen<>(5);
        WhitGen<Cat> w3 = new WhitGen<>(new Cat("BArsuk"));
        w1.display();
        w2.display();
        w3.display();
        //w1 = w3;
    }
}
class  WhitGen<T>{
    T obj;
    WhitGen(T obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj);
    }

}
class  Cat{
    String name;
    Cat(String name){
        this.name = name;
    }
@Override
 public  String toString(){
return  this.name;
 }
}
