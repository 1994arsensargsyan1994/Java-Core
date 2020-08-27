package methread.waitAndnotify;

public class Q {
    int n;
    boolean valueSet = false;
    synchronized  int get(){
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception in type InterruptedException catched ");
            }
            System.out.println("get :" + n);
            valueSet = false;
            notify();
            return n;
        }
    synchronized void put(int n){
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception in type InterruptedException catched ");
            }
             this.n = n;
        System.out.println("put :"+n);
        valueSet = true;
        notify();
    }
}
