package egs.home24;

public class Main {
    public static void main(String[] args) {
        Message msg = new Message("process i");
        Waiter waiter = new Waiter(msg);
        Notifier notifier = new Notifier(msg);
        Thread w1 = new Thread(waiter,"waiter1");
        Thread w2 = new Thread(waiter,"waiter2");
        Thread n1= new Thread(notifier,"notifier");
        w1.start();
        w2.start();
        n1.start();
        System.out.println("All the threads are started");

    }

}
