package Yntaciq.lesoons7;

import java.util.Objects;

public class User {
    private String name;
    private String srname;

    public User(String name, String srname) {
        this.name = name;
        this.srname = srname;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrname() {
        return srname;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", srname='" + srname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(srname, user.srname);
    }
}
