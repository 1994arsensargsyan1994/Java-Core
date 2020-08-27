package auditorium.lesson15;

public class RunnableDemo {


    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        Thread t3 = new Thread(r, "T3");

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
//        t2.start();
//        t3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        r.isRunning = false;
        r.setRunning(false);

        System.out.println(Thread.currentThread().getName() + " Running is false");


//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("END " + Thread.currentThread().getName());

    }

}

class MyRunnable implements Runnable {

    boolean isRunning = true;
    volatile int i = 0;

    public void setRunning(boolean running) {
        isRunning = running;
        System.out.println(Thread.currentThread().getName() + " Running is false");
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Start thread: " + name);
        while (isRunning) {
//        for (int j = 0; j < 100; j++) {
            System.out.println(name + " -> " + i++);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("Stop thread: " + name);
    }
}
