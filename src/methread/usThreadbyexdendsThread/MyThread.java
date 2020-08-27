package methread.usThreadbyexdendsThread;

import methread.ImprovMyThread;

public class MyThread extends  Thread {
    MyThread(String name ){
        super(name);
        start();
    }
    @Override
public  void run(){
        System.out.println(getName() + " Start");
        try {
            for (int i = 0; i < 10; i++) {
               Thread.sleep(400);
                System.out.println("By " +getName()   + "count - "+i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName()+ " interrupted");
        }
        System.out.println(getName()+ " finished");
    }
}
class UsThread{
    public static void main(String[] args) {
        MyThread myThread = new MyThread("ExtendsChild #1 ");
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
