package methread.waitAndnotify;

public class Test {
    public static void main(String[] args) {
        Q q =new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("by stop clic Ctrl c");

    }
}
