package myJava.util.observable;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Method update call ,count =  "+ (Integer) o);
    }
}
class BeingWatched extends  Observable{
    void counter(int period){
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
class  ObServerDemo{
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();
        observed.addObserver(observing);
        observed.counter(10);

        }
    }