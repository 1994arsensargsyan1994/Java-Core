package TestIng;

public class TestDemoThread  extends Thread{
    public static void main(String[] args) {
        TestDemoThread t = new TestDemoThread();
        t.start();
        System.out.println("oan. ");
        t.start();
        System.out.println("tow. ");
    }
public  void run(){
    System.out.println("Thread");
}
}
