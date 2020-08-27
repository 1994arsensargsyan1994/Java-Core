package multiThreadIng.work;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyThread implements Runnable {
    StringBuilder sb = new StringBuilder();
    String s = "";
    Main.CallBack callBack;
    MyThread(Main.CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void run() {
        int i;
        File file = new File("/home/arsen/Desktop/fileiscopy .txt");
        try (InputStream fin = Files.newInputStream(Paths.get("/home/arsen/Desktop/fileiscopy .txt"))) {
            do {
                i = fin.read();
                if (i != -1) {
                    sb.append((char) i);
                }
            } while (i != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }
        callBack.callingBack(sb.toString());
    }
}

class Main {
    public static void main(String[] args) {
        MyThread my = new MyThread(new CallBack() {
            @Override
            public void callingBack(String str) {
                System.out.println(str);
            }
        });

            Thread a = new Thread(my);
        a.start();

}

interface CallBack {
    void callingBack(String str);
}
}
