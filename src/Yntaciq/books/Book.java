package Yntaciq.books;

import house.House;

import java.util.Calendar;
import java.util.Date;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    private int dataOf;
    private static int size = 0;
    private static int sizeofAuthor = 0;
    private static Book[] books = new Book[10];
    private static Author[] authors = new Author[10];

    public Book(String name, Author author, double price, int dataOf) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.dataOf = dataOf;
        this.qtyInStock = 1;
        authors[sizeofAuthor++] = author;
        add();
    }

    public Book() {
    }

    private void add() {
        if (size == books.length) {
            grow();
        }
        books[size++] = this;
    }

    public Book(String name, Author author, double price, int dataOf, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.dataOf = dataOf;
        this.qtyInStock = qtyInStock;
        authors[sizeofAuthor++] = author;
        add();
    }

    public String getName() {
        return name;
    }

    public int getDataOf() {
        return dataOf;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + this.author+
                ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                ", dataOf=" + dataOf +
                '}';
    }

    private void grow() {
        Book[] temp = new Book[books.length * 3 / 2];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        books = temp;
    }

    public static Author[] getAllAuthors() {
        int sizeOfTemp = 0;
        Author[] temp = new Author[sizeofAuthor];
        for (int i = 0; i < sizeofAuthor; i++) {
                temp[sizeOfTemp++] = authors[i];

            }
        Author [] temp2 = new Author[sizeOfTemp];
        for (int i = 0; i <sizeOfTemp ; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }


    public static Author[] getAuthorsName(String name) {
        int sizeOfTemp = 0;
        Author[] temp = new Author[sizeofAuthor];
        for (int i = 0; i < sizeofAuthor; i++) {
            if (authors[i].getName().equals(name)) {
                temp[sizeOfTemp++] = authors[i];

            }
        }
           Author [] temp2 = new Author[sizeOfTemp];
            for (int i = 0; i <sizeOfTemp ; i++) {
                temp2[i] = temp[i];
            }
            return temp2;
        }
        public  static void print(Object[]array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].toString());
            }
            System.out.println();
        }
        public  static  Book[] getBooksInString(String name){
       int sizeOfTemp = 0;
       Book[] temp = new Book[size];
            for (int i = 0; i <size ; i++) {
                if (books[i].getName().equals(name))
               temp[sizeOfTemp++] = books[i];
            }
            Book[] temp2 = new Book[sizeOfTemp];
            for (int i = 0; i < sizeOfTemp; i++) {
                temp2[i] = temp[i];
            }
        return temp2;
    }
        }


