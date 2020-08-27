package utilParalelism;

import java.util.concurrent.Semaphore;

public class SemapohoreDemo {
    public static void main(String[] args) {
       Semaphore sem = new Semaphore(1);
       new IncThread("A",sem);
       new DecThread("B",sem);
    }
}
class Shared{
    static  int count;
}
class IncThread implements Runnable{
    String name;
    Semaphore sem;
    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread( this).start();
    }

    @Override
    public void run() {
        System.out.println("start thread "+name);
try {
    System.out.println(name+" thread hilt in finish");
    sem.acquire();
    System.out.println(name+"thread get accert ");
    for (int i = 0; i <5 ; i++) {
        Shared.count++;
        System.out.println(name+" :"+ Shared.count);
        Thread.sleep(10);
    }


}catch (InterruptedException e){
    e.printStackTrace();
}
        System.out.println(name + " thread release");
     sem.release();
    }
}
class DecThread implements  Runnable{
    String name;
    Semaphore sem;
    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread( this).start();
    }

    @Override
    public void run() {
        System.out.println("start thread "+name);
        try {
            System.out.println(name+" thread hilt in finish");
            sem.acquire();
            System.out.println(name+"thread get accert ");
            for (int i = 0; i <5 ; i++) {
                Shared.count++;
                System.out.println(name+" :"+ Shared.count);
                Thread.sleep(10);
            }


        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(name + " thread release");
        sem.release();
    }

}
