package executorService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
//Рассмотрим пример использования ExecutorService. В примере создадим фиксированный пул из двух потоков исполнения executor
// и четыре потока. Имплементации потоков в качестве параметра принимают объект синхронизации потоков CountDownLatch,
// так называемую «защелку», и текстовую строку. Сервис executor стартует все 4 потока на исполнение. Таким образом,
// четыре потока должны совместно использовать пул из двух потоков. Первые попавшие в пул потоки приступают к исполнению.
// Оставшие переходят в режим ожидания и вступают в работу по мере освобождения пула.
//«Защелки» CountDownLatch используются для того, чтобы раньше времени «не выскочить» на команду завершения выполнения shutdown.
// Методы защелок await тормозят этот выход, переводя программу в ожидание завершения работы потока. После того,
// как все задачи будут выполнены, пул закрывается и программа завершает свою работу.
//Вызов метода shutdown очень важен. Если его не использовать, то программа не смогла бы завершиться,
// поскольку исполнитель оставался бы активным. В этом можно убедиться, закомментировав вызов метода shutdown.

public class ExecutorServiceExample
{
    SimpleDateFormat     sdf   = null;
    private  final  int  COUNT = 5;

    ExecutorServiceExample()
    {
        sdf = new SimpleDateFormat("HH:mm:ss.S");

        CountDownLatch cdl1 = new CountDownLatch(COUNT);
        CountDownLatch cdl2 = new CountDownLatch(COUNT);
        CountDownLatch cdl3 = new CountDownLatch(COUNT);
        CountDownLatch cdl4 = new CountDownLatch(COUNT);

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");
        executor.execute(new MyThread(cdl1, "Thread.1"));
        executor.execute(new MyThread(cdl2, "Thread.2"));
        executor.execute(new MyThread(cdl3, "Thread.3"));
        executor.execute(new MyThread(cdl4, "Thread.4"));

        try {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch(InterruptedException exc) { }

        executor.shutdown();
        System.out.println("Завершение потоков");
    }
    //-------------------------------------------------
    void printMessage(final String templ)
    {
        String text = sdf.format(new Date())+" : "+templ;
        System.out.println(text);
    }
    //-------------------------------------------------
    class MyThread implements Runnable
    {
        String         name;
        CountDownLatch latch;
        MyThread(CountDownLatch c, String n)
        {
            latch = c;
            name = n;
            new Thread(this);
        }

        public void run()
        {
            try {
                for(int i = 0; i < COUNT; i++) {
                    printMessage(name + " - " + i);
                    latch.countDown();
                    Thread.sleep((long)(Math.random()*1500));
                }
                printMessage(name + " completed");
            } catch (InterruptedException e) {}
        }
    }
    //-------------------------------------------------
    public static void main(String[] args)
    {
        new ExecutorServiceExample();
    }
}