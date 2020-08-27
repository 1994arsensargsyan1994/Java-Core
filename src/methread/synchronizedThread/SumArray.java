package methread.synchronizedThread;

public class SumArray {
    private int sum;

   synchronized int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Teкyщee значение суммы для " +
                    Thread.currentThread() .getName() +": "+sum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Пpepывaниe основного потока");
            }
        }
        return sum;
    }
}
class MyThread implements  Runnable{
    Thread thread;
    static  SumArray su = new SumArray();
    int [] a;
    int answer;
MyThread(String name,int nums[]){
    thread = new Thread(this,name);
    a = nums;
    thread.start();
}
    @Override
    public void run() {
  int sum;
        System.out.println(thread.getName()+ " - start");
        answer = su.sumArray(a);
        System.out.println("CYММA для " + thread.getName() +
                ": " + answer);
        System.out.println(thread.getName() + " - завершение");
    }
}
class Sync {
    public static void main(String args[]) {
        int а[] = {1, 2, 3, 4, 5};
        MyThread m1 = new MyThread("Child #1", а);
        MyThread m2 = new MyThread("Child #2", а);
    }
}

