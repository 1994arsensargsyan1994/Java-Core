package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();// zugaher ashxatelu hamar patoknery
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");
service.submit(new Runnable() {
    @Override
    public void run() {
        for (int j = 20; j <25 ; j++) {
            System.out.println(Thread.currentThread().getName()+" "+j);
        }
    }
});
        }
        System.out.println();
    }
}
