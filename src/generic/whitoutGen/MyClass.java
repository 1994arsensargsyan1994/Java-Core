package generic.whitoutGen;

public class MyClass {
    public static void main(String[] args) {
        WhitoutGen w1= new WhitoutGen("Test");
        WhitoutGen w2= new WhitoutGen(5);
        WhitoutGen w3 = new WhitoutGen(new Cat("Barsuk"));
        w1.display();
        w2.display();
        w3.display();
        w1 = w2;
        String s= (String)w1.getObj();
        System.out.println(s);

    }
}
class  WhitoutGen{
    Object obj;
    WhitoutGen(Object obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj);
    }
    Object getObj(){
        return this.obj;
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

