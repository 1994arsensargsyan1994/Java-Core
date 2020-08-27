package methread.priority;

public class Priority implements  Runnable {
    int count ;
    Thread thread;
    static  boolean stop = false;
    static String currentName;
    Priority(String name){
        thread = new Thread(this,name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " -Start ");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0){
                currentName = thread.getName();
                System.out.println("By "+ currentName);
            }
        }while (stop == false && count < 100000);
        stop = true;
        System.out.println("\n"+ thread.getName() +" finished");
    }
}
class  TestPriority{
    public static void main(String[] args) {
        Priority pr1 = new Priority("High Priority");
        Priority pr2 = new Priority("Low Priority");
        pr1.thread.setPriority(Thread.NORM_PRIORITY+2);
        pr2.thread.setPriority(Thread.NORM_PRIORITY-2);
        pr1.thread.start();
        pr2.thread.start();
        try {
            pr1.thread.join();
            pr2.thread.join();
        }catch (InterruptedException ex){
            System.out.println(" interrupted global Thread");
        }
        System.out.println("\nCчeтчик потока High Priority: " + pr1.count);
        System.out.println("Cчeтчик потока Low Priority: " + pr2.count);

    }
}
