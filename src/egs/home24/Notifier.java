package egs.home24;

public class Notifier  implements  Runnable{
    final Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
       String name = Thread.currentThread().getName();
       try {
           System.out.println(name + " started");
           Thread.sleep(1000);
           synchronized (msg){
               msg.setMst(name + " notify work done ");
               msg.notify();
           }
           } catch(InterruptedException e){
               e.printStackTrace();
           }
    }
}
