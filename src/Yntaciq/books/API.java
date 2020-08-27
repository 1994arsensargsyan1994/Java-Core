package Yntaciq.books;

public class API  {
    public static void main(String[] args) {
       TestAuthorAndBook testAuthorAndBook = new TestAuthorAndBook();
        Author[] authors;
        authors = Book.getAuthorsName("Kafka");
       Book.print(authors);
        System.out.println("_______________________________");
        authors=Book.getAllAuthors();
        try {
            Book.print(authors);
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        System.out.println("_____________________________");
        Book [] books ;
        books = Book.getBooksInString("Java");
        Book.print(books);

    }
}
