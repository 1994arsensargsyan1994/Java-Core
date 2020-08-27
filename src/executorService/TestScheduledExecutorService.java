package executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i <2 ; i++) {
            System.out.print(i+" ");
            service.schedule(new Runnable() {
                @Override
                public void run() {
                    for (int j = 10; j < 18; j++) {
                        System.out.println(j);
                    }
                }
            },1, TimeUnit.SECONDS);
        }
        System.out.println("________________________________________________");
//        for (int i = 0; i <3 ; i++) {
//            System.out.print(i+" ");
//          service.scheduleAtFixedRate(new Runnable() {
//              @Override
//              public void run() {
//                  for (int j = 4; j <10 ; j++) {
//                      System.out.println(j);
//                  }
//              }
//          },0,1,TimeUnit.SECONDS);
//        }
        for (int i = 0; i <3 ; i++) {
            System.out.print(i+" ");
            service.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    for (int j = 4; j <10 ; j++) {
                        System.out.println(j);
                    }
                }
            },0,1,TimeUnit.SECONDS);
        }
    }

}
