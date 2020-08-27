package myCollection.Mmcomarator.MythenComparing;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        int i, j;
        i = s.lastIndexOf(' ');
        j = t1.lastIndexOf(' ');
        return s.substring(i).compareToIgnoreCase(t1.substring(j));
    }
}

class CompFirstName implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return s.compareToIgnoreCase(t1);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLast = new CompLastNames();
        Comparator<String> compLastThenFirstName = compLast.thenComparing(new CompFirstName());
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirstName);
        tm.put("Djon Doy", 3432.54);
        tm.put("Tom Smit", -1258.5);
        tm.put("Djain Bayker", 78954.2);
        tm.put("Tod xal", 8954.25);
        tm.put("Ralf xal", 56.58);
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balanc = tm.get("Djon Doy");
        tm.put("pjon Doy", balanc + 1000);
        System.out.println("new Djon Doy balanc " + tm.get("Djon Doy"));
        System.out.println("new  balanc " + tm.get("pjon Doy"));
        System.out.println("________________________");
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}