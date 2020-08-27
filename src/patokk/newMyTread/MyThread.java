package patokk.newMyTread;

public class MyThread implements  Runnable{
    Thread thread;
  volatile   boolean suspend;
  volatile   boolean stopped;
  MyThread(String name){
      thread = new Thread(this, name);
      stopped = false;
      suspend = false;
      thread.start();
  }

    @Override
    public void run() {
        System.out.println(thread.getName()+ " - start");
        try {
        for (int i = 0; i <1000 ; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0){
                System.out.println();
                Thread.sleep(250);
        }
            synchronized (this) {
                while (suspend) {
                    wait();
                }
                if (stopped) break;;
            }
        }
            
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " - прерван");
        }
        System.out.println(thread.getName() + " - выход");
    }
    // Остановить поток
    synchronized void  myStop(){
      stopped = true;
      suspend = false;
      notify();
    }
    //Приостановить поток
    synchronized void  mySuspend(){
      suspend = true;
    }
    // Возобновить поток
    synchronized void myResume() {
        suspend = false;
        notify();
    }
}
class Suspend{
    public static void main(String[] args) {
        MyThread o1 = new MyThread("MY THREAD");
        try {
            o1.mySuspend();
            System.out.println("Пpиocтaнoвкa потока");
            Thread.sleep(1000);
            o1.myResume();
            System.out.println("Boзoбнoвлeниe потока");
            Thread.sleep(1000);
            o1.mySuspend();
            System.out.println("Пpиocтaнoвкa потока");
            Thread.sleep(1000);
            o1.myResume();
            System.out.println("Boзoбнoвлeниe потока");
            Thread.sleep(1000);
            o1.mySuspend();
            System.out.println("Ocтaнoвкa потока");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Пpepывaниe основного потока");
        }
        // Ожидать завершения потока
        try {
            o1.thread.join();
        } catch (InterruptedException е) {
            System.out.println("Пpepывaниe основного потока");
            System.out.println("Bыxoд из основного потока");
        }
    }
}
