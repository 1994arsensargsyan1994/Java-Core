package multiThreadIng.test;

public class TestYeld {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"MyThread-thread-1");
        thread.start();
        Thread thread1 = new Thread(myRunnable,"MyThread-thread-2");
        thread1.start();
    }
}
