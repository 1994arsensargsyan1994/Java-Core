package myCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<String, Double>();
        hashMap.put("Arsen Sargsyan",10.558);
        hashMap.put("Grigor qocharyan",12.58);
        hashMap.put("Hayk Aslikyan",6.7);
        hashMap.put("Vardan Hakobyan",87.54);
        Set<Map.Entry<String ,Double>> set = hashMap.entrySet();
        for (Map.Entry<String,Double> me:set) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double  balanc = hashMap.get("Arsen Sargsyan");
        hashMap.put("Arsen Sargsyan",balanc+1000);
        System.out.println("new balanc Arsen sargsyan"+hashMap.get("Arsen Sargsyan"));
    }
}
