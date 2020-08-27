package Yntaciq.mystring;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyString str = new MyString("Heelo");
        System.out.println(str.lengh());


        ///////////////////////////////////////////////////////
        String hello = "Hello";
        String habr = "habrahabr";
        String delimiter = ", ";

        System.out.println(String.join(delimiter, hello, habr));
    }
}
