package utilParalelism.exchanger;

import java.util.concurrent.Exchanger;

public class ExgDemo  {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new UseString(ex);
        new MakeString(ex);
    }
}
class MakeString implements Runnable{
    String str;
    Exchanger<String>ex;
    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(this).start();
    }
    @Override
public  void run(){
char c = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                str += (char) c++;
            }
            try {
               str= ex.exchange(str);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        }
}
class UseString implements Runnable {
    String str;
    Exchanger<String> ex;
    UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("get thread "+str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
