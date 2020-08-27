package api;

public class Book {

    Author author;
    String bookName;
    int release_date;

    public Book(Author author, String bookName, int release_date) {
        this.author = author;
        this.bookName = bookName;
        this.release_date = release_date;
    }
}
