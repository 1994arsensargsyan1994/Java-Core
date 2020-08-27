package auditorium.lesson13;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {

//        PersonFactory<Person> factory = (name, surname) -> {
//            return new Person(name, surname);
//        };

        Optional<Person> optional = createPerson("Armen", null);
        PersonFactory<Person> factory = Person::new;
        List<String> list = Arrays
                .asList("Mek", "Erku", "Ereq", "Chors", "Hing");

        Predicate<String> filter = s -> s.length() > 1;



        list.stream()
                .filter(filter); // bacartel

        for (String s : list) {
            System.out.println(s);
        }
        Comparator<String> order =
                Comparator.reverseOrder(); //    the same           (s1, s2) -> {
        System.out.println("-----------");                          //return s2.compareTo(s1);
        Collections.sort(list, order);

     //   list.forEach(System.out::println);  // bacatrel
        System.out.println("-----------");

        for (String s : list) {
            System.out.println(s);
        }

        Converter<Integer, String> intToString
                = String::valueOf;
    }



    public static Optional<Person> createPerson(String name, String surname) {
        if (name == null || surname == null) {
            return Optional.empty();
        }

        return Optional.of(new Person(name, surname));
    }

    public static void test(Person person) {
        System.out.println(person.name);
    }

    public static void test(Optional<Person> optionalPerson) {
        if (optionalPerson.isPresent()) {
            Person p = optionalPerson.orElse(new Person());
        }
    }

}



@FunctionalInterface
interface Converter<F, T> {

    T convert(F f);

}

