package lesson10;

public class LinkedList<E> implements List<E> {
    private int size;
    private Node first;
    private Node last;


    private class Node {
        E data;
        Node next;
        //  TODO

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(E element) {
        size++;
        if (first == null) {
            first = new Node(element);
            last = first;
        } else {
            last.next = new Node(element);
            last = last.next;
        }
    }

    @Override
    public void add(int index, E element) {
        Node newElement = new Node(element);
        size++;
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size" + size);
        }
        if (index == 0) {
            newElement.next = first;
            first = newElement;
        } else {
            Node court = first;
            for (int i = 0; i < index - 1; i++) {
                court = court.next;
            }
            newElement.next = court.next;
            court.next = newElement;
        }
    }

    @Override
    public E set(int index, E element) {
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size" + size);
        }
        Node temp = first;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node temp2 = new Node(element);
        temp2.next = temp.next;
        temp.next = temp2;
        size++;
        return temp2.next.data;
    }

    @Override
    public E get(int index) {
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size" + size);
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp.data;
    }

    @Override
    public void removeOfElement(E element) {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.data.equals(element)) {
                remove(i);
                return;
            }
            temp = temp.next;
        }
    }

    @Override
    public void remove(int index) {
        if (size <= index || index < 0) {
            throw new IndexOutOfBoundsException("Index could not be more then size " + size);
        }
        if (index != 0) {
            Node temp = first;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        } else {
            first = first.next;
            size--;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
