package auditorium.lesson13;

public class ImmutableDemo {

    public static void main(String[] args) {

        Address a = new Address("Yerevan", "Armenia");
        User u = new User("Armen", "Ashotyan", a);

        a.setCountry("asdfsdf");

        Address address = u.getAddress();
        address.setCountry("asadsd");

        System.out.println(u);
        System.out.println(address);

    }

}

final class User {

    private final String name;
    private final String surname;
    private final Address address;
    private  String test;

    public User(String name, String surname,
                Address address) {
        this.name = name;
        this.surname = surname;
        this.address = cloneAddress(address);
    }
    public void setTest(String s) {
        test = s;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return cloneAddress(address);
//        return address;
    }

    private Address cloneAddress(Address address) {

        return new Address(address.getCity(), address.getCountry());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        A a = (i1, i2) -> i1 * i2;

        a.multiple(12, 23);

        System.out.println(a.sqrt(5));
    }
}

@FunctionalInterface
interface A {
    String VALUE = "adf";
    Integer I = 1;

    Integer multiple(Integer i, Integer y);

//    void mm(Integer i, Integer y);

    default Integer sqrt(Integer i) {

        return multiple(i, i);
    }

}