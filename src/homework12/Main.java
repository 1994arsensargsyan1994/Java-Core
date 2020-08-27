package homework12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> first = new HashMap<>();
        Map<String, String> second = new HashMap<>();
        first.put("kay","A");
        first.put("Omega","Om");
        first.put("Delta","D");
        second.put("kay","A");
        second.put("first","F");
        second.put("Omega","O");
        Map<String,String> result = new HashMap<>();
       result= Demo.getCommonElement(first,second);
        Set<String> strings=result.keySet();
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("_______________________________________");
        result = Demo.getCommonElementAndValue(first,second);
        Set<String> strings1=result.keySet();
        for (String s : strings1) {
            System.out.println(s);
        }
        System.out.println("________________________________");
        Map<String, String> tree = new HashMap<>();
        Map<String, String> fore = new HashMap<>();
        tree.put("A","value");
        tree.put("B","value");
        tree.put("c","value");
        tree.put("D","value");
        tree.put("E","value");
        /////////////////////////////////////
        fore.put("E","value");
        fore.put("o","value");
        fore.put("c","value");
        fore.put("l","value");
        fore.put("j","value");
        Map<String,String> result1 = new HashMap<>();
        result1= Demo.getUniqueElements(tree,fore);
        Set<String> strings2 = result1.keySet();
        for (String s : strings2) {
            System.out.println(s);
        }
        System.out.println("________________________________");
        result1 = Demo.getAllElements(tree,fore);
        Set<String> strings3 = result1.keySet();
        for (String s : strings3) {
            System.out.println(s);
        }
        // testing
        System.out.println("_____________________");
        Map<Integer,String> testFunc = new HashMap<>();
        String oldValue = testFunc.put(1,"Kuku");
        System.out.println(oldValue);
        Set<String> strSet = new HashSet<>();
        String kuk = new String("k");
        String kuk1 = new String("k");
        System.out.println(strSet.add(kuk));
        System.out.println(strSet.add(kuk1));
        String internStr = new String("flor");
        String another = internStr.intern();
        String v = "flor";
        System.out.println(v==another);
        System.out.println(v==internStr);

    }
}
