package myCollection;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");
        while (arrayDeque.peek() != null){
            System.out.print(arrayDeque.pop()+" ");
        }
        System.out.println();
    }
}
