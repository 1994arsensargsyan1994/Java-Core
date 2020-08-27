package linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        for (int i = 0; i <list.getSize() ; i++) {
            System.out.println(list.getElement(i));
        }
        list.addElement(0,22);
       list.clearElement(4);
        System.out.println("______________________");
        for (int i = 0; i <list.getSize() ; i++) {
            System.out.println(list.getElement(i));
        }
        list.set(2,0);
        System.out.println("________________________________");
        for (int i = 0; i <list.getSize() ; i++) {
            System.out.println(list.getElement(i));
        }
    }
}
