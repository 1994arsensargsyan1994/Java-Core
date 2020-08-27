package multiThreadIng.test;

public class MyRunnable  implements Runnable{

    @Override
    public void run() {
    Thread thread = Thread.currentThread();
        System.out.println("My Runnable class run method is being executed by:"+thread.getName());
        for (int i = 0; i <10 ; i++) {
            System.out.println("performing task "+i+"by"+thread.getName());
            if (i == 5){
                Thread.yield();
            }
        }
    }
}
