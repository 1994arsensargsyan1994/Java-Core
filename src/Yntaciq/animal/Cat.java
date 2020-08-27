package Yntaciq.animal;

public class Cat extends Animal {
 private    int age;
  private   String name;
    public Cat(int weight,String bread,int age,String name){
        super(weight,bread);
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
