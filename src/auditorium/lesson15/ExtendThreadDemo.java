package auditorium.lesson15;

public class ExtendThreadDemo {


    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        String name = main.getName();
        int priority = main.getPriority();

        MyThread myThread = new MyThread("Thread 1");
        System.out.println(myThread.getName() + " state: " + myThread.getState());
        myThread.start();
        System.out.println(myThread.getName() + " state: " + myThread.getState());

        System.out.println("Start thread: " + name);
        System.out.println("Thread " + name + " priority: " + priority);
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " -> " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(main.getName() + " is waiting for "
                    + myThread.getName() + " to finish.");
            myThread.join();
            System.out.println(myThread.getName() + " state: " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stop thread: " + name);
    }

}

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "state: " + Thread.currentThread().getState());
        System.out.println("Start thread: " + name);
        for (int i = 10; i < 20; i++) {
            System.out.println(name + " -> " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stop thread: " + name);
    }
}
