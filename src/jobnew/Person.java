package jobnew;

public class Person {
    private int age;
    private String where;
    private String name;


    public Person(int age, String where, String name) {
        this.age = age;
        this.where = where;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", where='" + where + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static Person[] method (Person[]array,String where){
        int size= 0;
        Person[] newArray = new Person[array.length];
        for (int i = 0; i <array.length ; i++) {
            if (array[i].getWhere().equals(where)){
                newArray[size++] = array[i];
            }
        }
       Person[] newArray1 = new Person[size];
        for (int i = 0; i <size ; i++) {
                newArray1[i] = newArray[i];
            }
        return newArray1;

    }
}

