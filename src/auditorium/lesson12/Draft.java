package auditorium.lesson12;

import java.util.*;

public class Draft {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        String s = new String("intern");

        String another = s.intern();

        String v = "intern";

        System.out.println(v == another);
        System.out.println(v == s);

        String aaaa = "kuku";
        String bbbb = "kuku";

        String kuku = new String("kuku");
        String kuk = new String("kuku");

        System.out.println("a == b <-> " + (aaaa == bbbb));
        System.out.println("a == kuku <-> " + (aaaa == kuku));
        System.out.println("b == kuk <-> " + (bbbb == kuk));
        System.out.println("kuku == kuk <-> " + (kuku == kuk));

        System.out.println(stringSet.add(kuk));
        System.out.println(stringSet.add(kuku));

        Map<Integer, String> testFunctions = new HashMap<>();

        String dummy = "kuku";

        String oldValue = testFunctions.put(1, dummy);

        testFunctions.put(2, dummy);

        System.out.println(testFunctions.get(2));

        System.out.println("oldValue -> " + oldValue);

        oldValue = testFunctions.put(1, "fff");

        System.out.println("oldValue -> " + oldValue);


        System.exit(0);



        User bla = new User("bla@mail.ru", "Blo", "Bloyan", 32);
        User bbb = new User("bla@mail.ru", "Blo", "Bloyan", 32);

        Map<User, Integer> test = new HashMap<>();
        test.put(bla, 100);
        System.out.println(test.get(bla));

        bla.setEmail("asdasd");
        System.out.println(test.get(bla));

        System.out.println(bla);
        System.out.println(bbb);
        System.out.println("bbb.equals(bla) = " + bbb.equals(bla));
        System.out.println(bla.hashCode());
        System.out.println(Integer.toHexString(bla.hashCode()));

        String a = "Aa";
        String b = "BB";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(b.equals(a));

        Map<String, User> users = new HashMap<>();

        User u = users.put(null, bla);
        System.out.println(u);

        u = users.put(null, null);
        System.out.println(u);

        users.put("key", bbb);
        users.put("key1", bla);

        System.out.println(users.get(null));
        System.out.println(users.get("key"));
        System.out.println(users.get("key1"));

        Set<String> strings = users.keySet();
        Collection<User> values = users.values();

        for (String key : strings) {
            System.out.println("key > " + key +
                    ", value > " + users.get(key));
        }
        Set<Map.Entry<String, User>> entries = users.entrySet();
        for (Map.Entry<String, User> entry : entries) {
            System.out.println(entry);
        }

        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 2, 5, 5, 5, 5);

        System.out.println(calculateNumberCount(numbers));

    }


    public static
    Map<Integer, Integer> calculateNumberCount(List<Integer> numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer key : numbers) {
            if (result.containsKey(key)) {
                result.replace(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }
        return result;
    }

}

class User /*implements Comparable<User>*/ {
    private String email;
    private String name;
    private String surname;
    private int age;

    public User(String email, String name, String surname, int age) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(email, user.email) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, surname, age);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(User o) {
//        if (this.age > o.getAge()) {
//            return 1;
//        } else if (this.age < o.getAge()) {
//            return -1;
//        }
//        return 0;
////        return Integer.compare(this.age, o.age);
//    }
}