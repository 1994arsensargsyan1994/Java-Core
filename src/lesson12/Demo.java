package lesson12;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"mek");
        map.put(2,"erkus");
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                String fristUser = user.getName()+user.getSurname();
                String lastUser = t1.getName() + t1.getSurname();
                return fristUser.toLowerCase().compareTo(lastUser.toLowerCase());
            }
        };
        Set<User> users = new TreeSet<>(comparator);
        users.add(new User("arsen","surname",12,"mail"));
        users.add(new User("arsen","surname",12,"mail"));
        users.add(new User("kali","surname",122,"mail"));
        users.add(new User("lika","surname",1154,"mail"));
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("________________________________________");
        Set<User> setHash = new HashSet<>();
        setHash.add(new User("arsen","surname",12,"mail"));
        setHash.add(new User("arsen","surname",12,"mail"));
        setHash.add(new User("kali","surname",122,"mail"));
        setHash.add(new User("lika","surname",1154,"mail"));
        for (User hash : setHash) {
            System.out.println(hash);
        }
    }
}
