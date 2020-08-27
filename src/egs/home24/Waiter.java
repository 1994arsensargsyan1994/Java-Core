package egs.home24;

public class Waiter  implements Runnable{
    final Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            try {
                System.out.println(name + " waiting to get notified at time:" +
                        System.currentTimeMillis());
                //msg.wait(5000);
            }catch (IllegalMonitorStateException e){
                e.printStackTrace();
            }
            System.out.println(" waiter thread got notified at time:"+System.currentTimeMillis());
            System.out.println("_passed "+ msg.getMst());
        }
    }
}
