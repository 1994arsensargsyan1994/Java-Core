package egs.home12;

public class User {
    private int id;
    private boolean completed;
    @MySerializeName("title")
    private String name;
    @MySerializeName("userId")
    private int userIddd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", completed=" + completed +
                ", title='" + name + '\'' +
                ", userId=" + userIddd +
                '}';
    }
}
