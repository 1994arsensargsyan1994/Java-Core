package auditorium.lesson10;

public class LinkedList<E> implements List<E> {

    private int size;
    private Node first;
    private Node last;

    private class Node {
        E data;
        Node next;
//        TODO implement later please
//        Node<E> previous;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }


    public static class Nested {

    }

    public class Inner {
        public Inner() {
            System.out.println(size);
        }
    }

    @Override
    public void add(E element) {
        size++;
        Node newElement = new Node(element);
        if (first == null) {
            first = newElement;
            last = newElement;
        } else {
            last.next = newElement;
            last = last.next;
        }
    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index should be between 0 and " + size);
        }

        Node newElement = new Node(element);
        size++;
        if (index == 0) {
            newElement.next = first;
            first = newElement;
        } else {
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newElement.next = current.next;
            current.next = newElement;
        }
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E get(int index) {
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index should be between 0 and " + size);
        }
        Node tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    @Override
    public void remove(E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}