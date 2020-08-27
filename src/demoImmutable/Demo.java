package demoImmutable;

public class Demo {
    public static void main(String[] args) {
      Address a = new Address("Vanadzor","Armenia");
      User u = new User(25,"Armen",a);
        System.out.println(u);
      a.setCity("Kirovakan");
        System.out.println(u);
    }
}
final  class User{
    private  final int  age;
    private  final  String name;
    private  final  Address address;

    User(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = cloAddress(address);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return cloAddress(address);
    }
    private Address cloAddress(Address address){

        return  new Address(address.getCity(),address.getCounter());
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
class  Address{
    private  String city;
    private  String counter;


    public String getCity() {
        return city;
    }

    public String getCounter() {
        return counter;
    }

    Address(String city, String counter) {
        this.city = city;
        this.counter = counter;

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", counter='" + counter + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }
    //    @Override
//    public Address clone()  {
//
//        return new Address(this.city, this.counter);
//    }
}
