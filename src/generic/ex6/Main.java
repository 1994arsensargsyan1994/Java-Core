package generic.ex6;
class Derived {

}
class Base extends  Derived{

}
class MyClass <T extends Derived>{

}
public class Main {
    public static void main(String[] args) {
   MyClass<Base> baseMyClass = new MyClass<>();
   MyClass<Derived> derivedMyClass = new MyClass<>();
  // MyClass<String> stringMyClass = new MyClass<String>();
    }
}
