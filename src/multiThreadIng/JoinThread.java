package multiThreadIng;

public class JoinThread extends  Thread{
    String threadName;
    int count;
    JoinThread(String threadName,int count){
        this.threadName = threadName;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count+1; i++) {
            System.out.println("Hello from "+ threadName+ " "+i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(threadName+ " End");
    }
}
class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread staring ");
        Thread oanJoinThread = new JoinThread("A*", 3);
        Thread towJoinThread = new JoinThread("B*", 2);
        Thread nonJoinThread = new JoinThread("C", 5);
        oanJoinThread.start();
        towJoinThread.start();
        nonJoinThread.start();
        oanJoinThread.join();
        oanJoinThread.join();
        System.out.println("Hello from main thread ");
        System.out.println(oanJoinThread.isAlive());
        System.out.println(towJoinThread.isAlive());
        System.out.println(nonJoinThread.isAlive());
        System.out.println("main thread end /");


    }
}
