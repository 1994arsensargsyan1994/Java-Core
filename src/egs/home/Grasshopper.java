package egs.home;
import java.util.*;
public class Grasshopper {
    public Grasshopper(String n){
        name = n;
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper tow = new Grasshopper("g2");
        one = tow;
        tow = null;
        one = null;
    }
    private  String name;
}
