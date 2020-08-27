package TestIng;

public class TestMyRunable implements  Runnable {

    @Override
    public void run() {
    new Thread(new TestMyRunable()).start();
    }
}
