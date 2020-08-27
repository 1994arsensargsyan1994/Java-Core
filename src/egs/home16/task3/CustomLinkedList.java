package egs.home16.task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList   implements Iterable<String>{

    Node head = null;
    private int size;

    public void addFirst(String e) {
        Node newNode = new Node(e);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(String e) {
        Node newNode = new Node(e);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("error");
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        if (index == size) {
            addLast(element);
            return;
        }

        int x = 0;
        Node current = head;
        while (x < index) {
            current = current.next;
            x++;
        }

        Node newNode = new Node(element);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    public String removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("error");
        }

        String value = head.value;

        head = head.next;
        size--;

        return value;
    }

    public String removeLast() {
        if (head == null) {
            throw new NoSuchElementException("error");
        }

        if (size == 1) {
            return removeFirst();
        }

        Node current = head;
        int x = 0;
        while (x < size - 1) {
            current = current.next;
        }

        String value = current.next.value;

        current.next = null;
        size--;

        return value;
    }

    public String remove(int index) {
        // TODO() add validation
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("error");
        }
        if (index == 1){
          return removeFirst();
        }
        if (index == size){
            return removeLast();
        }

        Node current = head;
        int x = 0;
        while (x < index - 1) {
            current = current.next;
            x++;
        }

        String value = current.next.value;
        current.next = current.next.next;

        return value;
    }


    void f() {
        Node current1 = head;
        Node current2 = head;

        while (current1.next != null) {
            current1 = current1.next;
        }


        while (current2.next != null) {
            current2 = current2.next;
        }


        boolean result = current1 == current2;

        String value = current1.value;
    }

    void  foundLoop(){
        Node current1 = head;
        Node current2 = head;
       int x = 0;
       int y = 0;
        while (current1 != null && current2 != null && current2.next != null){
            current1 = current1.next;
            current2 = current2.next.next;
            if (current1 == current2){
                System.out.println("found loop "+y);
                return;
            }
            x ++;
        }
        System.out.println("not found loop");

    }


    @Override
    public Iterator<String> iterator()  {
        return new MyCustomLinkedListIterator();
    }
    class MyCustomLinkedListIterator implements  Iterator<String>{
    Node current = null;
        @Override
        public boolean hasNext() {
            if (current == null && head != null ){
                return  true;
            }else if (current != null){
                return current.next != null;
            }
            return false;
        }

        @Override
        public String next() {
            if (current == null && head != null){
                current = head;
                return head.value;
            }else  if (current != null){
                current = current.next;
                return current.value;
            }
           throw  new NoSuchElementException();
        }
    }

    static  class Node {
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }
    }

}
