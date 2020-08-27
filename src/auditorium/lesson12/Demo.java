package auditorium.lesson12;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "mek");
        map.put(2, "erkus");

        System.out.println(map.get(2));

        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                String firstUser = o1.getName() + o1.getSurname();
                String secondUser = o2.getName() + o2.getSurname();
                return firstUser.toLowerCase()
                        .compareTo(secondUser.toLowerCase());
            }
        };

        Set<User> users = new TreeSet<>(comparator);

        User u = new User("mail", "Adam", "Madoyan", 5);
        users.add(u);
        users.add(new User("mail", "Zhora", "Vahagni", 2));
        users.add(new User("mail", "Artur", "nuyn", 2));
        users.add(new User("mail", "name", "sur", 8));

        for (User user : users) {
            System.out.println(user);
        }

    }

}
