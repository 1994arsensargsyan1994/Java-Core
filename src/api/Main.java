package api;

public class Main {
    public static void main(String[] args) {
        Book [] b = new Book[2];

        Author o1 = new Author("aaa",b);
        System.out.println(API.getAuthors());
    }
}
