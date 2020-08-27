package executorService;

import java.util.concurrent.*;

public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(new Runnable() {
            public void run() {
                System.out.println("Another thread was executed");
            }
        });
        Future future = service.submit(new Runnable() {
            public void run() {
                System.out.println("Another thread was executed");
            }
        });
        System.out.println(future.get(1, TimeUnit.SECONDS));
        Future future1 = service.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Another thread was executed");
                return "result";
            }
        });
        System.out.println("Result: " + future1.get());
        service.shutdown();
    }
}
