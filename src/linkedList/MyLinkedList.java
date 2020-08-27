package linkedList;

public class
MyLinkedList <T> {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    class Node{
        T data;
        Node next;
        Node prev;
        Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public T pop() {
        return tail.data;
    }


    public T getElement(int index) {
        if(index < 0 || index >= size ) {
            return null;
        }
        Node temp;
        if(index < (size / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        } else {
            int tempIndex = size - index - 1;
            temp = tail;
            for (int i = 0; i < tempIndex ; i++) {
                temp = temp.prev;
            }
        }
        return temp.data;
    }

    public void addElement(T data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
            tail = temp;
            size++;
            return;
        }
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
        size++;
    }


    public void addElement(int index, T data) {
        Node tempT = new Node(data);
        Node temp = null;
        if(index < 0 || index >= size) {
            return;
        }
        if(index < (size / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            int tempIndex = size - index - 1;
            temp = tail;
            for (int i = 0; i < tempIndex ; i++) {
                temp = temp.prev;
            }
        }

        if(temp.prev == null) {
            tempT.next = temp;
            tempT.next.prev = tempT;
            head = tempT;
            size++;
            return;
        }

        tempT.next = temp;
        temp.prev.next = tempT;
        tempT.prev = temp.prev;
        temp.prev = tempT;
        size++;
    }

    public T set(int index, T data) {
        Node tempT = new Node(data);
        Node temp = null;

        if(index < 0 || index >= size) {
            return null;
        }

        if(index < (size / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            int tempIndex = size - index - 1;
            temp = tail;
            for (int i = 0; i < tempIndex ; i++) {
                temp = temp.prev;
            }
        }

        tempT.next = temp.next;
        temp.prev.next = tempT;
        tempT.prev = temp.prev;
        temp.prev = tempT;
        return temp.data;
    }

    public void clearElement(int index) {
        Node temp;
        if(index < 0 || index >= size) {
            return;
        }
        if(index < (size / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            int tempIndex = size - index - 2;
            temp = tail;
            for (int i = 0; i <= tempIndex ; i++) {
                temp = temp.prev;
            }
        }
        if(temp.next == null) {
            temp.prev.next = null;
            tail = temp.prev;
        }
        else if(temp.prev == null) {
            head = temp.next;
            temp.next.prev = null;


        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;


        }
        size--;
    }

    public void clearElement(T data) {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            temp = head.next;
            if(data.equals(temp.data)) {
                break;
            }
        }

        if(temp == null) {
            return;
        }

        if(temp.prev == null) {
            temp.next.prev = null;
            head = temp.next;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }

    public void clearArray() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void replaceElements(int first, int second) {
        if(first < 0 || first >= size || second < 0 || second >= size) {
            return ;
        }
        Node temp1, temp2;
        if(first < (size / 2)) {
            temp1 = head;
            for (int i = 0; i < first; i++) {
                temp1 = temp1.next;
            }
        } else {
            int tempIndex = size - first;
            temp1 = tail;
            for (int i = 0; i < tempIndex ; i++) {
                temp1 = temp1.prev;
            }
        }

        if(second < (size / 2)) {
            temp2 = head;
            for (int i = 0; i < second; i++) {
                temp2 = temp2.next;
            }
        } else {
            int tempIndex = size - second;
            temp2 = tail;
            for (int i = 0; i < tempIndex ; i++) {
                temp2 = temp2.prev;
            }
        }

        T temp = temp1.data;
        temp1.data = temp2.data;
        temp2.data = temp;
    }
}
