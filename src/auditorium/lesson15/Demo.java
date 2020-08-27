package auditorium.lesson15;

public class Demo {

    public static void main(String[] args) {
        SharedObj obj = new SharedObj();

        new Thread(new MyDemoRunnable(obj), "T1").start();

        new Thread(new MyDemoRunnable(obj), "T2").start();
    }

}

class MyDemoRunnable implements Runnable {

    SharedObj obj;

    public MyDemoRunnable(SharedObj obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        obj.m1();
        for (int i = 0; i < 1000; i++) {
            obj.increment();
        }
    }
}

class SharedObj {
    boolean value;
    volatile int i = 1;

    public synchronized void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i++);
    }

    public synchronized void m1() {
        for (int i = 0; i < 10; i++) {
            String  name = Thread.currentThread().getName();
            System.out.println(name + " " + i);
        }
    }


    public void m2() {

    }

}
