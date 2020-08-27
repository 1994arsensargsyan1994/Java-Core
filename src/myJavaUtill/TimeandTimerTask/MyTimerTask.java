package myJavaUtill.TimeandTimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Зaдaииe по таймеру выполняется");
    }
}
class TTest{
    public static void main(String[] args) {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();
        timer.schedule(myTimerTask,1000,500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
