package egs.home12;

public class Book {
    @MySerializeName("id")
    private int firstId;
    @MySerializeName("completed")
    private boolean isBool;
    @MySerializeName("title")
    private String name;
    @MySerializeName("userId")
    private int page;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + firstId +
                ", completed=" + isBool +
                ", nameOfBook='" + name+ '\'' +
                ", page=" + page +
                '}';
    }



}
