package api;

public class Author {
    public static String [] getAutorsAutor() {
        return authors;
    }
    private static String[] authors = new String[10];
    private static int size= 0;
    String name;
    Book[] array;

    public Author(String name, Book[] array) {
        this.name = name;
        this.array = array;
        authors[size++] = name;
    }
    public  String[] getAuthors(){
        String [] temp = new String[size];
        for (int i = 0; i < size; i++) {
            temp[i] = authors[i];
        }
        return temp;
    }

    public static int getSize() {
        return size;
    }
}
