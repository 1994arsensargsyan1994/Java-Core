package auditorium;

import java.util.Objects;

public class User {

    public static void main(String[] args) {

        User user = new User("Vardan", "Urumyan");
        System.out.println(user.getClass());
        System.out.println(user.getClass().getName());
        System.out.println(user.getClass().getSimpleName());
        System.out.println(user.hashCode());
        System.out.println(user);
        System.out.println(user.toString());

        System.out.println(Integer.toHexString(12));
    }

    private String name;
    private String surname;

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    static void test() {
        User user = new User();
        String s = user.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.name.equals(user.name) && this.surname.equals(user.surname);
    }
}