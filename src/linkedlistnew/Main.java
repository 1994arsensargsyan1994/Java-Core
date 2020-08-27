package linkedlistnew;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(22);
        list.add(98);
        list.set(2,55);
        for (int i = 0; i <list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
