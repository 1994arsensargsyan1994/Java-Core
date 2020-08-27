package myCollection.Mmcomarator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        tm.put("Djon Doy", 3432.54);
        tm.put("Tom Smit", -1258.5);
        tm.put("Djain Bayker", 78954.2);
        tm.put("Tod xal", 8954.25);
        tm.put("Ralf xal", 56.58);
        Set <Map.Entry<String,Double>> set = tm.entrySet();
        for (Map.Entry<String,Double>me :set) {
            System.out.print(me.getKey()+ ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }

}
