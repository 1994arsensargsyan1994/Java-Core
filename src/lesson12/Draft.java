package lesson12;
import java.util.*;

public class Draft {
    public static void main(String[] args) {
        User bla = new User("Blo", "Bloyan", 32, "Bloyan");
        User b = new User("Blo", "Bloyan", 32, "Bloyan");
        Map<User, Integer> test = new HashMap<>();
        test.put(bla, 100);
        Map<String, User> userMap = new HashMap<>();
        userMap.put(null, null);
        userMap.put("kay", null);
        userMap.put("kay1", null);
        System.out.println(userMap.get(null));
        System.out.println(userMap.get("kay"));
        System.out.println(userMap.get("kay1"));
        System.out.println(bla);
        System.out.println(b);
        System.out.println(b.equals(bla));
        System.out.println(test.get(b));
        Set<String> strings = userMap.keySet();
        Collection<User> values = userMap.values();
        for (String kay : strings) {
            System.out.println("kay > " + kay);
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(2);
        System.out.println(calculateNumberCount(list));

    }
// greq method vory kstana interi list ev vorpes elqayin kveradarcni te vor tveric ichqan ka
    static Map<Integer,Integer> calculateNumberCount (List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer : list) {
           if (map.containsKey(integer)){
               map.put(integer,map.get(integer)+1);
           }else
               map.put(integer,1);
        }
        return  map;
    }

    }
class User implements  Comparable<User> {
    String name;
String surname;
int age;
String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email);
    }

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
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
                ", surename='" + surname + '\'' +
                ", age='" + age + '\'' + " email = "+ surname +" "+
                '}';
    }

    @Override
    public int compareTo(User user) {
        int temp = this.surname.compareTo(user.surname);
        if (temp == 0){
         return  this.name.compareTo(user.name);
        }
         return temp;
    }
}