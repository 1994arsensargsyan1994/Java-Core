package linkedlistnew;

public class LinkedList <E> {
    private Node tail = null;
    private Node head = null;
    private  int size=0;

    class Node{
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
    void add(E element){
        if (tail == null){
            tail = new Node(element);
            head = tail;
            size++;
            return;
        }
        tail.next = new Node(element);
        tail = tail.next;
        size++;
    }
    public void add(int index, E element) {
        Node newElement = new Node(element);
        size++;
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size" + size);
        }
        if (index == 0) {
            newElement.next = head;
            head = newElement;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newElement.next = temp.next;
            temp.next = newElement;
        }
    }
   public E get(int index){
       if (size <= index || index < 0) {
           throw new IndexOutOfBoundsException("Index could not be more then size" + size);
       }
        Node temp = head;
       for (int i = 0; i <index ; i++) {
           temp = temp.next;

       }
       return temp.data;
   }
   public  E set(int index,E element){
       if (size <= index || index < 0) {
           throw new IndexOutOfBoundsException("Index could not be more then size" + size);
       }
        Node temp = head;
       for (int i = 0; i <index-1 ; i++) {
           temp = temp.next;
       }
       Node newElement = new Node(element);
       newElement.next = temp.next;
       temp.next = newElement;
       size++;
       return newElement.next.data;
   }
    public void remove(int index) {
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size " + size);
        }
        if (index != 0) {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }
    public void removeOfElement(E element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
            if (temp.data.equals(element)) {
                remove(i);
            }
        }
    }

    public  int getSize(){
        return  size;
   }
   public  boolean isEmpty(){
        return  size == 0;
    }
    public E pop(){
        return  tail.data;
    }
}
