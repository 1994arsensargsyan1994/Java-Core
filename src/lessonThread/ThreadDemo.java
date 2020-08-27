package lessonThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread r = new MyThread();
   Thread t1 = new Thread(r,"T1");
   Thread t2 = new Thread(r,"T2");
   Thread t3 = new Thread(r,"T3");
   t1.start();
  // t2.start();
  // t3.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.setRunning(false);
        System.out.println(Thread.currentThread().getName() + " Running is false ");
    }
}
class MyThread implements  Runnable {
 volatile  boolean isRunning = true;
    volatile int i = 0;

    public void setRunning(boolean running) {
        isRunning = running;
//        System.out.println(Thread.currentThread().getName() + " Running is false ");
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("start thread " + name);
        while (isRunning) {
            System.out.println(name + " -> " + i++);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
        }
        System.out.println(name + " end");
    }
}