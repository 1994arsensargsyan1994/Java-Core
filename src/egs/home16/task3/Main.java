package egs.home16.task3;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.addFirst("A");
        linkedList.addFirst("B");
        linkedList.addFirst("C");
        linkedList.addFirst("D");
        linkedList.addFirst("F");
        linkedList.addFirst("G");
        linkedList.head.next.next.next.next.next.next = linkedList.head.next;
        linkedList.foundLoop();

    }

}
