package methread;

public class MyThread implements  Runnable{
    String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " - run");
        try {
            for (int i = 0; i <10 ; i++) {
Thread.sleep(400);
                System.out.println("by "+ thrdName+ "count - "+i);
            }
        } catch (InterruptedException e) {
            System.out.println(thrdName+ " interrupted");
        }
        System.out.println(thrdName+ " finished");
    }
}
class UsThreads{
    public static void main(String[] args) {
        System.out.println("Start global Thread");
        MyThread mt = new MyThread("Child #1");
        Thread newThread = new Thread(mt);
        newThread.start();
        for (int i = 0; i <50 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(" interrupted global Thread");
            }
        }
      System.out.println("finished global Thread");
    }
}
