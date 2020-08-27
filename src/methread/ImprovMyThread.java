package methread;

public class ImprovMyThread implements Runnable {
    Thread thread;
     ImprovMyThread(String name){
         thread = new Thread(this,name);
         thread.start();
     }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - run");
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(400);
                System.out.println("by "+ thread.getName()
                        + "count - "+i);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName()+ " interrupted");
        }
        System.out.println(thread.getName()+ " finished");
    }
}
class ImpruvUsThread{
    public static void main(String[] args) {
        ImprovMyThread improvMyThread = new ImprovMyThread("NewChild #1 ");
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
