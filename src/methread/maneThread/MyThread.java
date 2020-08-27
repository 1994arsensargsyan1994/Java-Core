package methread.maneThread;

public class MyThread implements Runnable {
    Thread thread;
    MyThread(String name){
        thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - Start");
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(400);
                System.out.println("By " + thread.getName()+ " count "+ i);
            }
        }catch (InterruptedException ex){
            System.out.println(thread.getName()+ " interrupted");
        }
        System.out.println(thread.getName()+ " Finished");
    }
}
class  MoreThread{
    public static void main(String[] args) {
        System.out.println("Start global Thread");
        MyThread my1 = new MyThread("MoreChild #1");
        MyThread my2 = new MyThread("MoreChild #2");
        MyThread my3 = new MyThread("MoreChild #3");
//        for (int i = 0; i <50 ; i++) {
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            }catch (InterruptedException ex){
//                System.out.println(" interrupted global Thread");
//            }
//        }
//        System.out.println("finished global Thread");

        do {
            for (int i = 0; i <10 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(" interrupted global Thread");
                }
            }
        }while (my1.thread.isAlive() ||     // patoky der katarvum e true ete voch false
                my2.thread.isAlive()||
                 my3.thread.isAlive());
        System.out.println("finished global Thread");
    }
}
