package Yntaciq.bird;

public class Main {
    public static void main(String[] args) {
        Strauss s = new Strauss();
        Penguin p = new Penguin();
        Bird [] arr = {s,p};
       for (Bird temp: arr){
           temp.move();
       }

    }
}
