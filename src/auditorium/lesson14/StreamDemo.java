package auditorium.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

//        Stream<Integer> intStream = Stream.of(1, 2, 3, 45);
//        Stream.Builder<Integer> builder = Stream.builder();
//        builder.accept(1);
//        builder.accept(2);
//        builder.accept(45);
//        intStream = builder.build();

        List<String> data = Arrays.asList(
                "John Smith",
                "Stave Jobs",
                "Donald Trump",
                "Nicolas Cage",
                "Jason Statham",
                "Scarlet Johansson");

        System.out.println("Before filter");

        Consumer<String> consumer = s -> System.out.println(s);

        Stream<String> stream = data.stream()
                .peek(consumer)
                .filter(name -> {
//                    System.out.println("Filter called for : " + name);
                    return name.startsWith("J");
                });

        System.out.println("After filter data");

        List<String> res = stream
                .collect(Collectors.toList());

        System.out.println(res);

        boolean allMatch = data.stream()
                .allMatch(name -> name.contains("a"));
        System.out.println(allMatch);

        boolean anyMatch = data.stream()
                .anyMatch(name -> name.contains("Trump"));
        System.out.println(anyMatch);

        boolean noneMatch = data.stream()
                .noneMatch(name -> name.contains("Trump"));
        System.out.println(noneMatch);

        List<User> users = data.stream()
                .map(item -> {
                    String[] info = item.split(" ");
                    return new User(info[0], info[1]);
                })
        .collect(Collectors.toList());
        Optional<Integer> max = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo);
//                .mapToInt(User::getAge);

//        for (User user : users) {
//            System.out.println("User name is : " + user.name);
//            System.out.println("User surname is : " + user.surname);
//        }

        List<String> o = data.stream()
                .sorted((a, b) -> {
                    String [] i = a.split(" ");
                    String [] j = b.split(" ");
                    return (i[1] + i[0]).compareTo(j[1] + j[0]);
                }).collect(Collectors.toList());

        System.out.println(o);

        Address adrs1 = new Address("Vanadzor", "Armenia");
        Address adrs2 = new Address("Yerevan", "Armenia");
        Address adrs3 = new Address("Moscow", "Russia");
        Address adrs4 = new Address("Tbilisi", "Georgia");
        Address adrs5 = new Address("London", "UK");

        User u1 = new User("Hipo", "Potan", 23,
                Arrays.asList(adrs1, adrs3, adrs5));

        User u2 = new User("Galo", "Sahakanc", 78,
                Arrays.asList(adrs2, adrs4));

        List<Address> addressList = Stream.of(u1, u2)
                .flatMap(user -> user.getAddresses().stream())
                .collect(Collectors.toList());

        // petq er map anel string-i nor sharunakel concat anel anun-y useri
        System.out.println("---------");
        String optionalUser = Stream.of(u1, u2)
                .map(User::getName)
                .reduce((s, u) -> s + "#" + u).orElse("default value");
        System.out.println(optionalUser);

        System.out.println("-----------");

        OptionalInt m = Stream.of(u1, u2)
                .mapToInt(User::getAge)
                .max();

        OptionalInt min = Stream.of(u1, u2)
                .mapToInt(User::getAge)
                .min();

        OptionalDouble average = Stream.of(u1, u2)
                .mapToInt(User::getAge)
                .average();

        // reduce -i example e, yerb stream es stanum u vercnum es mi arzheq, tvyal paragayum sum-n enk hashvum
        int sum = Stream.of(u1, u2)
                .mapToInt(User::getAge)
                // identity skzbnakan argumentn e vor karox enk poxancel, optinal e, yete chenk poxancum veradardzvox arzheqy OptinalInt e
                .reduce(0, (val1, val2) -> val1 + val2);
//                .reduce((val1, val2) -> val1 + val2);// can be replaced to .reduce(Integer::sum);

        Optional<User> u11 = Stream.of(u1, u2)
                .min(Comparator.comparingInt(user -> user.addresses.size()));

        u11.ifPresent(user -> System.out.println(user.getAge()));


        System.out.println(optionalUser);

        System.out.println(addressList);

        System.out.println("END");
    }

}

class User {
    String name;
    String surname;
    int age;
    int salary;
    List<Address> addresses;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(String name, String surname, int age, List<Address> addresses) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Address {
    Type type;
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

enum Type {
    WORK,
    HOME,
    OTHER;
}
