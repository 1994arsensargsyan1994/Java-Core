package patokk.tictock;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.println("tick");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
            wait();
        } catch (InterruptedException e) {
            System.out.println("Пpepывaниe потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // остановить часы
            state = "tocked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked"))
            wait();
        } catch (InterruptedException e) {
            System.out.println("Пpepывaниe потока");
        }
        }
    }
class MyThread implements  Runnable{
    Thread thrd;
    TickTock ttOb;
    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }
    @Override
    public void run() {
if (thrd.getName().compareTo("Tick")==0){
    for (int i = 0; i <5 ; i++) {
ttOb.tick(true);
    }
    ttOb.tick(false);
}
else {
    for (int i = 0; i < 5; i++) {
ttOb.tock(true);
    }
    ttOb.tock(false);
}
    }
}
class ThreadCorn{
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread m1 = new MyThread("Tick",tt);
        MyThread m2 = new MyThread("Tock",tt);
        try {
            m1.thrd.join();
            m2.thrd.join();
        } catch (InterruptedException e) {
           System.out.println("Пpepывaниe основного потока");
        }

    }
}
