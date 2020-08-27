package auditorium.lesson8;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) throws CustomException {
        System.out.println("START");

        System.out.println("0123456789".substring(1));
//        MyStream stream = null;
//        try {
//            stream = new MyStream();
//            stream.open();
//            System.out.println(stream);
//            int a = 4 / 0;
//            System.out.println("a = " + a);
//        } catch (IOException e) {
//            if (stream != null) {
//                stream.close();
//            }
//        } finally {
//            System.out.println("In finally block.");
//        }

        try (MyStream stream = new MyStream()) {
            stream.open();
            System.out.println(stream);
            int a = 4 / 4;
            System.out.println("a = " + a);
        } catch (IOException e) {

        } finally {
            System.out.println("In finally block.");
        }

        try {
            long currentTime = getCurrentTime();
            System.out.println(currentTime);
        } catch (Exception e) {
            e.printStackTrace();
            // mik erek es dzev ban, please log the error
        } finally {
            System.out.println("Es inch eghav.");
        }

//        A a = new A();
//        A b = new B();
//
//        a.m1();
//        b.m1();


//        } catch (CustomException | ClassCastException e) {
//            System.out.println(e.getMessage());
//        }

//        int a = 5, b = 10;
//        try {
//            System.out.println(a / b);
//            String s = null;
//            System.out.println(s.substring(1, 2));
//        } catch (ArithmeticException e) {
//            System.out.println("Mik erek et dzev baner!");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//
//        }
        System.out.println("END");
    }

    public static long getCurrentTime() throws CustomException, MyCustomException {
        long currentTimeMillis = System.currentTimeMillis();
        if ((1 & currentTimeMillis) == 1) {
            throw new CustomException("You can not do it because the time is odd.");
//            throw new RuntimeException("You can not do it because the time is odd.");
        } else {
            return currentTimeMillis;
        }
    }

}

class MyStream implements Closeable {

    void open() throws IOException {
        System.out.println("Stream is opened.");
    }

//    @Override
    public void close() {
        System.out.println("Closing the stream!!!");
    }
}

class CustomException extends Exception {
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class MyCustomException extends Exception {
    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

    public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class A {
    void m1() throws Exception {
    }
}

class B extends A {

    void m1() throws MyCustomException {
    }
}
