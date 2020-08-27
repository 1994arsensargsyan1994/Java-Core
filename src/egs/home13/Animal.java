package egs.home13;

public abstract class Animal {
    void eat(){
        System.out.println("to be Animal");
    }
}
class Dog extends  Animal{
    void bark(){}
}
class Cat extends  Animal{
    void meow(){}
}
