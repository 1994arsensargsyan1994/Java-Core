package streamAPI.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user = new User("Arsen", 1000);
        User user1 = new User("Armen", 1050);
        User user2 = new User("Ero", 1800);
        User user3 = new User("Valod", 1890);
        User user4 = new User("Katrin", 1540);
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
      Integer sum = users.stream().mapToInt(User::getSel).reduce(0, Integer::sum);
        System.out.println(sum);
    }

}
class  User {
    String name;
    int sel;

    public User(String name, int sel) {
        this.name = name;
        this.sel = sel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSel() {
        return sel;
    }

    public void setSel(int sel) {
        this.sel = sel;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sel=" + sel +
                '}';
    }
}
