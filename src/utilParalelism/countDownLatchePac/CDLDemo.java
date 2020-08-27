package utilParalelism.countDownLatchePac;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
    CountDownLatch cd =new CountDownLatch(5);
        System.out.println("Start thread ");
    new MyThread(cd);
    try {
        cd.await();
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("finished thread run :");
    }
}
class  MyThread implements  Runnable{
CountDownLatch ct;

    public MyThread(CountDownLatch ct) {
        this.ct = ct;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
            ct.countDown();
        }
    }
}
